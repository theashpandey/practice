package com.practice.basic;

import java.util.Scanner;

public class TakesUserInputAndPrints {

  public static void method() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter something");
    String data = sc.nextLine();
    System.out.println(data);
  }
}
