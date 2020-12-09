package leetcode.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(task1());
    }


    public static boolean task1(){
        int[] arr = new int[]{1,2,3,4};

        return containsDuplicate(arr);
    }


        public static boolean containsDuplicate(int[] nums) {
            if (nums.length<2) return false;
            Arrays.sort(nums);

            int prev = nums[0];
            for(int i =1; i<nums.length;i++){
                if(nums[i] == prev) return true;
                 prev = nums[i];
            }

           return false;
        }

}
