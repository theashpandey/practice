package com.practice.advance;

public class Stack<T> {

  int capacity = 10;
  int top = -1;
  @SuppressWarnings("unchecked")
  T[] data = (T[]) new Object[capacity];

  public boolean isEmpty() {
    return top == -1;
  }

  public int size() {
    return top + 1;
  }

  public void push(T e) {
    if (top < capacity - 1) {
      ++top;
      data[top] = e;
    } else {
      throw new RuntimeException("Stack is full...! Element: " + e + " cannot be push.");
    }
  }

  public T pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is Empty...!");
    } else {
      T element = data[top];
      top--;
      return element;
    }
  }

  public T peek() {
    if (!isEmpty()) {
      return data[top];
    } else {
      throw new RuntimeException("Stack is Empty...!");
    }
  }

  public void display() {
    for (int i = top; i >= 0; i--) {
      System.out.println(data[i]);
    }
  }
}
