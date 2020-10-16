package io.github.ampaul5653;

public class RecursiveFibonacci {

  //calculates the xth term in Fibonacci sequence
  public static int Fibonacci(int x) {
    if (x < 3) {
      return 1;
    } else {
      return Fibonacci(x - 1) + Fibonacci(x - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(Fibonacci(5));
  }
}
