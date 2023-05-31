package Algorithms.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3,21, 4, 5));
        System.out.println(ileSzotów(1000,100));
    }

    static int sum(List<Integer> list) {
        if (list.isEmpty()) return 0;
        else {
            Integer first = list.get(0);
            list.remove(0);
            return first + sum(list);
        }

    }

    static int count(List<Integer> list) {
        if (list.isEmpty()) return 0;
        else {
            list.remove(0);
            return 1 + count(list);
        }

    }

    static int max(List<Integer> list) {
        if (list.isEmpty()) return 0;
        else {
            Integer first = list.get(0);
            list.remove(0);
            int max = max(list);
            return first > max ? first : max;

        }
    }
    static int ileSzotów(int pojemnoscTrunku , int wielkoscSzota){
        if(pojemnoscTrunku<= 0)return 0;
        else return 1 +ileSzotów(pojemnoscTrunku-50,wielkoscSzota);
    }
}
