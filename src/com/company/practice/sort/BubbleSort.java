package com.company.practice.sort;

public class BubbleSort {

    public static int[] swap(int[] arr, int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return arr;
    }

    public static int[] bubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length - i - 1;j++){
                if(arr[j] > arr[j+1])
                    swap(arr,j,j+1);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,4,3,7,10,9};
        bubbleSort(arr);
        for(int x : arr)
            System.out.print(x + " ");
    }
}
