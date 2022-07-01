package com.company;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int numbers = scanner.nextInt();
        double[] arr = new double[numbers];
        double sum = 0;
        System.out.println("Enter " + numbers + " numbers ");
        for (int i = 0; i<numbers; i++){
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }
        System.out.println("Average " + sum/numbers);
    }
}
