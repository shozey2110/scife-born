import java.util.ArrayList;

public class Server {
    private String name;
    private int hackingLevelRequired;
    private double moneyAvailable;
    private boolean hacked;
    
    private ArrayList<Server> connections = new ArrayList<>();
    
    public Server(String name, int hackingLevelRequired, double moneyAvailable) {
        this.name = name;
        this.hackingLevelRequired = hackingLevelRequired;
        this.moneyAvailable = moneyAvailable;
        this.hacked = false; // Default state is not hacked
    }

    public String getName() {
        return name;
    }

    public int getHackingLevelRequired() {
        return hackingLevelRequired;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public boolean isHacked() {
        return hacked;
    }
}
