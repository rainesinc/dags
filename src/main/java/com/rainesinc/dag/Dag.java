package com.rainesinc.dag;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dag {

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, Arrays.asList(2));

        // display a representation of our graph
        for(Integer vertex : graph.keySet()){
            System.out.println(vertex + "->" + graph.get(vertex));
        }

        int longestPathFromStart = Search.depthFirstSearch(0, graph, store);
        System.out.println("Longest path from node 0: " + longestPathFromStart);

    }

    private static final Map<Integer, Integer> store = new HashMap<>();


}