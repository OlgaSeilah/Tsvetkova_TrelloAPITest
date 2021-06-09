package core;

import constants.TestData;
import constants.UserRights;

import static constants.LabelColour.*;
import static constants.LabelColour.BLUE;
import static constants.LabelColour.green;
import static constants.LabelColour.ORANGE;
import static constants.LabelColour.RED;

public class DataProvider {

    @org.testng.annotations.DataProvider
    public Object[][] dataForUserRights() {
        return new Object[][]{
                {UserRights.ADMIN},
                {UserRights.NORMAL},
                {UserRights.OBSERVER},

        };
    }

    @org.testng.annotations.DataProvider
    public Object[][] dataForLabels() {
        return new Object[][]{
                {TestData.TEST_LABEL + "1", green},
                {TestData.TEST_LABEL + "2",YELLOW},
                {TestData.TEST_LABEL + "3",ORANGE},
                {TestData.TEST_LABEL + "4",RED},
                {TestData.TEST_LABEL + "5",PURPLE},
                {TestData.TEST_LABEL + "6",BLUE},
        };
    }
}
