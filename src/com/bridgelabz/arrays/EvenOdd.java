package com.bridgelabz.arrays;
import java.util.ArrayList;
public class EvenOdd {
    public static void main(String[] args) {


        int[] numbers = {2, 4, 5, 8, 9};
        ArrayList<Integer> oddlist = new ArrayList<>();
        ArrayList<Integer> evenlist = new ArrayList<>();

        for (int number : numbers) {
            if(number%2==0) {
                oddlist.add(number);
            }else{
                evenlist.add(number);
            }

        }
        System.out.println(oddlist);
        System.out.println(evenlist);
    }

}
