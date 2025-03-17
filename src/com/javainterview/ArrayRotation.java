package com.javainterview;


/*Write a Java method rotateArray that rotates the given integer array arr to the right by d positions.
For example, given the input:
	int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
 	int d = 2;
 *
 *  Output - {12, 3, 5, 7, 2, 8, -1, 4, 10}
 *			 {10, 12, 3, 5, 7, 2, 8, -1, 4}
 *
*/
	
import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int d = 2;

        for (int i = 0; i < d; i++) {
            array = rotateArray(array);
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[] rotateArray(int[] arr) {
        int n = arr.length;
        int[] rotated = new int[n];

        // Shift all elements to the right
        rotated[0] = arr[n - 1]; // Move the last element to the first position
        for (int i = 1; i < n; i++) {
            rotated[i] = arr[i - 1];
        }

        return rotated;
    }
}
