import java.util.*;
public class Radius4Ex1 {
    public static Double CircumOfCircle(Double radius)  {
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(CircumOfCircle(radius));

    }

}