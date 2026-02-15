package com.arraylogic;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        int[] temp = new int[arr.length];

        int i=0;
            for(int j=0;j< arr.length;j++){
                if(arr[j] != 0){
                    temp[i] = arr[j];
                    i++;
                }
            }


            for(int nums: temp){
                System.out.print(nums+" ");
            }

    }
}
