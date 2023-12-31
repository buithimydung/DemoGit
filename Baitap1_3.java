package Baitap1;
import java.util.Scanner;
public class Baitap1_3 {
	// This method is used to display a Pascal triangle based on the parameter n.
	// Where n represents the number of rows
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the number of rows to print: ");
	    int rows = scanner.nextInt();
	    System.out.println("Pascal Triangle:");
	    print(rows);
	    scanner.close();
	  }

	  public static void print(int n) {
	    for (int i = 0; i < n; i++) {
	      for (int k = 0; k < n - i; k++) {
	        System.out.print(" "); // print space for triangle like structure
	      }
	      for (int j = 0; j <= i; j++) {
	        System.out.print(pascal(i, j) + " ");
	      }
	      System.out.println();
	    }
	  }

	  public static int pascal(int i, int j) {
	    if (j == 0 || j == i) {
	      return 1;
	    } else {
	      return pascal(i - 1, j - 1) + pascal(i - 1, j);
	    }
	  }
	}

