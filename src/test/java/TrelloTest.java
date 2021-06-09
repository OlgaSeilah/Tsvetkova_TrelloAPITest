import beans.CompactBoardResponse;
import beans.MemberResponse;
import beans.TrelloBoardResponse;
import constants.EndPoints;
import constants.MembersData;
import constants.TestData;
import constants.UserRights;
import core.DataProvider;
import io.restassured.http.Method;
import org.testng.annotations.*;

import java.util.List;

import static core.ServiceConstructor.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class TrelloTest {

    private static String boardId;

    @BeforeMethod
    public void setUp() {
        //create new board for tests
        TrelloBoardResponse newBoard = getBoard(
                requestBuilder()
                        .setBoardName(TestData.NAME_FOR_TEST_BOARD1)
                        .setRequestMethod(Method.POST)
                        .buildRequest()
                        .sendRequestPath(EndPoints.BOARD_URL)
        );

        //write board id for next tests
        boardId = newBoard.getId();
        System.out.println(boardId);

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
//                .statusCode(200); //may use one of this

        //check if board is deleted
        requestBuilder()
                .setRequestMethod(Method.GET)
                .setID(boardId)
                .buildRequest()
                .sendRequestPath(EndPoints.BOARD_URL)
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

    @Test (dataProviderClass = DataProvider.class,
    dataProvider = "dataForUserRights")
    public void addMemberToTheBoard(UserRights userRights) {
        requestBuilder()
                .setID(boardId)
                .setRequestMethod(Method.PUT)
                .setMemberID(MembersData.ID_FOR_ADD_MEMBER)
                .setType(userRights)
                .buildRequest().sendRequestPathForAddMember(EndPoints.BOARD_URL)
                .then().assertThat().spec(ok200Response());

        List<MemberResponse> testBoardMembers = getMembers(
                requestBuilder()
                        .setID(boardId)
                        .setRequestMethod(Method.GET)
                        .buildRequest().sendRequestPathForGettingMember(EndPoints.BOARD_URL)
                        .then().assertThat().spec(ok200Response())
                        .extract().response()
        );
        //There's 2 members after we added another member
        assertThat(testBoardMembers.size(), equalTo(2));
    }



}







