package structures;

import graph.City;

public class Queue {
    private int size;
    private City[] cities;
    private int start;
    private int end;
    private int numElements;

    public Queue(int size) {
        this.size = size;
        this.cities = new City[size];
        this.start = 0;
        this.end = -1;
        this.numElements = 0;
    }

    public void add(City city){
        if(!isFull()){

        if(end == (size-1)){
            end = -1;
        }

        cities[++end] = city;
        numElements++;
        }else {
            System.out.println("Fila cheia !!");
        }
    }
    public City pop(){
        if(!isEmpty()){

        City city = cities[start++];
        if(start == size){
            start=0;
        }
        numElements--;
        return city;
        }else{
            System.out.println("Fila vazia !!");
            return null;
        }
    }

    public City first(){
        return cities[start];
    }

    private boolean isEmpty(){
        return (numElements==0);
    }

    private boolean isFull(){
        return (numElements==size);
    }

    public boolean hasElements(){
        return numElements>0;
    }
}
