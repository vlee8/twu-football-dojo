
public class Fan {

    private String fanType;

    public Fan(String fanType) {
        this.fanType = fanType;
    }

    public String reacts(String teamName) {

        if (fanType.equals(teamName)) {
            return "Yay";
        }
        return "Boo";
    }
}
