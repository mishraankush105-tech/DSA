package com.arraylogic;

public class CheckArraySorted {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int n = arr.length;
        int[] nums = {5,4,6,7,8};
        boolean isSorted = true;

        int i=0;
            for(int j=1;j< nums.length;j++){
                if(nums[i] < nums[j]){
                    i++;
                }else{
                    isSorted = false;
                    break;
                }
            }

        if(isSorted){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }
    }
}
