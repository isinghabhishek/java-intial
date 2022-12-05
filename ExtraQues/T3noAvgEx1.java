import java.util.*;
public class T3noAvgEx1{
   public static int Average(int a, int b, int c) {
       //operation
    int sum = (a+b+c)/3;
       return sum;
   }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = Average(a, b, c);
        System.out.println(sum); 
    
    }
    
}
