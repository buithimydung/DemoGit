package Task1;
	public class MySortedArray {
	    private int[] array;

	    public MySortedArray(int[] array) {
	        this.array = array;
	    }

	    // Iterative binary search
	    public int iterativeBinarySearch(int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid; // Return the index where the target is found.
	            } else if (array[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return -1; // Return -1 if the target is not found in the sorted array.
	    }

	    // Recursive binary search
	    public int recursiveBinarySearch(int target) {
	        return recursiveBinarySearchHelper(target, 0, array.length - 1);
	    }

	    private int recursiveBinarySearchHelper(int target, int left, int right) {
	        if (left > right) {
	            return -1; // Base case: target not found.
	        }

	        int mid = left + (right - left) / 2;

	        if (array[mid] == target) {
	            return mid; // Return the index where the target is found.
	        } else if (array[mid] < target) {
	            return recursiveBinarySearchHelper(target, mid + 1, right);
	        } else {
	            return recursiveBinarySearchHelper(target, left, mid - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {2, 9, 10, 10, 12, 45, 45};
	        MySortedArray myArray = new MySortedArray(sortedArray);
	        
	        int target1 = 45;
	        int result1 = myArray.iterativeBinarySearch(target1);
	        System.out.println("Iterative Binary Search - Target " + target1 + " found at index: " + result1);

	        int target2 = 15;
	        int result2 = myArray.recursiveBinarySearch(target2);
	        System.out.println("Recursive Binary Search - Target " + target2 + " found at index: " + result2);
	    }
	}
