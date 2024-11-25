package com.practice.basic;

public class SumOfDigit {
  public static int method(int num) {
    int sum = 0;
    while (num >= 1) {
      sum += num % 10;
      num = num / 10;
    }
    return sum;
  }
}
