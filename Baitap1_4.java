package Baitap1;

public class Baitap1_4 {

	    public static void moveDisk(int n, char source, char destination, char auxiliary) {
	        if (n == 1) {
	            System.out.println("Move disk 1 from " + source + " to " + destination);
	            return;
	        }
	        
	        // Move n-1 disks from source to auxiliary peg
	        moveDisk(n - 1, source, auxiliary, destination);
	        
	        // Move the nth disk from source to destination peg
	        System.out.println("Move disk " + n + " from " + source + " to " + destination);
	        
	        // Move the n-1 disks from auxiliary to destination peg
	        moveDisk(n - 1, auxiliary, destination, source);
	    }

	    public static void main(String[] args) {
	        int numberOfDisks = 3;
	        char sourcePeg = 'A';
	        char destinationPeg = 'C';
	        char auxiliaryPeg = 'B';
	        
	        moveDisk(numberOfDisks, sourcePeg, destinationPeg, auxiliaryPeg);
	    }
	}