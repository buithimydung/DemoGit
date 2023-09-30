
	package task1;
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Set;
	public class MyArray {
	    private int[] array;

	    public MyArray(int[] array) {
	        this.array = array;
	    }

	    // Method to mirror the array
	    public int[] mirror() {
	        int length = array.length;
	        int[] mirroredArray = new int[2 * length];

	        for (int i = 0; i < length; i++) {
	            mirroredArray[i] = array[i];
	            mirroredArray[2 * length - i - 1] = array[i];
	        }

	        return mirroredArray;
	    }

	    // Method to remove duplicates from the array
	    public int[] removeDuplicates() {
	        Set<Integer> uniqueElements = new HashSet<>();
	        int uniqueCount = 0;

	        for (int value : array) {
	            uniqueElements.add(value);
	        }

	        int[] resultArray = new int[uniqueElements.size()];

	        for (int value : uniqueElements) {
	            resultArray[uniqueCount] = value;
	            uniqueCount++;
	        }

	        return resultArray;
	    }
	     //Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	    public static void main(String[] args) {
	        int[] inputArray1 = {1, 2, 3};
	        MyArray myArray1 = new MyArray(inputArray1);

	        // Mirror the array
	        int[] mirroredResult = myArray1.mirror();
	     
	     //Input: 1 3 5 1 3 7 9 8
	     //Output: 1 3 5 7 9 8

	        int[] inputArray2 = {1, 3, 5, 1, 3, 7, 9, 8};
	        MyArray myArray2 = new MyArray(inputArray2);

	        // Remove duplicates from the array
	        int[] uniqueResult = myArray2.removeDuplicates();
	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueResult));
	    }
}
