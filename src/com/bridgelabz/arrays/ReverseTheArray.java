package com.bridgelabz.arrays;
import java.util.Arrays;
public class ReverseTheArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(numbers));

        System.out.print("Reversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
