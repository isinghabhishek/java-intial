import java.util.*;
public class MaxMin2L9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size]; 

        //input
        for(int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++) {
            if(number[i] < min) {
                min = number[i];
            }
            if(number[i] > max) {
                max = number[i];
            }

        }
    }
    
}
