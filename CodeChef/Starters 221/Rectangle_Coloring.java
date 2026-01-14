import java.util.*;
import java.lang.*;
import java.io.*;

public class Rectangle_Coloring {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long l = sc.nextLong();
      long w = sc.nextLong();
      long r = sc.nextLong();
      long g = sc.nextLong();
      long b = sc.nextLong();
      System.out.println(solve(l, w, r, g, b));
    }

  }

  private static long solve(long l, long w, long r, long g, long b) {
    long[] sides = { l, l, w, w };
    long minCost = Long.MAX_VALUE;

    for (int i = 0; i < 256; i++) {
      long currentCost = 0;
      long reqr = 0, reqg = 0, reqb = 0;
      int mixedCount = 0;
      int temp = i;

      for (int j = 0; j < 4; j++) {
        int type = temp % 4;
        temp /= 4;

        if (type == 0) {
          reqr += sides[j];
          currentCost += 1;
        } else if (type == 1) {
          reqg += sides[j];
          currentCost += 1;
        } else if (type == 2) {
          reqb += sides[j];
          currentCost += 1;
        } else {
          mixedCount++;
          currentCost += 2;
        }
      }

      if (reqr > r || reqg > g || reqb > b) {
        continue;
      }

      if (mixedCount == 1) {
        long remR = r - reqr;
        long remG = g - reqg;
        long remB = b - reqb;
        if (remR > 0 && remG > 0 && remB > 0) {
          currentCost += 1;
        }
      }

      minCost = Math.min(minCost, currentCost);
    }
    return minCost;
  }
}