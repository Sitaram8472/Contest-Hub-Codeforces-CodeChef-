import java.util.*;

public class InteractiveProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int low = 1;
    int high = 1_000_000;

    while (low <= high) {
      int mid = (low + high) / 2;

      // Print the query
      System.out.println(mid);
      System.out.flush();

      // Read the response
      String response = sc.next();

      if (response.equals("<")) {
        high = mid - 1;
      } else {
        // ">="
        low = mid+1;
      }
    }

    System.out.println("! " + high);
    System.out.flush();
  }
}
