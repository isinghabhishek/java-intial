import java.util.*;
public class Compare {
    public static void main(String args[]) {
        //compare
        String name1 = "Abhishek";
        String name2 = "Abhishek";

        //1 s1>s2 : +ve Value
        //2 s1==s2 :0
        //3 s1<s2 : -ve Value
        // hello wello
        //aahello  aabello
        //Best Way To Compare Strings
        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("Strings are Equal");

        // } else {
        //     System.out.println("String are Not Equal");
        // }

// Not Always True While Comparing Strings
        // if(name1 == name2) {
        //     System.out.println("Strings are Equal");

        // } else {
        //     System.out.println("String are Not Equal");
        // }
        if(new String("Abhishek") == new String("Abhishek")) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("String Are Not Equal");
        }
    }
    
}
