package core;

import constants.TestData;
import constants.UserRights;

import static constants.BgColors.*;

public class DataProvider {


    @org.testng.annotations.DataProvider
    public Object[][] dataForBackgroundColors() {
        return new Object[][]{
                {TestData.BACKGROUND_COLOR + "#D29034",ORANGE},
                {TestData.BACKGROUND_COLOR + "#519839",GREEN},
                {TestData.BACKGROUND_COLOR + "#838C91",GRAY},
                {TestData.BACKGROUND_COLOR + "#B04632",RED},

        };
    }

    @org.testng.annotations.DataProvider
    public Object[][] dataForUserRights() {
        return new Object[][]{
                {UserRights.ADMIN},
                {UserRights.NORMAL},
                {UserRights.OBSERVER},

        };
    }
}
