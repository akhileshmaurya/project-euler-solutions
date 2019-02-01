package com.solution.euler;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler009
public class Euler013 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long sum[] = getPrimeArry();
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      System.out.println(getSumOfPrimes(sum, n));
    }
    in.close();
  }


  public static long[] getPrimeArry() {
    boolean prime[] = new boolean[1000000 + 1];
    long sum[] = new long[1000000 + 1];

    for (int i = 0; i <= 1000000; i++)
      prime[i] = true;
    for (int p = 2; p * p <= 1000000; p++) {
      if (prime[p]) {
        for (int i = p * p; i <= 1000000; i += p)
          prime[i] = false;
      }
    }

    long psum = 0;
    for (int i = 2; i <= 1000000; i++) {
      if (prime[i]) {
        psum = psum + i;
      }
      sum[i] = psum;
    }
    return sum;
  }


  public static long getSumOfPrimes(long[] sum, int number) {

    return sum[number];
  }
}
