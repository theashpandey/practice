package com.practice.basic;

public class IsALeapYear {

  public static boolean method(int year) {
    if((year%4==0 && year%100!=0)|| year%400==0) {
      return true;
    }
    return false;
  }
}
