package com.rainesinc.dag;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SearchTest {

    @Test
    public void testLongestPathFromNode2(){

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

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(1, graph, store);
        Assert.assertEquals(2, longestPathFromStart);
    }

}
