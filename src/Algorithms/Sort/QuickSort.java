package Algorithms.Sort;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class QuickSort {
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public static void quickSort(int arr[]){
        quickSort(arr,0,arr.length-1);
    }
    private static void  quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int pivotIndex = partition(arr, begin, end);

            quickSort(arr, begin, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }
    public static void main(String[] args)  {
        
    }
}
