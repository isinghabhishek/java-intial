import java.util.*;
public class Concatenation {
    public static void main(String args[]) {
        //concartenation
        String firstName = "Abhishek";
        String lastName = "Singh";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName.length());

        //charAt
        // printing individual character
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
    
}
