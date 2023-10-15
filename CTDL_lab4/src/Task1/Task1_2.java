package Task1;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
	    int n = array.length;
	    boolean swapp;

	    for (int i = 0; i < n - 1; i++) {
	        swapp = false;
	        for (int j = 0; j < n - i - 1; j++) {
	            if (array[j] < array[j + 1]) { 
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	                swapp = true;
	            }
	        }
	        if (!swapp) {
	            break;
	        }
	    }
	}
	public static void main(String[] args) {
	    int[] array = {5, 2, 9, 1, 5, 6};
	    bubbleSort(array);
	    
	    // Print the sorted array
	    for (int num : array) {
	        System.out.print(num + " ");
	    }
	}

}
