public class Player {
    private int hackingLevel;
    private double money;
    private Server currentServer;

    public Player() {
        this.hackingLevel = 1;
        this.money = 0.0;
        this.currentServer = null;
    }

    public int getHackingLevel() {
        return hackingLevel;
    }

    public double getMoney() {
        return money;
    }

    public Server getCurrentServer() {
        return currentServer;
    }

    public void setMoney(double amount) {
        this.money = amount;
    }

    public void setHackingLevel(int level) {
        this.hackingLevel = level;
    }

    public void setCurrentServer(Server s) {
        this.currentServer = s;
    }
}
