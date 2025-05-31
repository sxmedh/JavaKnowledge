package core.java.graphnode;

import java.util.*;

public class GraphTraversal {

    Map<Integer, List<Integer>> graph;
    List<Integer> visitedDfs = new ArrayList<>();
    List<Integer> visitedBfs = new ArrayList<>();

    public GraphTraversal(Map<Integer, List<Integer>> graph) {
        this.graph = graph;
    }

    public void visit(int node) {
        dfs(node);
        bfs(node);
    }

    void dfs(int node) {
        if (visitedDfs.contains(node)) return;
        visitedDfs.add(node);
        List<Integer> neighbors = graph.get(node);
        for (Integer neighbor : neighbors) {
            dfs(neighbor);
        }
    }

    void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visitedBfs.add(node);
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (Integer neighbor:  graph.get(currentNode)) {
                if (!visitedBfs.contains(neighbor)) {
                    queue.add(neighbor);
                    visitedBfs.add(neighbor);
                }
            }
        }
    }

    public List<Integer> getVisitedDfs() {
        return visitedDfs;
    }


    public List<Integer> getVisitedBfs() {
        return visitedBfs;
    }
}
