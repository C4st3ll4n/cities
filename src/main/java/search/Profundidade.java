package search;

import graph.AdjacentCity;
import graph.City;
import structures.Pilha;

public class Profundidade {
    private Pilha fronteira;
    private City start;
    private City destiny;
    private boolean found;

    public Profundidade(City start, City destiny) {
        this.start = start;
        this.start.setVisited(true);
        this.destiny = destiny;

        this.fronteira = new Pilha(20);
        fronteira.add(start);

        this.found = false;
    }

    public void buscar() {
        City top = fronteira.top();
        System.out.println("Topo: " + top.getName());
        if (top == destiny) {
            System.out.println("Chegou no destinho: "+destiny.getName());
            this.found = true;
        } else {
            for (AdjacentCity a : top.getAdjacents()) {
                if(!found){
                System.out.println("Verificando se já visitou " + a.getCidade().getName());
                if (!a.getCidade().isVisited()) {
                    a.getCidade().setVisited(true);
                    fronteira.add(a.getCidade());
                    System.out.println("\n");
                    buscar();
                }
            }
            }
            System.out.println("Desempilhando " + fronteira.pop().getName() + "\n");

        }
    }
}
