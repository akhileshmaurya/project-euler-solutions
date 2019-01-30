package com.solution.euler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler009
public class Euler017NumberToWord {

  static Map<Integer, String> numberMap = new HashMap<>();

  public static void main(String[] args) {
    init();
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      long n = in.nextLong();
      System.out.println();
    }
    in.close();
  }


  private static void init() {

    numberMap.put(1, "One");
  }


  public static String numberToWord(long number) {
    StringBuilder sb = new StringBuilder();
    return sb.toString();
  }
}
