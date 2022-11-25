import java.util.*;

public class L6Q12 {
    public static void main(String args[]) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
             }
             // number -> print row no
             for(int j=1; j<=i; j++) {
                 System.out.print(i +" ");
             }
             System.out.println();
        }
    }
    
}
