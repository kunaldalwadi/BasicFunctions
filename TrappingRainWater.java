//Given n non-negative integers representing an elevation map where the width of each bar is 1,
//compute how much water it can trap after raining.

import java.util.Stack;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        int totalQuantity = calculateWaterAmount(height);

        System.out.println("Total Water stored = " + totalQuantity);

    }

    //Approach using 2 pointers.
    public static int calculateWaterAmount(int[] height) {

        int quantity = 0;

        if (height.length == 0)
        {
            return quantity;
        }


        int LEFT_MAX = 0;
        int RIGHT_MAX = 0;

        int left = 0;
        int right = height.length-1;

        while (left < right)
        {
            if (height[left] < height[right])
            {
                if (height[left] >= LEFT_MAX)
                {
                    LEFT_MAX = height[left];
                }
                else // when LEFT_MAX > height[left]
                {
                    quantity += LEFT_MAX - height[left];
                }

                left++;
            }
            else //when height[left] >= height[right]
            {
                if (height[right] >= RIGHT_MAX)
                {
                    RIGHT_MAX = height[right];
                }
                else //when RIGHT_MAX > height[right]
                {
                    quantity += RIGHT_MAX - height[right];
                }

                right--;
            }
        }

        return quantity;
    }

}
