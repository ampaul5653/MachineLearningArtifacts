package io.github.ampaul5653;

public class RecursiveFactorial {

  // calculates the factorial of n
  // Factorial(3) = Factorial(Factorial(2)) = Factorial(Factorial(Factorial(1)))
  // Factorial(1) = 1
  // Factorial(2) = n * Factorial(1) = 2
  // Factorial(3) = n * Factorial(2) = 6
  public static int Factorial(int n){
    if(n == 1) {
      return 1;
    }else{
      return n * Factorial(n-1);
    }
  }

  public static void main(String[] args) {
    System.out.println(Factorial(6));
  }
}
