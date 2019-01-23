package com.solution.euler;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler008
public class Euler008LargestProductInSeries {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      int k = in.nextInt();
      String num = in.next();
      long res = maximumProductInCoscutive(num, k, n);
      System.out.println(res);
    }
    in.close();
  }

  public static long maximumProductInCoscutive(String num, int k, int size) {
    long product = 1;
    long maxValue = 1;
    if (size >= k) {
      char[] arr = num.toCharArray();
      for (int i = 0; i < k; i++) {
        product = product * Character.getNumericValue(arr[i]);
      }
      maxValue = product;

      for (int i = k; i < size; i++) {
        int lastNumber = Character.getNumericValue(arr[i - k]);
        if (lastNumber > 0) {
          product = product * Character.getNumericValue(arr[i]);
          product = product / lastNumber;
        } else {
          product = 1;
          for (int j = i - k + 1; j <= i; j++) {
            product = product * Character.getNumericValue(arr[j]);
          }
        }
        if (maxValue < product) {
          maxValue = product;
        }
      }
    }
    System.out.println(maxValue);
    return maxValue;
  }
}
