import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;

public class validMountainArray {

    static int[] nums = new int[]{2,4,4};

    public static void main(String[] args) {

        boolean b = checkIfValidMountainArray(nums);

        System.out.println(b);
    }

    private static void printArray() {
        System.out.println(Arrays.toString(nums));
    }

    private static boolean checkIfValidMountainArray(int[] nums) {


        if (nums == null || nums.length < 3)
        {
            return false;
        }

        int ptr = 0;

        while (ptr+1 < nums.length && nums[ptr] < nums[ptr+1])
        {
            ptr++;
        }

        if(ptr == 0 || ptr == nums.length-1 )
        {
            return false;
        }

        while (ptr+1 < nums.length && nums[ptr] > nums[ptr+1])
        {
            ptr++;
        }

        if(ptr == nums.length-1)
        {
            return true;
        }

        return false;
    }
}
