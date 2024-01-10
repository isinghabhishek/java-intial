public class que { 
  
    // Function to find largest prime number 
    static int largestPrime(int arr[][], int n) 
    { 
        // Initialize maximum prime number 
        int maxPrime = -1; 
  
        // Traverse both diagonals of given matrix 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
  
                // Check if current element is prime or not 
                if (isPrime(arr[i][j]) == true) { 
                    maxPrime = Math.max(maxPrime, arr[i][j]); 
                } 
            } 
        } 

        return maxPrime;  

    }

    // Function to check whether a number is prime or not.  

    static boolean isPrime(int n)  
    {  
        // Corner case  
        if (n <= 1) return false;  
        // Check from 2 to n-1  
        for (int i = 2; i < n; i++)  
            if (n % i == 0) return false;  

      

        return true;  

    }    

     public static void main(String[] args) {    											// Main function starts here.    	     	     	     	     	     	     	     	     	     

         int arr[][] = {{1,2,3,4},{4,3,2,1},{7,8,9,6},{13,5,4,3}} ;     // Declaring and initializing the array.    

         int n=arr.length ;                                              // Finding the length of the array.    

         System.out.println("Largest Prime Number among all diagonal elements : "+largestPrime(arr ,n));       // Printing the result by calling the function largestPrime().    

     }                                                                   // Main function ends here.    
}