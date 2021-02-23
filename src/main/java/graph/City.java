package graph;

import graph.AdjacentCity;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private boolean isVisited;
    private List<AdjacentCity> adjacents;

    public City(String name) {
        this.name = name;
        this.isVisited = false;
        this.adjacents = new ArrayList<AdjacentCity>();
    }

    public void addAdjacent(AdjacentCity city){
        this.adjacents.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<AdjacentCity> getAdjacents() {
        return adjacents;
    }

}