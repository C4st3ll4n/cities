import graph.Map;
import search.Gulosa;
import search.Largura;
import search.Profundidade;
import structures.OrderedVector;

public class main {
    public static void main(String[] args) {
        /*Map map = new Map();
        Profundidade profundidade = new Profundidade(map.getPortoUniao(), map.getCuritiba());
        profundidade.buscar();*/


      /*
        Map map = new Map();
        Largura largura = new Largura(map.getPortoUniao(), map.getCuritiba());
        largura.buscar();*/
/*
        Map map = new Map();
        OrderedVector vector = new OrderedVector(20);
        vector.add(map.getPortoUniao());
        vector.add(map.getPauloFrontin());
        vector.add(map.getBalsaNova());

        vector.mostrar();*/
        Map map = new Map();
        Gulosa gulosa = new Gulosa(map.getCuritiba());
        gulosa.buscar(map.getPortoUniao());
    }
}
