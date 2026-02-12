package com.arraylogic;

public class FindLargest {
    public static int findElements(int arr[], int n) {
        // max for storting the largest element in array
        int max = 0;

        //Trivers i and j form 0 index to last index in array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // compare arr[i] and arr[j] if the condition is true excuted the statement
                if (arr[i] < arr[j]) {
                    //sort arr[j] element inside max
                    max = arr[j];
                }
            }
        }
        // now finding secoundLargest element in array
        //secoundLargest to store secound largest element
        int secoundLargest = 0;
        //Trivers i and j form 0 index to last index in array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // if both the condition got true then only excuted the statement
                if (arr[i] < arr[j] && arr[j] != max) {
                    // store arr[j] element inside secoundLargest
                    secoundLargest = arr[j];
                }
            }
        }
        return secoundLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        System.out.println(findElements(arr, n));
    }
}
