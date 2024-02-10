package com.bridgelabz.arrays;

public class FrequencyOfNumber {
    public static void main(String[] args) {


        int[] numbers = {1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8};
        int[] frequency = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            frequency[numbers[i]]++;
        }
        System.out.println("Frequency of numbers :");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(i + ":" + frequency[i]);
            }
        }
    }
}