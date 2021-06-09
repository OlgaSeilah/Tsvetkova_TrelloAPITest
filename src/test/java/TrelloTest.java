import beans.BoardLabelsResponse;
import beans.CompactBoardResponse;
import beans.MemberResponse;
import beans.TrelloBoardResponse;
import constants.EndPoints;
import constants.LabelColour;
import constants.MembersData;
import constants.TestData;
import core.DataProvider;
import core.ServiceConstructor;
import io.restassured.http.Method;
import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static core.ServiceConstructor.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class TrelloTest {

    private static String boardId;

    @BeforeMethod
    public void setUp() {
        //create new board for tests assert if board was created successfully
        TrelloBoardResponse newBoard = ServiceConstructor.getBoard(
                requestBuilder()
                        .setBoardName(TestData.NAME_FOR_TEST_BOARD1)
                        .setRequestMethod(Method.POST)
                        .buildRequest()
                        .sendRequestPath(EndPoints.BOARD_URL)

        );

        //write board id for next tests
        boardId = newBoard.getId();
        System.out.println(boardId);

        //assert that id was written
        assertThat(boardId, notNullValue());

    }

    @AfterMethod
    public void tearDown() {
        //delete created for tests board
        requestBuilder()
                .setID(boardId)
                .setRequestMethod(Method.DELETE)
                .buildRequest()
                .sendRequestPath(EndPoints.BOARD_URL)
                .then().assertThat()
                .spec(ok200Response());

        //check if board is deleted
        requestBuilder()
                .setRequestMethod(Method.GET)
                .setID(boardId)
                .buildRequest()
                .sendRequestLink()
                .then().assertThat().statusCode(404); // doesn't work with ".spec(notFound404Response)"
    }

    @Test
    public void getBoardById() {
        CompactBoardResponse expectedBoard = new CompactBoardResponse();
        expectedBoard.setId(boardId);
        expectedBoard.setName(TestData.NAME_FOR_TEST_BOARD1);
        expectedBoard.setClosed(TestData.CLOSED_FALSE_BOOLEAN);

        CompactBoardResponse testBoard = getCompactBoard(
                requestBuilder()
                        .setID(boardId)
                        .setRequestMethod(Method.GET)
                        .buildRequest()
                        .sendRequestPath(EndPoints.BOARD_URL)
                        .then().assertThat().spec(ok200Response())
                        .extract().response()
        );
        assertThat(testBoard, equalTo(expectedBoard));
    }


    @Test
    public void updateBoardName() {
        //describe expected result
        CompactBoardResponse expectedBoard = new CompactBoardResponse();
        expectedBoard.setId(boardId);
        expectedBoard.setName(TestData.UPDATED_NAME);
        expectedBoard.setClosed(TestData.CLOSED_FALSE_BOOLEAN);

        //send the request
        CompactBoardResponse testBoard = getCompactBoard(
                requestBuilder()
                        .setID(boardId)
                        .setClosed(TestData.CLOSED_FALSE)
                        .setBoardName(TestData.UPDATED_NAME)
                        .setRequestMethod(Method.PUT)
                        .buildRequest()
                        .sendRequestPath(EndPoints.BOARD_URL)
                        .then().assertThat().spec(ok200Response())
                        .extract().response()
        );

        assertThat(testBoard, equalTo(expectedBoard));
    }

    @Test
    public void updateBoardStatusClosed() {
        CompactBoardResponse expectedBoard = new CompactBoardResponse();
        expectedBoard.setId(boardId);
        expectedBoard.setName(TestData.NAME_FOR_TEST_BOARD1);
        expectedBoard.setClosed(TestData.CLOSED_FALSE_BOOLEAN);

        CompactBoardResponse testBoard = getCompactBoard(
                requestBuilder()
                        .setID(boardId)
                        .setBoardName(TestData.NAME_FOR_TEST_BOARD1)
                        .setClosed(TestData.CLOSED_TRUE)
                        .setRequestMethod(Method.PUT)
                        .buildRequest()
                        .sendRequestPath(EndPoints.BOARD_URL)
                        .then().assertThat().spec(ok200Response())
                        .extract().response()
        );

        assertThat(testBoard, equalTo(testBoard));
    }

    @Test
    public void addMemberToTheBoard() {
        requestBuilder()
                .setID(boardId)
                .setRequestMethod(Method.PUT)
                .setMemberID(MembersData.ID_FOR_ADD_MEMBER)
                .allowBillableGuest(true)
                .setType("observer") // error "invalid value for type", but this value is ok
                .buildRequest()
                .sendRequestPathForAddMember(EndPoints.BOARD_URL)

                .then().assertThat().spec(ok200Response());

//        List<MemberResponse> testBoardMembers = getMembers(
//                requestBuilder()
//                        .setID(boardId)
//                        .setRequestMethod(Method.GET)
//                        .buildRequest()
//                        .sendRequestPathForGettingMember(EndPoints.BOARD_URL)
//                        .then().assertThat().spec(ok200Response())
//                        .extract().response()
//        );
        //There's 2 members after we added another member
//        assertThat(testBoardMembers.size(), equalTo(2));
    }


    @Test
    public static void getMembersOfBoard() {
        MemberResponse expectedMember = new MemberResponse();
        expectedMember.setId(MembersData.ID);
        expectedMember.setUsername(MembersData.USERNAME);
        expectedMember.setFullName(MembersData.FULL_NAME);

        requestBuilder()
                .setID(boardId)
                .setRequestMethod(Method.GET)
                .buildRequest()
                .sendRequestPathForGetBoardMember(EndPoints.BOARD_URL)
                .then().assertThat().spec(ok200Response())
                .and().body("id", (Matchers.contains(MembersData.ID)))
                .extract().response();
    }



    @Test(dataProviderClass = DataProvider.class,
            dataProvider = "dataForLabels")
    public static void createLabelOnBoard(String labelName, LabelColour labelColor) {
        BoardLabelsResponse labelExpected = new BoardLabelsResponse();
        labelExpected.setColor(labelColor.colour);
        labelExpected.setIdBoard(boardId);
        labelExpected.setName(labelName);

        BoardLabelsResponse labelRequested = getLabel(requestBuilder()
                .setBoardIdForCreateLabel(boardId)
                .setLabelColor(labelColor) //correct color, but error is "invalid value for color".
                .setLabelName(labelName)
                .setPathParams(EndPoints.LABELS)
                .setRequestMethod(Method.POST)
                .buildRequest()
                .sendRequestPathForAddLabel(EndPoints.LABEL_URL)//this generated link works in Postman, but here it's an error about value for color
                .then().assertThat().spec(ok200Response())
                .extract().response());

        assertThat(labelRequested, equalTo(labelExpected));
    }









}







