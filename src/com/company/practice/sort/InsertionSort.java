package com.company.practice.sort;

public class InsertionSort {

    public static int[] insertSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int cur = arr[i];
            int idx = i - 1;
            while(idx>=0) {
                if (arr[idx] > cur){
                    arr[idx + 1] = arr[idx];
                    idx--;
                }
                else break;
            }
            arr[++idx] = cur;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,4,3,7,10,9};
        insertSort(arr);
        for(int x : arr)
            System.out.print(x + " ");
    }
}
