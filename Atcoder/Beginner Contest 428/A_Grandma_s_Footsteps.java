import java.util.*;

public class A_Grandma_s_Footsteps {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int S = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int X = sc.nextInt();

    int cycle = A + B;
    int full = X / cycle;
    int rem = X % cycle;

    int distance = full * S * A + S * Math.min(rem, A);

    System.out.println(distance);
  }
}
