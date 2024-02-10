package com.bridgelabz.arrays;

import java.util.ArrayList;

public class OddPosition {
    public static void main(String[] args) {
        int[] numbers ={14,2,3,4,5,6,7,8};
        ArrayList<Integer> oddpos= new ArrayList<>();
        for(int i =0;i< numbers.length;i++){
            if(i%2!=1) {
                oddpos.add(numbers[i]);
            }

        }
        System.out.println(oddpos);
    }
}

