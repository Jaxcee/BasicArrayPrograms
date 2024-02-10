package com.bridgelabz.arrays;
import java.util.ArrayList;
public class EvenPosition {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8};
        ArrayList<Integer> evenpos= new ArrayList<>();
        for(int i =0;i< numbers.length;i++){
            if(i%2==1) {
                evenpos.add(numbers[i]);
            }

            }
        System.out.println(evenpos);
        }
    }

