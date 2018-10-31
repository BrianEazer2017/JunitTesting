package Testing;

import java.util.Arrays;
import java.util.Collections;

public class FindtheMin {
	public static void main(String[] args) {
		Integer[] arr = {9, 5, 6, 8, 3};
		Integer[] answer = insertionSort(arr);
		System.out.println(answer[0]);
		
	}

	private static void selectionSort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
			}
		}
	}
	private static Integer[] insertionSort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < j+1; j++) {
				if (arr[j] > arr[i]) {
					int dummy = arr[i];
					arr[i] = arr[j];
					arr[j] = dummy;
				}
			}
		}
		return arr;
	}
}
