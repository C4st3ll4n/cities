package search;

import graph.AdjacentCity;
import graph.City;
import structures.Queue;

public class Largura {
    private Queue frontier;
    private City start;
    private City destiny;
    private boolean found;

    public Largura(City start, City destiny) {
        this.start = start;
        this.destiny = destiny;

        this.start.setVisited(true);

        this.frontier = new Queue(20);
        this.frontier.add(start);

        this.found = false;
    }

    public void buscar() {
        City first = frontier.first();
        System.out.println("Primeiro: " + first.getName());

        if (first == destiny) {
            this.found = true;
            System.out.println("Chegou no seu destino: "+first.getName());
        } else {

            System.out.println("Tirando da fila: " + frontier.pop().getName());
            for (AdjacentCity ac : first.getAdjacents()) {
                System.out.println("Verificando se já visitou " + ac.getCidade().getName());
                if (!ac.getCidade().isVisited()) {
                    ac.getCidade().setVisited(true);
                    frontier.add(ac.getCidade());
                }
            }
            System.out.println("\n");
            if (frontier.hasElements()) {
                buscar();
            }
        }
    }
}
