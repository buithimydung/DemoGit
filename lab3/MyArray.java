package Task1;
	public class MyArray {
	    private int[] array;

	    public MyArray(int[] array) {
	        this.array = array;
	    }
	    // To find the index of the target in the array. If the target
	    // is not found in the array, then the method returns -1.
	    // Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	 // Output: 3
	    public int iterativeLinearSearch(int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; // Return the index where the target is found.
	            }
	        }
	        return -1; // Return -1 if the target is not found in the array.
	    }
	 // To find the index of the target in the array. If the target
	 // is not found in the array, then the method returns -1.
	 // Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	 // Output: -1

	    // Recursive linear search
	    public int recursiveLinearSearch(int target) {
	        return recursiveLinearSearchHelper(target, 0);
	    }

	    private int recursiveLinearSearchHelper(int target, int index) {
	        // Base case: If the current index is out of bounds, return -1.
	        if (index >= array.length) {
	            return -1;
	        }

	        // Base case: If the current element is equal to the target, return the current index.
	        if (array[index] == target) {
	            return index;
	        }

	        // Recursive case: Search for the target in the rest of the array.
	        return recursiveLinearSearchHelper(target, index + 1);
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
	        MyArray myArray = new MyArray(array);
	        
	        int target1 = 45;
	        int result1 = myArray.iterativeLinearSearch(target1);
	        System.out.println("Iterative Search - Target " + target1 + " found at index: " + result1);

	        int target2 = 15;
	        int result2 = myArray.recursiveLinearSearch(target2);
	        System.out.println("Recursive Search - Target " + target2 + " found at index: " + result2);
	    }
	}

