/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23

 */

public class MaxSubArray {

    static int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

    public static void main(String[] args) {

        int ans = maxSubArray(nums);
        int ans2 = maxSubArray2(nums);

        System.out.println("Answer = " + ans);
        System.out.println("Answer2 = " + ans2);

    }

    //Brute Force.
    public static int maxSubArray(int[] nums) {

        //1. Initialize int maxSubarrray as (-infinity).
        //because there can be only negative numbers and this can lead to negative or 0 answer.
        int maxSubarray = Integer.MIN_VALUE;


        //2. Take a for loop iterate through nums.
        for (int i = 0; i < nums.length; i++)
        {

            //3. For each int i in nums take an int currentSubArrayTotal.
            //this keeps track of what is our current total.
            int currentSubArrayTotal = 0;

            //4. Now loop through the whole array for every element i and add it to currentSubArrayTotal.
            for (int j = i; j < nums.length; j++) {

                currentSubArrayTotal += nums[j];

                //5. Keep updating the maxSubarray with the max between that and currentsubarraytotal.
                maxSubarray = Math.max(maxSubarray, currentSubArrayTotal);
            }
        }

        //6. Return maxSubarray.
        return maxSubarray;
    }


    //Dynamic Programming.
    public static int maxSubArray2(int[] nums) {

        if (nums == null || nums.length == 0)
        {
            return 0;
        }

        //1. Initialize two integers maxSubarray and currentSubarray as the first element of the array.
        int maxSubarray = nums[0];
        int currentSubarray = nums[0];


        //2. Iterate through the array and keep track of both integers.
        // start at 1 coz we used first element(0) already above.
        for (int i = 1; i < nums.length; i++) {

            //3. This updates currentsubarray which helps us decide which numbers to throw away.
            currentSubarray = Math.max(nums[i], currentSubarray + nums[i]);

            //4. This keeps track of the last seen Max value.
            maxSubarray = Math.max(maxSubarray, currentSubarray);

        }

        //5. return maxSubarray.
        return maxSubarray;
    }
}
