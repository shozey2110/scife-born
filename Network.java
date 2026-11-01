import java.util.ArrayList;

public class Network {
    private ArrayList<Server> allServers = new ArrayList<>();
    private Server homeServer;

    public Network() {
        homeServer = new Server("home", 0, 0);
        allServers.add(homeServer);
        
        Server noodles = new Server("n00dles", 1, 500);
        Server foodnstuff = new Server("foodnstuff", 1, 1000);
        Server sigmaCosmetics = new Server("sigma-cosmetics", 5, 5000);
        Server megacorp = new Server("megacorp", 50, 1000000);
        
        allServers.add(noodles);
        allServers.add(foodnstuff);
        allServers.add(sigmaCosmetics);
        allServers.add(megacorp);
        
        homeServer.addConnection(noodles);
        homeServer.addConnection(foodnstuff);
        foodnstuff.addConnection(sigmaCosmetics);
        sigmaCosmetics.addConnection(megacorp);
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
