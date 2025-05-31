package core.java.interfaces;

import core.java.graphnode.CloneGraph;
import core.java.graphnode.GraphNode;
import core.java.graphnode.GraphTraversal;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Graph {

    @Test
    public void testCloneGraph() {
        // Create graph: 1 -- 2
        //               |    |
        //               4 -- 3
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        CloneGraph cloner = new CloneGraph();
        GraphNode cloned = cloner.cloneGraph(node1);

        // Basic checks
        assertNotNull(cloned);
        assertNotSame(cloned, node1);
        assertEquals(cloned.val, node1.val);

        // Deep clone check: all neighbors must be distinct instances
        Set<Integer> originalVals = collectNodeVals(node1, new HashSet<>());
        Set<Integer> clonedVals = collectNodeVals(cloned, new HashSet<>());

        assertEquals(originalVals, clonedVals);
    }

    @Test
    public void graphTraversal() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, List.of(2, 3));
        graph.put(2, List.of(4));
        graph.put(3, List.of(4));
        graph.put(4, List.of());

        GraphTraversal traversal = new GraphTraversal(graph);

        // DFS
        traversal.visit(1);
        System.out.println("DFS Order: " + traversal.getVisitedDfs());
        System.out.println("BFS Order: " + traversal.getVisitedBfs());
    }

    private Set<Integer> collectNodeVals(GraphNode node, Set<GraphNode> visited) {
        Set<Integer> vals = new HashSet<>();
        collectHelper(node, visited, vals);
        return vals;
    }

    private void collectHelper(GraphNode node, Set<GraphNode> visited, Set<Integer> vals) {
        if (visited.contains(node)) return;
        visited.add(node);
        vals.add(node.val);
        for (GraphNode neighbor : node.neighbors) {
            collectHelper(neighbor, visited, vals);
        }
    }
}
