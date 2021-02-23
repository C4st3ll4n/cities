package structures;

import graph.City;

public class Pilha {
    private int size;
    private City[] cities;
    private int top;

    public Pilha(int size) {
        this.size = size;
        this.cities = new City[size];
        this.top = -1;
    }

    public void add(City city) {
        if(!this.isFull()){
            this.cities[++top] = city;
        }else{
            System.out.println("Pilha cheia");
        }
    }

    public City pop() {
        if(!this.isEmpty()){
            return this.cities[top--];
        }else{
            System.out.println("Pilha vazia");
            return null;
        }
    }

    public City top() {
        return this.cities[top];
    }

    private boolean isEmpty(){
        return (top==-1);
    }

    private boolean isFull(){
        return (top==(size-1));
    }
}


