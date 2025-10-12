import java.util.*;

public class B_Bitwise_Reversion {
  public static boolean isPossible(int x, int y, int z) {
    for (int i = 0; i < 32; i++) {
      int X = (x >> i) & 1;
      int Y = (y >> i) & 1;
      int Z = (z >> i) & 1;

      if (!((X == 0 && Y == 0 && Z == 0) ||
          (X == 1 && Y == 1 && Z == 1) ||
          (X == 1 && Y == 0 && Z == 0) ||
          (X == 0 && Y == 1 && Z == 0) ||
          (X == 0 && Y == 0 && Z == 1))) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();

      if (isPossible(x, y, z)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
    sc.close();
  }
}