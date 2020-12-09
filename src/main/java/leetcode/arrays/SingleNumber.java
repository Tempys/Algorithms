package leetcode.arrays;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(task4());
    }

    public static int task4(){
        int[] arr = new int[]{-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};

        return singleNumber(arr);
    }


    public static int task3(){
        int[] arr = new int[]{2,2,1};

        return singleNumber(arr);
    }


    public static int task2(){
        int[] arr = new int[]{1};

        return singleNumber(arr);
    }

    public static int task1(){
        int[] arr = new int[]{4,1,2,1,2};

        return singleNumber(arr);
    }


    public static int singleNumber(int[] nums) {

        if (nums.length== 1) return nums[0];

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int prev = nums[0];
        boolean second = true;

        for (int i =1;i<nums.length;i++){
            if(i%2 == 0) second = false; else second = true;
            if(nums[i] != prev && second) return prev;
             prev = nums[i];
             second = false;
        }

        if(nums[nums.length-1] != nums[nums.length-2] ) return nums[nums.length-1];

        return 0;
    }


}
