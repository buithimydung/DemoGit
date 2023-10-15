package Task1;

public class Task1_1 {
				public static void selectionSort(int[] array) {
				    int n = array.length;
				    for (int i = 0; i < n - 1; i++) {
				        int maxIndex = i;
				        // Find the index of the maximum element in the unsorted part of the array
				        for (int j = i + 1; j < n; j++) {
				            if (array[j] > array[maxIndex]) {
				                maxIndex = j;
				            }
				        }
				        
				        // Swap the maximum element with the current element
				        int temp = array[i];
				        array[i] = array[maxIndex];
				        array[maxIndex] = temp;
				    }
				}
				public static void main(String[] args) {
				    int[] array = {10, 2, 9, 1, 5, 26};
				    selectionSort(array);
				    
				    // Print the sorted array
				    for (int num : array) {
				        System.out.print(num + " ");
				    }
				}
			}


