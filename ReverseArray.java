package ReverseArray;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String aa[]) {

		int[] arr = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		reverseIntArray(arr);
		
		System.out.print(" " + Arrays.toString(arr));
	}
	
	private static void reverseIntArray(int[] arr) {
		int length = arr.length;
		int temp;

		if (length > 1) {
			for (int i = 0; i < length; i++) {
				length--;

				temp = arr[length];
				arr[length] = arr[i];
				arr[i] = temp;

				if (length == i || length == i - 1)
					break;

			}
		}
	}
}
