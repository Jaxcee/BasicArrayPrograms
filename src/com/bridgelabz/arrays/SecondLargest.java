package com.bridgelabz.arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {2,4,3,6,1,7};
        int  size = numbers.length;
        Arrays.sort(numbers);
        int res = numbers[size -2];
        System.out.println(res);
        }

    }

