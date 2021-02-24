package structures;

import graph.AdjacentCity;
import graph.City;

public class OrderedVectorAdjacent {
    private AdjacentCity[] cities;
    private int numElements;

    public OrderedVectorAdjacent(int size) {
        this.numElements = 0;
        this.cities = new AdjacentCity[size];
    }

    public void add(AdjacentCity city){
        int posicao;
        for (posicao = 0; posicao < numElements; posicao++) {
            if(cities[posicao].getStarDistance()>city.getStarDistance()){
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
            System.out.println(cities[i].getCidade().getName()+" - "+cities[i].getStarDistance());
        }
    }

    public City first() {
        return cities[0].getCidade();
    }
}
