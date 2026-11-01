import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Player player = new Player();
        Network network = new Network();
        Server currentServer = network.getHomeServer();
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.print(">");
            String line = scanner.nextLine().trim();
            
            if (line.isEmpty()) continue;
            
            String[] parts = line.split("\\s+");
            String command = parts[0].toLowerCase();
            
            switch (command) {
                case "scan":
                    for (Server server : network.getAllServers()) {
                        System.out.println(server.getName());
                    }
                    break;
                case "connect":
                    if (parts.length < 2) {
                        System.out.println("Usage: connect <name>");
                    } else {
                        String name = parts[1];
                        Server server = network.findServerByName(name);
                        if (server != null) {
                            currentServer = server;
                            System.out.println("Connected to " + name);
                        } else {
                            System.out.println("Server not found");
                        }
                    }
                    break;
                case "hack":
                    if (player.getHackingLevel() >= currentServer.getHackingLevelRequired()) {
                        currentServer.setHacked(true);
                        player.setMoney(player.getMoney() + currentServer.getMoneyAvailable());
                        System.out.println("Hack successful. You now have " + player.getMoney());
                    } else {
                        System.out.println("Hack failed. Your hacking level is too low.");
                    }
                    break;
                case "home":
                    currentServer = network.getHomeServer();
                    System.out.println("Back at home server");
                    break;
                case "help":
                    System.out.println("Available commands: scan, connect <name>, hack, home, help, exit");
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command. Type help for a list of commands.");
            }
        }
        
        scanner.close();
    }
}
