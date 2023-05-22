package Algorithms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //test                                                      0    1  2     3       4
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "z"));
        strings.stream()
                .map(e -> binarySearch(strings, e))
                .forEach(System.out::println);
    }

    /**
     * @param source   needs to be sorted!
     * @param toSearch element we' re looking for
     * @param <T>      Takes any comparable element
     * @return index of found element, or -1 if element does not exist
     */
    public static <T extends Comparable> int binarySearch(List<T> source, T toSearch) {
        int min = 0;
        int max = source.size() - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            T guess = source.get(mid);
            if (guess.equals(toSearch)) return mid;
            if (guess.compareTo(toSearch) <= 0) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }
}