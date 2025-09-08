import java.util.*;
public class Chef_Bakes_Cake {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int totalw = n/x;
        System.out.println((n+totalw-1)/totalw);
      
      sc.close();
    }
}
