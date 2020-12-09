package leetcode.arrays;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(task3()));
    }


    public static int[] task3() {
        int[] nums = new int[]{ 0};
        moveZeroes(nums);
        return nums;
    }


    public static int[] task2() {
        int[] nums = new int[]{1, 1, 2, 3, 0};
        moveZeroes(nums);
        return nums;
    }


    public static int[] task1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes(nums);
        return nums;
    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            if (i+1<nums.length  &&  nums[i] == 0) {
                int notNullCount = i + 1;
                while (notNullCount < nums.length-1  &&  nums[notNullCount] == 0  ) {
                    notNullCount++;
                }

                nums[i] = nums[notNullCount];
                nums[notNullCount] = 0;

            }
        }

    }


}

