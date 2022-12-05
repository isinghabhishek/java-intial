import java.util.*;
public class Vote5Ex1 {
    public static String CanVote(int age) {
        if(age>18) {
            return "Eligible";
        } else;
           return "Not Eligible";
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(CanVote(age));
    }
}
