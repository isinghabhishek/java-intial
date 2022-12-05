import java.util.*;
public class CoutNo7Ex1 {
public static void main(String args[]) {
    int positive = 0, negative = 0, zero = 0;
    System.out.println("Press 1 to continue & 0 to stop");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    while(input == 1) {
         System.out.println("Enter your number :");
         int number = sc.nextInt();
         if(number > 0) {
             positive++;
         }  else if(number < 0) {
             negative++;

         }  else {
              zero++;
            }
        }
    }
}


