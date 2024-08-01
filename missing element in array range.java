import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);
        
        scanner.close();
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}
