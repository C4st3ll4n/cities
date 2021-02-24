package search;

import graph.AdjacentCity;
import graph.City;
import structures.OrderedVectorAdjacent;

public class AEstrela {
    private OrderedVectorAdjacent fronteira;
    private City destiny;
    private boolean found;

    public AEstrela(City destiny) {
        this.destiny = destiny;
        this.found = false;

    }

    public void buscar(City city) {
        System.out.println("\nAtual: " + city.getName());
        city.setVisited(true);

        if (city == destiny) {
            this.found = true;
        } else {
            fronteira = new OrderedVectorAdjacent(city.getAdjacents().size());
            for (AdjacentCity ac :
                    city.getAdjacents()) {
                if (!ac.getCidade().isVisited()) {

                    ac.getCidade().setVisited(true);
                    fronteira.add(ac);
                }
            }
            fronteira.mostrar();
            buscar(fronteira.first());
        }
    }
}
