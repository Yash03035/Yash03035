package Aarthi;
import java.util.*;
public class ZooGraph {
    private Map<String, List<String>> adjList;
    public ZooGraph() {
        adjList = new HashMap<>();
    }
    public void addZone(String zone) {
        adjList.putIfAbsent(zone, new ArrayList<>());
    }
    public void addConnection(String from, String to) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.get(from).add(to);
    }
    public void printGraph() {
        for (String zone : adjList.keySet()) {
            List<String> connections = adjList.get(zone);
            if (connections.isEmpty()) {
                System.out.println(zone + " connects to: No further zones");
            } else {
                System.out.println(zone + " connects to: " + String.join(", ", connections));
            }
        }
    }
    public static void main(String[] args) {
        ZooGraph zoo = new ZooGraph();
        zoo.addZone("Entrance");
        zoo.addZone("Reptile House");
        zoo.addZone("Bird Sanctuary");
        zoo.addZone("Mammal Zone");
        zoo.addZone("Snake Pit");
        zoo.addZone("Parrot Pavilion");
        zoo.addZone("Lion Den");
        zoo.addZone("Elephant Enclosure");
        zoo.addConnection("Entrance", "Reptile House");
        zoo.addConnection("Entrance", "Bird Sanctuary");
        zoo.addConnection("Entrance", "Mammal Zone");
        zoo.addConnection("Reptile House", "Snake Pit");
        zoo.addConnection("Bird Sanctuary", "Parrot Pavilion");
        zoo.addConnection("Mammal Zone", "Lion Den");
        zoo.addConnection("Mammal Zone", "Elephant Enclosure");
        zoo.printGraph();
    }
}