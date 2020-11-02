package com.company.practice.sort;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,4,3,7,10,9};
        arr = mergeSort(arr, 0, arr.length - 1);
        for(int x : arr)
            System.out.print(x + " ");
    }

    private static int[] mergeSort(int[] arr, int lo, int hi) {
        if(lo == hi) return arr;
        int mid = (lo+hi)/2;
        arr = mergeSort(arr,lo,mid);
        arr = mergeSort(arr,mid+1,hi);
        arr = merge(arr,lo,mid,hi);
        return arr;
    }

    private static int[] merge(int[] arr, int lo, int mid, int hi) {
        int[] tmpArr = new int[hi-lo+1];

        int idx = 0, left = lo, right = mid+1;
        while(left<=mid && right <= hi){
            if(arr[left] < arr[right])
                tmpArr[idx++] = arr[left++];
            else
                tmpArr[idx++] = arr[right++];
        }

        while(left<=mid)
            tmpArr[idx++] = arr[left++];
        while(right<=hi)
            tmpArr[idx++] = arr[right++];

        for(int i = lo;i<=hi;i++)
            arr[i] = tmpArr[i-lo];

        return arr;
    }
}
