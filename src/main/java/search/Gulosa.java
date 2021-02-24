package search;

import graph.AdjacentCity;
import graph.City;
import structures.OrderedVector;

public class Gulosa {
    private OrderedVector fronteira;
    private City destiny;
    private boolean found;

    public Gulosa(City destiny) {
        this.destiny = destiny;
        this.found = false;
    }

    public void buscar(City city) {
        System.out.println("\nAtual: " + city.getName());
        city.setVisited(true);

        if (city == destiny) {
            this.found = true;
        } else {
            if (!found) {

                fronteira = new OrderedVector(city.getAdjacents().size());
                for (AdjacentCity ac : city.getAdjacents()) {
                    if (!ac.getCidade().isVisited()) {
                        ac.getCidade().setVisited(true);

                        fronteira.add(ac.getCidade());

                    }
                }
                fronteira.mostrar();
                if (fronteira.first() != null) {
                    buscar(fronteira.first());

                }
            }
        }
    }
}
