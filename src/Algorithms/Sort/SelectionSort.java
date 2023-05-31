package Algorithms.Sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort {
    public static void main(String[] args) {
        int[] tab = {3,52,1,5,2,4,9};
        tab = new int[]{6,3,1,0,2,5,4,7};
        selectionSort(tab);
        System.out.println();
        System.out.println("result : ");
        System.out.println(Arrays.stream(tab).mapToObj(e -> e + "").collect(Collectors.joining(",")));
    }
    static void selectionSort(int[] tab){
        int i = 0;
        while(i < tab.length-1 ){
            int min = indexOfMin(tab,i);
            swap(tab,i,min);
            System.out.println("steps : "+i);
            System.out.println(Arrays.stream(tab).mapToObj(e -> e + "").collect(Collectors.joining(",")));
            i++;
        }
    }
    static void swap(int [] tab , int i, int mini){
        int tmp = tab[i];
        tab[i] = tab[mini];
        tab[mini] = tmp;
    }
    static int indexOfMin(int[] tab ,int i){
        int min = i;
        for (int j = i+1; j < tab.length; j++) {
            if(tab[j] < tab[min]) min =j;
        }
        return min;
    }
}
