import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {
    public static void main(String[] args) {
        int[] siraliDizi = createOrderedArray(10000);
        int[] arr = createArray(1000);  //Veri setimiz az elemanli ise insertion ile selection arasinda hiz farki olmaz
        // ama eleman sayisi arttikca insertion daha mantikli olur cunku hizli calisir
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        int[] arr5 = Arrays.copyOf(arr, arr.length);
        int[] arr6 = Arrays.copyOf(arr, arr.length);
        int[] arr7 = Arrays.copyOf(arr, arr.length);



        long startTime;
        long endTime;
        double estimetedTime; //gecen sure(endtime-starttime)

        //****insertionSort*******
        startTime = System.currentTimeMillis();
       // InsertionSort.insertionSort(arr);
        InsertionSort.insertionSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("InsertionSort =" + estimetedTime);


        //*****selectionSort**********
        startTime = System.currentTimeMillis();
       // SelectionSort.selectionSort(arr2);
        SelectionSort.selectionSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("SelectionSort =" + estimetedTime);

        //*****bubbleSort*********
        startTime = System.currentTimeMillis();
       // BubbleSort.bubbleSort(arr3);
        BubbleSort.bubbleSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("BubbleSort =" + estimetedTime);

        //*******MergeSort**********
        startTime = System.currentTimeMillis();
       // MergeSort.mergeSort(arr4,0,arr4.length-1);
        MergeSort.mergeSort(siraliDizi,0,siraliDizi.length-1);
        endTime = System.currentTimeMillis();
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("MergeSort=" + estimetedTime);


        //********QuickSort********
        startTime = System.currentTimeMillis();
       // QuickSort.quickSort(arr5,0,arr5.length-1);
        QuickSort.quickSort(siraliDizi,0,siraliDizi.length-1);
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("QuickSort=" + estimetedTime);


        //*******ShellSort************
        startTime = System.currentTimeMillis();
        //ShellSort.shellSort(arr6);
        ShellSort.shellSort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("shellSort=" + estimetedTime);



        //*********Arrays.sort()********
        startTime = System.currentTimeMillis();
       // Arrays.sort(arr7);
        Arrays.sort(siraliDizi);
        endTime = System.currentTimeMillis();
        estimetedTime = (double) (endTime - startTime) / 1000;
        System.out.println("Arrays.Sort=" + estimetedTime);

    }


    public static int[] createArray(int elemanSayisi) {
        int[] arr = new int[elemanSayisi];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }


    public static int[] createOrderedArray(int elemanSayisi) {
        int[] arr = new int[elemanSayisi];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

        }
        return arr;
    }
}
