// Given an array, rotate the array to the right by k steps, where k is non-negative.
// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 step to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

import java.util.Scanner;

public class RotateTheArray {
    // Not use above Explanation:
    // 7 6 5 4 3 2 1
    // 5 6 7 1 2 3 4
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] array=new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elemant: ");
            array[i]=sc.nextInt();
        }

        for(int i: array){
            System.out.print(i+" ");
        }

        System.out.print("\nEnter the non negative value of k: ");
        int k= sc.nextInt();

        rotate(array, k);

        for(int i: array){
            System.out.print(i+" ");
        }

        sc.close();
    }
}
