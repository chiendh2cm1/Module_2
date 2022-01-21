package com.codegym;

public class SelectionSort {

    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        int N = list.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }

    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double value: list){
            System.out.print(value + "   ");
        }
    }
}
