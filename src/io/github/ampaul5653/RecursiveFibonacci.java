package io.github.ampaul5653;

public class RecursiveFibonacci {

  //calculates the xth term in Fibonacci sequence
  public static int Fibonacci(int x) {
    if (x < 3) { // base case
      return 1;
    } else { //recursive case
      return Fibonacci(x - 1) + Fibonacci(x - 2);
    }
  }

  public static void main(String[] args) { //test method
    System.out.println(Fibonacci(5));
  }
}
