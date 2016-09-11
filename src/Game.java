
public class Game {

    private Reporter reporter;
    private Fan fanA;
    private Fan fanB;

    public void scored(String teamName) {

        reporter.reacts();
        fanA.reacts(teamName);
        fanB.reacts(teamName);
    }

    public void registerReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public void registerFanA(Fan fanA) {
        this.fanA = fanA;
    }

    public void registerFanB(Fan fanB) {
        this.fanB = fanB;
    }
}
