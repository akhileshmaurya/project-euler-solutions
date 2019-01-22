package com.solution.euler.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.solution.euler.Euler003LargestPrimeFactor;
import com.solution.euler.Euler005SmallestMultiple;

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
}
