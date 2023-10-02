package Baitap1;

public class Baitap1_2 {
	    // Recursive method to get the nth value of the Fibonacci series
	    public static int getFibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return getFibonacci(n - 1) + getFibonacci(n - 2);
	        }
	    }

	    
	 // This method is used to display a Fibonaccci series based on the parameter n. 
	 //Ex. n=10 ==> 0 1 1 2 3 5 8 13 21 34
	    public static void printFibonacci(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.print(getFibonacci(i) + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int n = 10; // Change this value to the desired number of Fibonacci numbers
	        printFibonacci(n);
	    }
	}


