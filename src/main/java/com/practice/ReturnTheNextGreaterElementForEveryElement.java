package com.practice;

import java.util.Arrays;

/**
 * Given a circular integer array `A`, this method returns the next greater
 * element (NGE) for every element in the array. The next greater element for an
 * element `x` is the first element greater than `x` that is encountered while
 * traversing the array in a clockwise manner. If no such element exists, return
 * -1 for that position.
 * 
 * <p>
 * The array is treated as circular, meaning after the last element, the
 * traversal continues from the first element.
 * </p>
 *
 * <p>
 * <b>Example 1:</b>
 * </p>
 * 
 * <pre>
 * Input:  N = 11, A[] = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9}
 * Output: 10, -1, 6, 6, 2, 6, 7, 7, 9, 9, 10
 * Explanation:
 * - For the first element (3), the next greater element is 10.
 * - For the second element (10), there is no greater element, so the result is -1.
 * - For the third element (4), the next greater element is 6, and so on.
 * </pre>
 *
 * <p>
 * <b>Example 2:</b>
 * </p>
 * 
 * <pre>
 * Input:  N = 6, A[] = {5, 7, 1, 7, 6, 0}
 * Output: 7, -1, 7, -1, 7, 5
 * Explanation:
 * - For the first element (5), the next greater element is 7.
 * - For the second element (7), there is no greater element, so the result is -1.
 * - For the third element (1), the next greater element is 7, and so on.
 * </pre>
 *
 * @param A the input circular integer array
 * @param N the size of the array
 * @return an array of integers representing the next greater element for each
 *         input element
 */
public class ReturnTheNextGreaterElementForEveryElement {

  public static int[] bruteForceMethod(int data[]) {
    int len = data.length;
    int response[] = new int[len];
    Arrays.fill(response, -1);
    for (int i = 0; i < len; i++) {
      for (int j = 1; j < len; j++) {
        int index = (i + j) % len;
        if (data[i] < data[index]) {
          response[i] = data[index];
          break;
        }
      }
    }
    return response;
  }

  public static int[] stackMethod(int data[]) {
    int len = data.length;
    int response[] = new int[len];
    Arrays.fill(response, -1);
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < 2 * len; i++) {
      int index = i % len;
      int element = data[index];

      while (!stack.isEmpty() && element > data[stack.peek()]) {
        int oldSavedIndex = stack.pop();
        response[oldSavedIndex] = element;
      }
      if (i < len)
        stack.push(i);
    }
    return response;
  }
}
