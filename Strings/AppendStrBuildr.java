import java.util.*;
public class AppendStrBuildr {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("H");
        sb.append("e"); //str = str + "e";
        sb.append("l"); //str = str + "l";
        sb.append("l");
        sb.append("o");
        System.out.println(sb.length());
    }
    
}
