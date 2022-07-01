package com.company;

import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the numbers of the array");
        int number = scanner.nextInt();
        int[] marks = new int[number];
        for (int i =0; i<marks.length; i++){
            marks[i]= scanner.nextInt();
        }
        display(marks);
    }
    public static void display(int[] input){
        for (int counter=0; counter< input.length; counter++){
            System.out.println(input[counter]);
        }
    }
}
