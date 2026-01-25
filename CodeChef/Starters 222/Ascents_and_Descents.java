import java.util.*;
import java.lang.*;
import java.io.*;

public class Ascents_and_Descents {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double K = sc.nextDouble(); // not needed in construction

    int[] P = new int[N];

    // Construct pairs swapped: 2 1 4 3 6 5 ...
    for (int i = 0; i < N; i += 2) {
      if (i + 1 < N) {
        P[i] = i + 2;
        P[i + 1] = i + 1;
      } else {
        P[i] = i + 1; // last element if N odd
      }
    }

    for (int i = 0; i < N; i++) {
      System.out.print(P[i] + " ");
    }

  }
}