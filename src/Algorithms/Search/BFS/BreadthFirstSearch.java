package Algorithms.Search.BFS;

import java.util.*;
import java.util.function.Predicate;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Person found = searchPersonKnowsSomeoneWho(new Person("a", 25), person -> person.getAge() == 93);
        System.out.println(found);
    }


    private static Map<Person, List<Person>> getSampleGraph() {
        Map<Person, List<Person>> graph = new HashMap<>();

        Person a = new Person("a", 25);
        Person b = new Person("b", 15);
        Person c = new Person("c", 77);
        Person d = new Person("d", 55);
        Person e = new Person("e", 43);
        Person f = new Person("f", 93);

        graph.put(a, List.of(b, c));
        graph.put(b, List.of(d, e));
        graph.put(c, List.of());
        graph.put(d, List.of(f));
        graph.put(e, List.of());
        graph.put(f, List.of());

        return graph;
    }

    public static Person searchPersonKnowsSomeoneWho(Person person, Predicate<Person> predicate) {
        Map<Person, List<Person>> graph = getSampleGraph();
        ArrayList<Person> checked = new ArrayList<>();
        Deque<Person> peopleToSearch = new LinkedList<>();
        int counter = 0;

        if (!graph.containsKey(person))
            return null;

        peopleToSearch.addAll(graph.get(person));

        while (!peopleToSearch.isEmpty()) {
            Person next = peopleToSearch.pollFirst();
            counter++;
            if (checked.contains(next))
                continue;

            if (predicate.test(next)) {
                System.out.println("rzad : " + counter);
                return next;
            }

            peopleToSearch.addAll(graph.get(next));
            checked.add(next);

        }
        return null;

    }


}
