package Algorithms.Search.BFS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreadthFirstSearch {


    private static Map<Person, List<Person>> getSampleGraph(){
        Map<Person, List<Person>> graph = new HashMap<>();

        Person a = new Person("a", 25);
        Person b = new Person("b", 15);
        Person c = new Person("c", 77);
        Person d = new Person("d", 55);
        Person e = new Person("e", 43);
        Person f = new Person("f", 43);

        graph.put(a, List.of(b,c));
        graph.put(b, List.of(d,e));
        graph.put(c, List.of());
        graph.put(d, List.of(f));
        graph.put(e, List.of());
        graph.put(f, List.of());

        return graph;
    }


}
