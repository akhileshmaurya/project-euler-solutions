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
    numberMap.put(1, "Two");
    numberMap.put(1, "Three");
    numberMap.put(1, "Four");
    numberMap.put(1, "Five");
    numberMap.put(1, "Six");
    numberMap.put(1, "Seven");
    numberMap.put(1, "Eight");
    numberMap.put(1, "Nine");
    numberMap.put(1, "Ten");
    numberMap.put(1, "Eleven");
    numberMap.put(1, "Twelwe");
    numberMap.put(1, "Thirteen");
    numberMap.put(1, "Fourteen");
    numberMap.put(1, "Fifteen");
    numberMap.put(1, "Sixteen");
    numberMap.put(1, "Seventeen");
    numberMap.put(1, "Eighteen");
    numberMap.put(1, "Ninteen");
    numberMap.put(1, "Twenty");
    numberMap.put(1, "Thirty");
    numberMap.put(1, "Fourty");
    numberMap.put(1, "Fifty");

  }


  public static String numberToWord(long number) {
    StringBuilder sb = new StringBuilder();
    return sb.toString();
  }
}
