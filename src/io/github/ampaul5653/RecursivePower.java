package io.github.ampaul5653;

public class RecursivePower {

  // method to calculate powers via normal means
  static int normalPower(int a, int n) {
    int result = 1;
    for (int i = 0; i < n; i++) {
      result *= a;
    }
    return result;
  }

  /* Method to recursively calculate powers
  * recursivePower logic demo: recursivePower(2,3)
  * recursivePower(2,3)
  * = recursivePower(2, recursivePower(2,2))
  * = recursivePower(2, recursivePower(2, recursivePower(2,1)))
  * = recursivePower(2, recursivePower(2, recursivePower(2, recursivePower(2,0))))
  * recursivePower(2,0) = 1
  * recursivePower(2,1) = 2 * recursivePower(2,0) = 2
  * recursivePower(2,2) = 2 * recursivePower(2,1) = 4
  * recursivePower(2,3) = 2 * recursivePower(2,2) = 8
  */
  static int recursivePower(int a, int n) {
    if (n == 0) {
      return 1;
    } else {
      return a * recursivePower(a, n - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(recursivePower(2, 3));
  }
}
