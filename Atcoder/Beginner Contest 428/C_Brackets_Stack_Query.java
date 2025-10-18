import java.util.*;

public class C_Brackets_Stack_Query {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();

    StringBuilder s = new StringBuilder();
    Deque<int[]> stateStack = new ArrayDeque<>();
    int balance = 0;
    int minBalance = 0;

    for (int i = 0; i < q; i++) {
      int type = sc.nextInt();
      if (type == 1) {
        char c = sc.next().charAt(0);
        s.append(c);

        if (c == '(')
          balance++;
        else
          balance--;

        minBalance = Math.min(minBalance, balance);

        stateStack.push(new int[] { balance, minBalance });
      } else {
        s.deleteCharAt(s.length() - 1);
        stateStack.pop();
        if (stateStack.isEmpty()) {
          balance = 0;
          minBalance = 0;
        } else {
          int[] prev = stateStack.peek();
          balance = prev[0];
          minBalance = prev[1];
        }
      }

      if (balance == 0 && minBalance >= 0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}
