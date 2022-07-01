package com.company;

import java.util.Arrays;

public class ReturnArray {
    public static void main(String[] args) {
      int[] a = getIntArray();
      for (int i = 0; i<a.length; i++){
          System.out.println(a[i]);
        }
      String[] b = getStringArray();
      for (int i=0; i<b.length; i++){
          System.out.println(b[i]);
      }
    }
    public static int[] getIntArray(){
        int[] number = {1,4,5,6,8};
        return number;
    }
    public static String[] getStringArray(){
        String[] colors = {"red","yellow","green","white"};
        return colors;
    }
}
