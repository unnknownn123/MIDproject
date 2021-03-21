package sample;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    private List<Vertex> nList;

    public Vertex(String name){
        this.name=name;
        this.nList= new ArrayList<>();
    }

    public void addN(Vertex vertex){
        this.nList.add(vertex);
    }

    public List<Vertex> getnList() {
        return nList;
    }

    public void setnList(List<Vertex> nList) {
        this.nList = nList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String  toString() {
        return this.name;
    }
}

