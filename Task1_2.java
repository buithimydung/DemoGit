package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1_2 {

	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public static int[] getMissingValues(int[] inputArray) {
		List<Integer> missingValues = new ArrayList<>();

		for (int i = inputArray[0]; i < inputArray[inputArray.length - 1]; i++) {
			if (Arrays.binarySearch(inputArray, i) < 0) {
				missingValues.add(i);
			}
		}

		int[] resultArray = new int[missingValues.size()];
		for (int i = 0; i < missingValues.size(); i++) {
			resultArray[i] = missingValues.get(i);
		}

		return resultArray;
	}

	// Input: 10 11 12 -1 14 10 17 19 20
	// Output(k=3): 10 11 12 12 14 16 17 19 20
	public static int[] fillMissingValues(int[] inputArray, int k) {
		List<Integer> filledValues = new ArrayList<>();

		for (int i = 0; i < inputArray.length; i++) {
			filledValues.add(inputArray[i]);

			if (i < inputArray.length - 1) {
				int diff = inputArray[i + 1] - inputArray[i];
				for (int j = 1; j < diff; j++) {
					for (int m = 0; m < k; m++) {
						filledValues.add(inputArray[i] + j);
					}
				}
			}
		}

		int[] resultArray = new int[filledValues.size()];
		for (int i = 0; i < filledValues.size(); i++) {
			resultArray[i] = filledValues.get(i);
		}

		return resultArray;
	}

	public static void main(String[] args) {

		int[] inputArray1 = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		int[] missingValues = getMissingValues(inputArray1);
		System.out.println("Missing Values: " + Arrays.toString(missingValues));

		int[] inputArray2 = { 10, 11, 12, -1, 14, 10, 17, 19, 20 };
		int k = 3;
		int[] filledValues = fillMissingValues(inputArray2, k);
		System.out.println("Filled Values: " + Arrays.toString(filledValues));
	}

}
