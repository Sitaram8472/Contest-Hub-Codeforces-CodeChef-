import java.io.*;
import java.util.*;

public class C_Find_Vibhaas {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws Exception {
    solve();
    out.close();
  }

  private static void solve() throws Exception {

    long lx = 0, rx = (long) 1e9;
    long ly = 0, ry = (long) 1e9;

    while (lx <= rx || ly <= ry) {
      long mx = lx + (rx - lx) / 2;
      long my = ly + (ry - ly) / 2;

      out.println("? " + mx + " " + my);
      out.flush();

      String res = br.readLine();
      if (res == null)
        break;

      if (res.equals("HERE")) {
        out.println("! " + mx + " " + my);
        out.flush();
        return;
      }

      if (res.contains("LEFT")) {
        rx = mx - 1;
      } else if (res.contains("RIGHT")) {
        lx = mx + 1;
      } else {

        lx = rx = mx;
      }

      if (res.contains("DOWN")) {
        ry = my - 1;
      } else if (res.contains("UP")) {
        ly = my + 1;
      } else {

        ly = ry = my;
      }
    }
  }
}