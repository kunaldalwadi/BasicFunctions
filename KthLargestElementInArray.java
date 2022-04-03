/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5


Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */

import java.util.Arrays;

public class KthLargestElementInArray {

    static int[] nums = {3,2,3,1,2,4,5,5,6};
    static int k = 4;

    public static void main(String[] args) {

        int kLargest = findKLargest(nums, k);

        System.out.println("K largest = " + kLargest);


    }

    public static int findKLargest(int[] nums, int k) {

        Arrays.sort(nums);

        if (nums.length >= k)
        {
            int count = 1;
            for (int i = nums.length - 1; i >= 0; i--) {

                if(count == k)
                {
                    return nums[i];
                }
                count++;
            }
        }

        return  -1;

    }
}
