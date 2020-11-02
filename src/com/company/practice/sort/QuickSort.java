package com.company.practice.sort;

public class QuickSort {

    public static int[] swap(int[] arr, int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,4,15,31,-1,-5,3,7,10,9};
        arr = quickSort(arr, 0, arr.length - 1);
        for(int x : arr)
            System.out.print(x + " ");
    }

    private static int[] quickSort(int[] arr, int lo, int hi) {
        if(lo==hi) return arr;

        int left = lo, right = hi;
        int pivot = arr[(lo+hi)/2];

        while(left<=right){
            while(arr[left]<pivot) left++;
            while(arr[right]>pivot) right--;
            if(left<=right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }

        if(lo<right)
            arr = quickSort(arr,lo,right);
        if(left<hi)
            arr = quickSort(arr,left,hi);

        return arr;
    }
}
