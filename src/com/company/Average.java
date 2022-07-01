package com.company;

import java.util.Scanner;

public class Average {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     int[] a = getInArray(5);
        for (int i = 0; i<a.length; i++){
            System.out.println("Element " + i + " typed was " + a[i]);
        }
        System.out.println("Average is: " + printAverage(a));
    }
    public static int[] getInArray(int number){
        System.out.println("Enter " + number + " integer values ");

        int[] values = new int[number];
        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double printAverage(int[] input){
        int sum = 0;
        for (int i = 0; i<input.length; i++){
            sum += input[i];
        }
        return (double) sum/ (double) input.length;
    }

}
