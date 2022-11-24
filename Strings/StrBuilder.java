import java.util.*;
public class StrBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // character at index 0
        System.out.println(sb.charAt(0));

        //setting new character
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //insertting new character
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);
    }
    
}
