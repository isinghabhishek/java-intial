import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Recursion1 {

// 01. print no from 5 to 1.

//     public static void printNumb(int n) {
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n);
//     }
// }


// 02. print the no from 1 to 5.

//     public static void printNumb(int n) {
//         if(n == 6){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n); // n=1
//     }
// }


// 03. print the sum of first n natual nunbers.

//     public static void printSum(int i, int n, int sum){
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return;  // 7
//         }
//         sum += i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }


// 04. Calulation of Factorial

//     public static int calcFactorial(int n){
//         if(n == 1 || n == 0){
//             return 1;
//         }
//         int fact_nm1 = calcFactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     } 
//     public static void main(String[] args) {
//         int n= 5;
//         int ans = calcFactorial(n);
//         System.out.println(ans);
//     }        
// }


// 05. Fibonnaci Series

//     public static void printFib(int a, int b, int n){
//         if(n == 0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printFib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a=0, b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printFib(a, b, n-2);
//     }
// }


// 06. Print x^n (stack height = n)

//     public static int calcPower(int x, int n){
//         if(n == 0) {
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }
//         int xPownm1 = calcPower(x, n-1);  // kaam
//         int xPown = x * xPownm1;
//         return xPown;
//     }
//     public static void main(String[] args) {
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }


// 07. Print x^n (stack height = "logn")

    public static int calcPower1(int x, int n){
        if(n == 0){    // base case 1
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        if(n%2==0){
            return calcPower1(x, n/2)*calcPower1(x, n/2);
        } else{
            return calcPower1(x, n/2)*calcPower1(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower1(x, n);
        System.out.println(ans);
    }
}
