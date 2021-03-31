package leetcode.arrays;


import java.util.Arrays;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * <p>
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionofTwoArraysII {

    public static void main(String[] args) {
        task4();

    }

    public static void task2() {

        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{9, 5, 4, 4, 1, 10, 3434, 43434};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        ;
    }

    // [1,3,8,9,3]
     //        [1,0]

    public static void task4() {

        int[] nums1 = new int[]{1,3,8,9,3};
        int[] nums2 = new int[]{1,0};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        ;
    }

    public static void task3() {

        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        ;
    }

    public static void task1() {

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        ;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int[] first = null;
        int[] second = null;
        int[] result = null;

        if (nums1.length > nums2.length) {
            first = nums1;
            second = nums2;
            result = new int[second.length];
        } else {
            first = nums2;
            second = nums1;
            result = new int[second.length];
        }

        int count = 0;
        int second_track = 0;

        for (int i = 0; i < first.length; i++) {

            if (second.length > second_track) {

                if (first[i] < second[second_track]) {
                    // wait when first is equels or more
                } else if (first[i] == second[second_track]) {
                    result[count] = first[i];
                    count++;
                    second_track++;
                } else {
                    second_track++;
                    i = i-1;
                    // wait when second will be bigger than first
                }
            }



        }

        return Arrays.copyOf(result, count);     //result;
    }

}
