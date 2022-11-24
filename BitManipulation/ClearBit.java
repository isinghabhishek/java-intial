import java.util.*;
public class ClearBit {
    public static void main(String agrs[]) {
        Scanner Scan = new Scanner(System.in).useLocale(Locale.US);
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}    


    

