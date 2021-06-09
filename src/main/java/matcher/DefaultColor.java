package matcher;

import beans.BoardLabelsResponse;
import constants.LabelColour;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;


import java.util.Set;

public class DefaultColor extends TypeSafeMatcher<BoardLabelsResponse> {

    private BoardLabelsResponse label;

    @Override
    protected boolean matchesSafely(BoardLabelsResponse label) {


        Set<String> defaultColorSet = Set.of(LabelColour.green.colour, LabelColour.YELLOW.colour,
                LabelColour.ORANGE.colour, LabelColour.RED.colour,
                LabelColour.PURPLE.colour, LabelColour.BLUE.colour);


        if (defaultColorSet.contains(label.getColor())) {
            return true;
        }
        return false;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("one of default Colors");
    }

    public static Matcher<BoardLabelsResponse> defaultColor() {
        return new DefaultColor();
    }
}
