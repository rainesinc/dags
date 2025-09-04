package com.rainesinc.dag;

import java.util.Map;

public class Search {

    public static int depthFirstSearch(Integer vertex, Map<Integer, Vertex> graph, Map<Integer, Integer> store) {

        // if we already have the vertex stored, return path length for that vertex
        if (store.containsKey(vertex)) {
            return store.get(vertex);
        }

        // assume there is no path
        int maxPath = 0;

        // jump over empties, and if the graph doesn't contain the given vertex, return 0
        if (!graph.containsKey(vertex) || graph.get(vertex) == null) {
            store.put(vertex, 0);
            return 0;
        }

        for (Integer edge : graph.get(vertex).getNeighbors()) {
            int neighbor = edge;

            int currentPath = 1 + depthFirstSearch(neighbor, graph, store);
            maxPath = Math.max(maxPath, currentPath);
            // store the latest maxPath for the given vertex, and return this maxPath
            store.put(currentPath, maxPath);
        }

        return maxPath;
    }
}
