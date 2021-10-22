package com.idot;

public class PeakFinder {
    public static int peakFinder(int[] arr, int l){
        if(l==1){
            System.out.println("array value is:" +arr[0]);
            return 0;
        }

        if(arr[0]>arr[1]){
            return 0;
        }

        else if (arr[l-1]>arr[l-2]){
            return (l-1);
        }

        for (int i = 1; i < (l - 1); i++) {
            if ((arr[i] > arr[i+1]) && (arr[i]> arr[i-1])) {
                System.out.println("peak value is:" +arr[i]);
                return (i);
            }

        }

        return 0;
    }

    public static void main(String[] args){

        int[] arr = {1,3,3,4,4,3,9,4,4,9,4,3};
        int l = arr.length;

        System.out.println("index of peak is: " + PeakFinder.peakFinder(arr, l));

    }
}