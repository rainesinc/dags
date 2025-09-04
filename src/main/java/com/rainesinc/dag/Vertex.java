package com.rainesinc.dag;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int id;
    private List<Integer> paths;

    public Vertex(int id){
        this.id = id;
        this.paths = new ArrayList<>();
    }

    public int  getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getPaths() {
        return paths;
    }

    public void setPaths(List<Integer> paths) {
        this.paths = paths;
    }
}
