package leetcode.arrays;

import java.util.Arrays;

public class RemoveDublicates {


    public static void main(String[] args) {
        task1();
        task2();
    }


    /**
     * Given nums = [1,1,2],
     * <p>
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * <p>
     * It doesn't matter what you leave beyond the returned length.
     */
    public static void task1() {

        int[] arr = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }



    public static void task2() {

        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }


    public static int removeDuplicatesCorrect(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        System.out.println(Arrays.toString(nums));
        return i + 1;
    }


  // System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,outputIterator)));
    public static int removeDuplicatesNew(int[] nums) {
        if (nums.length == 0) return 0;
        int last = nums[0];
        int outputIterator = 1;
        for (int i = 1; i < nums.length; i++) {
            if (last != nums[i]) {
                last = nums[i];
                nums[outputIterator] = nums[i];
                outputIterator++;
            }
        }

        return outputIterator;
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
               j++;
               nums[j]= nums[i];
            }
        }


        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,j+1)));

        return j ;
    }


}
