package com.rainesinc.dag;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int id;
    private List<Integer> neighbors;

    public Vertex(int id){
        this.id = id;
        this.neighbors = new ArrayList<>();
    }

    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Integer> neighbors) {
        this.neighbors = neighbors;
    }
}
