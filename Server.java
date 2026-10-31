public class Server {
    public String name;
    public int hackingLevelRequired;
    public double moneyAvailable;
    public boolean hacked;

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
