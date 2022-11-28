import java.util.*;

public class Greatest2Ex1 {
    public static int printGreater(int a, int b) {
        if(a > b) {
            return a;
        } else;
            return b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       System.out.println(printGreater(a, b));
    }
    
}
