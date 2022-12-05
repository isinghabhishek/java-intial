import java.util.*;

public class OddSum2Ex1 {

    public static void Sumodd(int n) {
       
        int Average = 0;
        
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) {
            Average = Average + i;
        }
      }
      System.out.println(Average);

        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Sumodd(n); 
            
        }

}
    
