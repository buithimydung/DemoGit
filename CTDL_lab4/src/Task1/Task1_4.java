package Task1;

public class Task1_4 {
	public static void insertionSort(int[] array, int n) {
	    if (n <= 1) return;

	    insertionSort(array, n - 1);

	    int key = array[n - 1];
	    int j = n - 2;
	    while (j >= 0 && array[j] < key) {
	        array[j + 1] = array[j];
	        j--;
	    }
	    array[j + 1] = key;
	}

	public static void main(String[] args) {
	    int[] arr = {5, 2, 9, 3, 6};
	    insertionSort(arr, arr.length);
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	}
}
