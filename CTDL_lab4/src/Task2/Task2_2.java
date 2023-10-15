package Task2;
	import java.util.Random;

	public class Task2_2 {
	    public static void quickSort(int[] array) {
	        if (array == null || array.length <= 1) {
	            return; // No sorting needed for arrays of length 1 or less
	        }
	        
	        quickSort(array, 0, array.length - 1);
	    }

	    public static void quickSort(int[] array, int left, int right) {
	        if (left < right) {
	            int pivotIndex = choosePivot(array, left, right);
	            int partitionIndex = partition(array, left, right, pivotIndex);
	            
	            quickSort(array, left, partitionIndex - 1);
	            quickSort(array, partitionIndex + 1, right);
	        }
	    }

	    public static int choosePivot(int[] array, int left, int right) {
	        // You can choose the pivot selection strategy here.
	        // 1. First element as the pivot
	        // return left;
	        
	        // 2. Last element as the pivot
	        // return right;
	        
	        // 3. Random element as the pivot
	        // return left + new Random().nextInt(right - left + 1);
	        
	        // 4. Median-of-three elements as the pivot (to avoid worst-case behavior)
	        int mid = left + (right - left) / 2;
	        if (array[left] > array[mid]) {
	            if (array[mid] > array[right]) {
	                return mid;
	            } else if (array[left] > array[right]) {
	                return right;
	            } else {
	                return left;
	            }
	        } else {
	            if (array[left] > array[right]) {
	                return left;
	            } else if (array[mid] > array[right]) {
	                return mid;
	            } else {
	                return right;
	            }
	        }
	    }

	    public static int partition(int[] array, int left, int right, int pivotIndex) {
	        int pivotValue = array[pivotIndex];
	        swap(array, pivotIndex, right);
	        int storeIndex = left;
	        for (int i = left; i < right; i++) {
	            if (array[i] >= pivotValue) {
	                swap(array, i, storeIndex);
	                storeIndex++;
	            }
	        }
	        swap(array, storeIndex, right);
	        return storeIndex;
	    }

	    public static void swap(int[] array, int a, int b) {
	        int temp = array[a];
	        array[a] = array[b];
	        array[b] = temp;
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 3, 6};
	        quickSort(arr);

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	
}
