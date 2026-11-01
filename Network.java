import java.util.ArrayList;

public class Network {
    private ArrayList<Server> allServers = new ArrayList<>();
    private Server homeServer;

    public Network() {
        homeServer = new Server("home", 0, 0);
        allServers.add(homeServer);
    }

    public void addServer(Server s) {
        allServers.add(s);
    }

    public Server findServerByName(String name) {
        for (Server server : allServers) {
            if (server.getName().equals(name)) {
                return server;
            }
        }
        return null;
    }

    public ArrayList<Server> getAllServers() {
        return allServers;
    }

    public Server getHomeServer() {
        return homeServer;
    }
}
