package structures;

import graph.City;

public class OrderedVector {
    private City[] cities;
    private int numElements;

    public OrderedVector(int size) {
        this.numElements = 0;
        this.cities = new City[size];
    }

    public void add(City city){
        int posicao;
        for (posicao = 0; posicao < numElements; posicao++) {
            if(cities[posicao].getDistanceToDestiny()>city.getDistanceToDestiny()){
                break;
            }
        }

        for (int i = numElements; i > posicao; i--) {
            cities[i] = cities[i - 1];

        }

        cities[posicao] = city;
        numElements++;
    }

    public void mostrar(){
        for (int i = 0; i < numElements; i++) {
            System.out.println(cities[i].getName()+" - "+cities[i].getDistanceToDestiny());
        }
    }

    public City first() {
        return cities[0];
    }
}
