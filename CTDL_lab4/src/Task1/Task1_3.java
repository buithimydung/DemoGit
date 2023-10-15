package Task1;

public class Task1_3 {
	public static void insertionSort(int[] array) {
	    int n = array.length;
	    for (int i = 1; i < n; i++) {
	        int key = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j] < key) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	}

	public static void main(String[] args) {
	    int[] arr = {5, 2, 9, 3, 6};
	    insertionSort(arr);
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}
}
