package com.rainesinc.dag;

import java.util.*;

public class Dag {

    public static void main(String[] args) {

        Map<Integer, Vertex> graph = new HashMap<>();

        Vertex vertex0 = new Vertex(0);
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);


        vertex0.getNeighbors().add(1);
        vertex1.getNeighbors().add(3);
        vertex0.getNeighbors().add(2);
        vertex3.getNeighbors().add(4);


        graph.put(0, vertex0);
        graph.put(1, vertex1);
        graph.put(2, vertex2);
        graph.put(3, vertex3);
        graph.put(4, vertex4);

        for(Vertex edge : graph.values()){
            for(Integer neighbor : edge.getNeighbors()) {
                System.out.println(edge.getId() + "->" + neighbor);
            }
        }

        int longestPathFromStart = Search.depthFirstSearch(1, graph, store);
        System.out.println("Longest path from node: " + longestPathFromStart);

    }

    private static final Map<Integer, Integer> store = new HashMap<>();


}