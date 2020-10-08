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
        System.out.println(removeDuplicatesCorrect(arr));
        //System.out.println(Arrays.toString(arr));
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



    public static int removeDuplicates(int[] nums) {

        int[] output = new int[nums.length];

        int last = nums[0];

        int outputIterator = 1;
        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last != nums[i]) {
                last = nums[i];
                output[outputIterator] = nums[i];
                outputIterator++;
            }
        }



        System.out.println(Arrays.toString(Arrays.copyOfRange(output,0,outputIterator)));

        return outputIterator ;
    }
}
