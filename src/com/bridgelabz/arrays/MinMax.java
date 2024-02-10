package com.bridgelabz.arrays;
import java.util.ArrayList;
public class MinMax {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8};
        int largest =numbers[0];
        int smallest = numbers[0];

        for(int i =0;i< numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            } else if (numbers[i]<smallest) {
                smallest = numbers[i];

            }

            }
            System.out.println(largest);
            System.out.println(smallest);


        }
    }

