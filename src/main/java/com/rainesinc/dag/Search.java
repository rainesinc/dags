package com.rainesinc.dag;

import java.util.List;
import java.util.Map;

public class Search {

    public static int depthFirstSearch(int vertex, Map<Integer, List<Integer>> graph, Map<Integer, Integer> store) {
        if (store.containsKey(vertex)) {
            return store.get(vertex);
        }

        int maxPath = 0;

        if (!graph.containsKey(vertex) || graph.get(vertex).isEmpty()) {
            store.put(vertex, 0);
            return 0;
        }

        for (Integer edge : graph.get(vertex)) {
            int neighbor = edge;

            int currentPath = 1 + depthFirstSearch(neighbor, graph, store);
            maxPath = Math.max(maxPath, currentPath);
        }

        store.put(vertex, maxPath);
        return maxPath;
    }
}
