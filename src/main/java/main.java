import graph.Map;
import search.Largura;
import search.Profundidade;

public class main {
    public static void main(String[] args) {
        /*Map map = new Map();
        Profundidade profundidade = new Profundidade(map.getPortoUniao(), map.getCuritiba());
        profundidade.buscar();*/

        Map map = new Map();
        Largura largura = new Largura(map.getPortoUniao(), map.getCuritiba());
        largura.buscar();
    }
}
