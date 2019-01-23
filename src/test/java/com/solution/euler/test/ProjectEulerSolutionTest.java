package com.solution.euler.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.solution.euler.Euler003LargestPrimeFactor;
import com.solution.euler.Euler005SmallestMultiple;
import com.solution.euler.Euler008LargestProductInSeries;

public class ProjectEulerSolutionTest {

  @Test
  public void testEuler003LargestPrimeFactor() {
    long input = 10, expectedOutput = 5;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler003LargestPrimeFactor.foundMaxPrime(input));
    input = 17;
    expectedOutput = 17;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler003LargestPrimeFactor.foundMaxPrime(input));

  }

  @Test
  public void testEuler005SmallestMultiple() {
    long input = 3, expectedOutput = 6;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler005SmallestMultiple.smallestMultiple(input));
    input = 10;
    expectedOutput = 2520;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler005SmallestMultiple.smallestMultiple(input));

  }

  @Test
  public void testEuler008LargestProductInSeries() {
    int size = 10, k = 5;
    String num = "3675356291";
    long expectedOutput = 3150;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler008LargestProductInSeries.maximumProductInCoscutive(num, k, size));
    num = "2709360626";
    size = 10;
    k = 5;
    expectedOutput = 0;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler008LargestProductInSeries.maximumProductInCoscutive(num, k, size));
    num = "2709360626012345";
    size = 16;
    k = 3;
    expectedOutput = 162;
    assertEquals("Should Be Paased ", expectedOutput,
        Euler008LargestProductInSeries.maximumProductInCoscutive(num, k, size));
  }
}
