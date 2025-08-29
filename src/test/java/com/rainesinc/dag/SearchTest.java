package com.rainesinc.dag;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchTest {

    @Test
    public void testLongestPathFromNode0(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, Arrays.asList(2));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(0, graph, store);
        Assert.assertEquals(2, longestPathFromStart);
    }

    @Test
    public void testLongestPathFromNode1(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, Arrays.asList(2));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(1, graph, store);
        Assert.assertEquals(1, longestPathFromStart);
    }

    @Test
    public void testLongestPathFromNode3(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, Arrays.asList(2));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(3, graph, store);
        Assert.assertEquals(1, longestPathFromStart);
    }

}
