package core;

import beans.BoardLabelsResponse;
import beans.CompactBoardResponse;
import beans.MemberResponse;
import beans.TrelloBoardResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constants.LabelColour;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import utils.GetDataFromProperties;

import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ServiceConstructor {
    private static final String API_TRELLO_COM = GetDataFromProperties
            .getProperties().getProperty("host");
    private final Method requestMethod;
    private final Map<String, String> parameters;
    private Map<String, String> pathParams;

    public static final URI TRELLO_BOARD_URL = URI.create(GetDataFromProperties
            .getProperties().getProperty("boards_url"));


    public ServiceConstructor (Method requestMethod, Map<String, String> parameters, Map<String, String> pathParams) {
        this.requestMethod = requestMethod;
        this.parameters = parameters;
        this.pathParams = pathParams;
    }

    public static ApiRequestBuilder requestBuilder() {
        return new ApiRequestBuilder();
    }


    public static class ApiRequestBuilder {
        private final Map<String, String> parameters = new HashMap<>();
        private Method requestMethod = Method.GET;
        private Map<String, String> pathParams = new LinkedHashMap<>();

        public ApiRequestBuilder() {
            parameters.put("key", GetDataFromProperties.getProperties().getProperty("key"));
            parameters.put("token", GetDataFromProperties.getProperties().getProperty("token"));
        }

        public ApiRequestBuilder setRequestMethod(Method requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public ApiRequestBuilder setPathParams(String field) {
            pathParams.put("field", field);
            return this;
        }

        public ApiRequestBuilder setBoardName(String name) {
            parameters.put("name", name);
            return this;
        }

        public ApiRequestBuilder setID(String id) {
            parameters.put("board_id", id);
            return this;
        }
        public ApiRequestBuilder setBoardIdForCreateLabel(String id) {
            parameters.put("idBoard", id);
            return this;
        }

        public ApiRequestBuilder setUsername(String username) {
            parameters.put("username", username);
            return this;
        }

        public ApiRequestBuilder setFullname(String fullname) {
            parameters.put("fullname", fullname);
            return this;
        }


        public ApiRequestBuilder setClosed(String closed) {
            parameters.put("closed", closed);
            return this;
        }

        public ApiRequestBuilder setMemberID(String memberId) {
            parameters.put("memberId", memberId);
            return this;
        }

        public ApiRequestBuilder allowBillableGuest(Boolean permission) {
            parameters.put("allowBillableGuest", permission.toString());
            return this;
        }

        public ApiRequestBuilder setType(String type) {
            parameters.put("type", type);
            return this;
        }


        public ApiRequestBuilder setLabelColor(LabelColour color) {
            parameters.put("color", color.colour);
            return this;
        }


        public ApiRequestBuilder setLabelName(String name) {
            parameters.put("name", name);
            return this;
        }


        public ServiceConstructor buildRequest() {
            return new ServiceConstructor(requestMethod, parameters, pathParams);
        }


    }

    public Response sendRequestLink() {
        String pathStr = "";
        for (String key : pathParams.keySet()) {
            pathStr += "{" + key + "}/";
        }
        return RestAssured
                .given(requestSpecification())
                .pathParams(pathParams)
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, pathStr)
                .prettyPeek();
    }



    public Response sendRequestPathForDelMember(String buildUrl) {
        String m = API_TRELLO_COM + buildUrl
                + parameters.get("board_id")
                + "/members/"
                + parameters.get("memberId")
                + "?key=" + parameters.get("key")
                + "&token=" + parameters.get("token")
                + "&type=" + "admin";

        return RestAssured
                .given(requestSpecification())
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, m)
                .prettyPeek();
    }

    public Response sendRequestPathForAddLabel(String buildUrl) {
        String m = API_TRELLO_COM + buildUrl
                + "?key=" + parameters.get("key")
                + "&token=" + parameters.get("token")
                + "&name=" + parameters.get("name")
                + "&color=" + parameters.get("color")
                + "&idBoard=" + parameters.get("idBoard");

        return RestAssured
                .given(requestSpecification())
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, m)
                .prettyPeek();
    }

    public Response sendRequestPathForGetBoardMember(String buildUrl) {
        String m = API_TRELLO_COM + buildUrl
                + parameters.get("board_id")
                + "/members";

        return RestAssured
                .given(requestSpecification())
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, m)
                .prettyPeek();
    }


    public Response sendRequestPathForAddMember(String buildUrl) {
        String m = API_TRELLO_COM + buildUrl
                + parameters.get("board_id")
                + "/members/"
                + parameters.get("memberId")
                + "?key=" + parameters.get("key")
                + "&token=" + parameters.get("token")
                + "&type=" + parameters.get("type");

        return RestAssured
                .given(requestSpecification())
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, m)
                .prettyPeek();
    }

    public Response sendRequestPathForGettingMember(String buildUrl) {
        String m = API_TRELLO_COM + buildUrl
                +parameters.get("board_id")+
                "/members";

        return RestAssured
                .given(requestSpecification())
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, m)
                .prettyPeek();
    }

    public Response sendRequestPath(String buildUrl) {
        String createPath = API_TRELLO_COM + buildUrl
                + "?key=" + parameters.get("key")
                + "&token=" + parameters.get("token");

        if (parameters.get("board_id") != null)
            createPath = API_TRELLO_COM + buildUrl
                    + parameters.get("board_id")
                    + "?key=" + parameters.get("key")
                    + "&token=" + parameters.get("token");

        return RestAssured
                .given(requestSpecification())
                .queryParams(parameters)
                .log().all()
                .request(requestMethod, createPath)
                .prettyPeek();
    }


    public static RequestSpecification requestSpecification() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .setBaseUri(TRELLO_BOARD_URL)
                .build();
    }

    public static TrelloBoardResponse getBoard(Response response) {
        TrelloBoardResponse fromJson = new Gson()
                .fromJson(response.asString().trim(), new TypeToken<TrelloBoardResponse>() {
                }.getType());
        return fromJson;
    }

    public static CompactBoardResponse getCompactBoard(Response response) {
        CompactBoardResponse fromJson = new Gson()
                .fromJson(response.asString().trim(), new TypeToken<CompactBoardResponse>() {
                }.getType());
        return fromJson;
    }

    public static List<MemberResponse> getMembers(Response response) {
        List<MemberResponse> fromJson = new Gson()
                .fromJson(response.asString().trim(), new TypeToken<List<MemberResponse>>() {
                }.getType());
        return fromJson;
    }

    public static BoardLabelsResponse getLabel(Response response) {
        BoardLabelsResponse fromJson = new Gson()
                .fromJson(response.asString().trim(), new TypeToken<BoardLabelsResponse>() {
                }.getType());
        return fromJson;
    }

    public static ResponseSpecification ok200Response() {
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(HttpStatus.SC_OK)
                .build();
    }

    public static ResponseSpecification notFound404Response() {
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(HttpStatus.SC_NOT_FOUND)
                .build();
    }





}
