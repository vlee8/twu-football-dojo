import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReporterTest {

    @Test
    public void shouldReactValidlyForReporterWhenTeamScores() throws Exception {
        Reporter reporter = new Reporter();
        assertEquals("Nice", reporter.reacts());
    }
}