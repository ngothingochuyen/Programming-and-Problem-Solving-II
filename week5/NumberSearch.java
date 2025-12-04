package week5;

import java.util.Scanner;

/**
 * A program that finds the last occurrence of a given number in an integer
 * array.
 */
public class NumberSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int numberOfElements = scanner.nextInt();
		int[] numbers = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}
		System.out.print("Enter the number to search for: ");
		int targetNumber = scanner.nextInt();
		int lastIndex = findLastIndex(numbers, targetNumber);
		if (lastIndex == -1) {
			System.out.println("The number was not found in the array.");
		} else {
			System.out.println("The number was found at index: " + lastIndex);
		}
		scanner.close();
	}

	/**
	 * Finds the last index of a target number in the given array.
	 *
	 * @param numbers The array of integers
	 * @param target  The number to search for
	 * @return The last index where the target number appears, or -1 if not found
	 */
	public static int findLastIndex(int[] numbers, int target) {
		int lastIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

}
