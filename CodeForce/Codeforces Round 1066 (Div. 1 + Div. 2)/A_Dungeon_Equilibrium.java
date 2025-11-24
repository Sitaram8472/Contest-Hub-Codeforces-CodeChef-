import java.util.*;


public class A_Dungeon_Equilibrium {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
       int n = sc.nextInt();
       int[] num = new int[n];
       for(int i=0; i<n; i++){
        num[i] = sc.nextInt();
        }
        int[] f = new int[101];
        for(int  i : num){
          f[i]++;
        }

        int ans = 0;
        for(int i=0; i<101; i++){
          if(f[i]>0 && f[i] > i){
            ans += Math.abs(f[i]-i);
          } else if( f[i]>0 && f[i] < i){
            ans+= f[i];
          }
        }
        System.out.println(ans);
      }
      sc.close();
    }
}
