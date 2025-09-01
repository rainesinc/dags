package com.rainesinc.dag;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SearchTest {

    @Test
    public void testLongestPathFromNode2CaseMistakenlyOverwriteContentsOfGraph(){
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(4, Arrays.asList(3));

        graph.put(0, Arrays.asList(1, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(4, Arrays.asList(3));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(2, graph, store);
        Assert.assertEquals(2, longestPathFromStart);
    }

    @Test
    public void testLongestPathFromNode2CaseMistakenlyOverwriteNodeNamesInGraph(){
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 3, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(4, Arrays.asList(3));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(2, graph, store);
        Assert.assertEquals(2, longestPathFromStart);
    }

    @Test
    public void testLongestPathFromNode2CaseLargerGraph(){
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(4, Arrays.asList(3));
        graph.put(5, Arrays.asList(8, 9, 11));
        graph.put(11, Arrays.asList(44, 12, 15));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(5, graph, store);
        Assert.assertEquals(2, longestPathFromStart);
    }

    @Test
    public void testLongestPathFromNode4EdgeCaseMaxPath1(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(4, Arrays.asList(3));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(4, graph, store);
        Assert.assertEquals(1, longestPathFromStart);
    }

    @Test
    public void testLongestPathFromNode2EdgeCaseMaxPath0(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, Arrays.asList(2));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(2, graph, store);
        Assert.assertEquals(0, longestPathFromStart);
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

    @Test
    public void testLongestPathFromNode3EdgeCaseEmpty(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, new ArrayList());

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(3, graph, store);
        Assert.assertEquals(0, longestPathFromStart);
    }

    @Test(expected = StackOverflowError.class)
    public void testLongestPathFromNode3EdgeCaseCycleStackOverflow(){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 3));
        graph.put(1, Arrays.asList(2));
        graph.put(3, Arrays.asList(0));

        Map<Integer, Integer> store = new HashMap<>();

        int longestPathFromStart = Search.depthFirstSearch(3, graph, store);
        Assert.assertEquals(0, longestPathFromStart);
    }

}
