package com.practice;

public class MainClass {
public static void main(String[] args) {
  int  A[] = {5, 7, 1, 7, 6, 0};
  int[] data = ReturnTheNextGreaterElementForEveryElement.stackMethod(A);
 
 for(int d:data)
  System.out.println(d );

 
}
}
