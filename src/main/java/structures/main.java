package structures;

import graph.Map;

public class main {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        Map map = new Map();

        p.add(map.getPortoUniao());
        p.add(map.getCampoLargo());
        p.add(map.getCanoinhas());

        System.out.println(p.top().getName());

        p.pop();

        System.out.println(p.top().getName());

        p.pop();
        System.out.println(p.top().getName());
    }
}
