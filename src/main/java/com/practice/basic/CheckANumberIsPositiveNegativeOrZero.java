package com.practice.basic;

public class CheckANumberIsPositiveNegativeOrZero {

  public static void method(int num) {
    if (num == 0) {
      System.out.println("You entered zero...");
      return;
    }
    if (num < 0) {
      System.out.println("You entered negative...");
    } else {
      System.out.println("You entered Positive...");
    }
  }
}
