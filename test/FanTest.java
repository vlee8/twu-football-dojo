import org.junit.Test;

import static org.junit.Assert.*;

public class FanTest {

    @Test
    public void shouldReactPositivelyForFanAWhenTeamAScores() throws Exception {
        Fan fanA = new Fan("A");
        assertEquals("Yay", fanA.reacts("A"));
    }

    @Test
    public void shouldReactNegativelyForFanAWhenTeamBScores() throws Exception {
        Fan fanA = new Fan("A");
        assertEquals("Boo", fanA.reacts("B"));
    }

    @Test
    public void shouldReactPositivelyForFanBWhenTeamBScores() throws Exception {
        Fan fanB = new Fan("B");
        assertEquals("Yay", fanB.reacts("B"));
    }

    @Test
    public void shouldReactNegativelyForFanBWhenTeamAScores() throws Exception {
        Fan fanB = new Fan("B");
        assertEquals("Boo", fanB.reacts("A"));
    }

}