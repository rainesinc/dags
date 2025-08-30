package com.rainesinc.dag;

import java.util.List;
import java.util.Map;

public class Search {

    public static int depthFirstSearch(int vertex, Map<Integer, List<Integer>> graph, Map<Integer, Integer> store) {

        // if we already have the vertex stored, return path length for that vertex
        if (store.containsKey(vertex)) {
            return store.get(vertex);
        }

        // assume there is no path
        int maxPath = 0;

        // jump over empties, and if the graph doesn't contain the given vertex, return 0
        if (!graph.containsKey(vertex) || graph.get(vertex).isEmpty()) {
            store.put(vertex, 0);
            return 0;
        }

        // the problem T(n)
        for (Integer edge : graph.get(vertex)) {
            int neighbor = edge;

            // start a new sub problem
            int currentPath = 1 + depthFirstSearch(neighbor, graph, store);
            maxPath = Math.max(maxPath, currentPath);
        }

        // store the latest maxPath for the given vertex, and return this maxPath
        store.put(vertex, maxPath);
        return maxPath;
    }
}
