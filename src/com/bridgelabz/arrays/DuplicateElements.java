package com.bridgelabz.arrays;
import java.util.ArrayList;
public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,4,5,6,2,4,5,7};
        ArrayList<Integer> duplicate = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate.add(arr[i]);
                }
            }
        }
        System.out.println(duplicate);
    }
}
