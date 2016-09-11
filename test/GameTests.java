import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTests {

    private Game game;
    private Reporter reporter;
    private Fan fanA;
    private Fan fanB;

    @Before
    public void setUp() throws Exception {

        game = new Game();
        reporter = mock(Reporter.class);
        game.registerReporter(reporter);
        fanA = mock(Fan.class);
        fanB = mock(Fan.class);
        game.registerFanA(fanA);
        game.registerFanB(fanB);
    }

    @Test
    public void shouldReporterReactWhenGoalIsScored() throws Exception {
        game.scored("A");
        verify(reporter, times(1)).reacts();
    }

    @Test
    public void shouldFanReactWhenGoalFromTeamAIsScored() throws Exception {
        game.scored("A");
        verify(fanA, times(1)).reacts("A");
        verify(fanB, times(1)).reacts("A");
    }

    @Test
    public void shouldFanReactWhenGoalFromTeamBIsScored() throws Exception {
        game.scored("B");
        verify(fanA, times(1)).reacts("B");
        verify(fanB, times(1)).reacts("B");
    }
}
