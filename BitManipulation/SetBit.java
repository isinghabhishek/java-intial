import java.util.*;
public class SetBit {
    public static void main(String agrs[]) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}    
