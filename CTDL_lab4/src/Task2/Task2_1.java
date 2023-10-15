package Task2;

public class Task2_1 {
	public static void mergeSort(int[] array) {
	    if (array == null) {
	        return;
	    }
	    
	    if (array.length > 1) {
	        int Middle = array.length / 2;
	        int[] LeftHalf = new int[Middle];
	        int[] RightHalf = new int[array.length - Middle];

	        // Copy data to left and right subarrays
	        for (int i = 0; i < Middle; i++) {
	            LeftHalf[i] = array[i];
	        }
	        for (int i = Middle; i < array.length; i++) {
	            RightHalf[i - Middle] = array[i];
	        }

	        // Recursively sort the left and right subarrays
	        mergeSort(LeftHalf);
	        mergeSort(RightHalf);

	        // Merge the sorted subarrays
	        merge(array, LeftHalf, RightHalf);
	    }
	}

	public static void merge(int[] array, int[] left, int[] right) {
	    int i = 0, j = 0, k = 0;

	    while (i < left.length && j < right.length) {
	        if (left[i] >= right[j]) {
	            array[k++] = left[i++];
	        } else {
	            array[k++] = right[j++];
	        }
	    }

	    while (i < left.length) {
	        array[k++] = left[i++];
	    }

	    while (j < right.length) {
	        array[k++] = right[j++];
	    }
	}

	public static void main(String[] args) {
	    int[] arr = {5, 2, 9, 3, 6};
	    mergeSort(arr);

	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}
}
