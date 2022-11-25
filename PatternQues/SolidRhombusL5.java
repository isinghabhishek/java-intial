import java.util.*;
public class SolidRhombusL5 {
    public static void main(String args[]) {
        int n = 5;
        //outer loop
        for(int i=0; i<n; i++) {
            //inner loop ->space print
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            //inner loop-> star print
            for(int j=0; j<5; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
    
}
