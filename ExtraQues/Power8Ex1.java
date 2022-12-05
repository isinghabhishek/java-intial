import java.util.*;
public class Power8Ex1 {
    
        public static void main(String args[]) {
            System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int result = 1;
        for(int i=0; i<n; i++) {
            result = result * x;
        }
    }
    
}
