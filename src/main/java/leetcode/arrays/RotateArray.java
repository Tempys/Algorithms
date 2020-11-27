package leetcode.arrays;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Follow up:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 104
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 */
public class RotateArray {

    public static void main(String[] args) {
        System.out.println( Arrays.toString(task6()));
    }

    private static int[] task1(){
        int[] a = new int[] {1,2,3,4,5,6,7};
        rotate1(a,3);
        return a;
    }

    private static int[] task2(){
        int[] a = new int[] {-1,-100,3,99};
        rotate1(a,2);
        return a;
    }

    private static int[] task4(){
        int[] a = new int[] {-1};
        rotate1(a,1);
        return a;
    }

    private static int[] task5(){
        int[] a = new int[] {1,2};
        rotate1(a,4);
        return a;
    }

    private static int[] task6(){
        int[] a = new int[] {1,2,3};
        rotate1(a,4);
        return a;
    }

    public void rotate(int[] nums, int k) { }

    public static void rotate1(int[] nums, int k) {
        if(k > nums.length) k = k- nums.length;

        int[] rotatesPart = Arrays.copyOfRange(nums, nums.length - k, nums.length);

        for (int i = nums.length - 1; i >= 0; i--) {
            if(i-k < 0) { break; }
          //  System.out.println(nums[i-k] +" "+ (i-k) +"  "+ i);
            nums[i]= nums[i-k];
        }

        System.arraycopy(rotatesPart,0,nums,0,rotatesPart.length);


    }
}
