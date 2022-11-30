
    import java.util.*;

public class greaterNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Calculator = sc.nextInt();

        switch(Calculator) {
            case 1 : System.out.println("Addition");
            System.out.println(a+b);
            break;
            case 2 : System.out.println("Subsrtration");
            System.out.println(a-b);
            break;
            case 3 : System.out.println("Multiplication-a*b");
            System.out.println(a*b);
            break;
            case 4 : System.out.println("Division-a/b");
            System.out.println(a/b);
            break;
        }
                
        }
            
    }
    

