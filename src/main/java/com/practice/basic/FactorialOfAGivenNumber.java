package com.practice.basic;

public class FactorialOfAGivenNumber {
  public static int method(int num) {
    if (num == 1)
      return 1;
    int s = 1;
    while (num > 1) {

      s *= num;
      num--;
    }
    return s;
  }
}
