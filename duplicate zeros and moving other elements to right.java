import java.util.Arrays;
import java.util.Scanner;

public class DuplicateZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        duplicateZeros(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
        
        scanner.close();
    }

    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        // Count the number of zeros to be duplicated
        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                // Edge case: Check if the zero is at the end of the array
                if (i == length - possibleDups) {
                    // For this zero, we just copy it without duplication
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element to be copied
        int last = length - possibleDups;

        // Copy zero twice, and non-zero once
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
