package Aarthi;
import java.util.*;
public class SocialCircleDFS {
    private Map<String, List<String>> graph;
    public SocialCircleDFS(Map<String, List<String>> graph) {
        this.graph = graph;
    }
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> circle = new ArrayList<>();
        dfsRecursive(person, visited, circle);
        return circle;
    }
    private void dfsRecursive(String person, Set<String> visited, List<String> circle) {
        if (!graph.containsKey(person) || visited.contains(person)) {
            return;
        }
        visited.add(person);
        circle.add(person);
        for (String neighbor : graph.get(person)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited, circle);
            }
        }
    }

    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> circle = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);
        while (!stack.isEmpty()) {
            String curr = stack.pop();
            if (!visited.contains(curr)) {
                visited.add(curr);
                circle.add(curr);
                if (graph.containsKey(curr)) {
                    for (String neighbor : graph.get(curr)) {
                        if (!visited.contains(neighbor)) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
        return circle;
    }

    public static void main(String[] args) {
        Map<String, List<String>> socialGraph = new HashMap<>();
        socialGraph.put("Alice", Arrays.asList("Bob", "Charlie"));
        socialGraph.put("Bob", Arrays.asList("Alice", "David"));
        socialGraph.put("Charlie", Arrays.asList("Alice"));
        socialGraph.put("David", Arrays.asList("Bob"));
        socialGraph.put("Eve", Arrays.asList("Frank"));
        socialGraph.put("Frank", Arrays.asList("Eve"));
        SocialCircleDFS finder = new SocialCircleDFS(socialGraph);
        System.out.println("Recursive DFS (Alice): " + finder.findSocialCircle("Alice"));
        System.out.println("Iterative DFS (Alice): " + finder.findSocialCircleIterative("Alice"));
        System.out.println("Recursive DFS (Eve): " + finder.findSocialCircle("Eve"));
        System.out.println("Iterative DFS (Eve): " + finder.findSocialCircleIterative("Eve"));
    }
}