package com.company.practice.sort;

public class SelectionSort {

    public static int[] swap(int[] arr, int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return arr;
    }

    public static int[] selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int minIdx = i;
            for(int j=i + 1;j<arr.length;j++){
                if(arr[minIdx] > arr[j])
                    minIdx = j;
            }
            swap(arr,minIdx,i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,4,3,7,10,9};
        selectionSort(arr);
        for(int x : arr)
            System.out.print(x + " ");
    }
}
