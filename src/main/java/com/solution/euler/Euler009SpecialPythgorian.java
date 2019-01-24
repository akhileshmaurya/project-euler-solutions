package com.solution.euler;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler009
public class Euler009SpecialPythgorian {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      System.out.println(getNumberOfPythagorasTriplet(n));
    }
    in.close();
  }

  public static int getNumberOfPythagorasTriplet(int number) {
    int result = -1;
    for (int startFirst = 1; startFirst < number / 3; startFirst++) {
      for (int startSecond = startFirst + 1; startSecond < number / 2; startSecond++) {
        int thirdValue = number - startFirst - startSecond;
        if (thirdValue > startSecond) {
          int partRes = startFirst * startSecond * thirdValue;
          if ((thirdValue * thirdValue == startFirst * startFirst + startSecond * startSecond)
              && partRes > result) {
            result = partRes;
          }
        }
      }
    }
    return result;
  }
}
