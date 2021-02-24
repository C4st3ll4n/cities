import graph.Map;
import search.AEstrela;
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

        System.out.println("############ Buscar gulosa ###############");
        Map map = new Map();
        Gulosa gulosa = new Gulosa(map.getCuritiba());
        gulosa.buscar(map.getPortoUniao());
        System.out.println("############ Buscar gulosa ###############");

        System.out.println("############ Buscar A* ###############");
        Map _map = new Map();
        AEstrela aEstrela = new AEstrela(_map.getCuritiba());
        aEstrela.buscar(_map.getPortoUniao());
        System.out.println("############ Buscar A* ###############");
    }
}
