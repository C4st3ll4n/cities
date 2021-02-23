import graph.Map;
import search.Profundidade;

public class main {
    public static void main(String[] args) {
        Map map = new Map();
        Profundidade profundidade = new Profundidade(map.getPortoUniao(), map.getCuritiba());
        profundidade.buscar();
    }
}
