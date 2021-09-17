import java.util.Arrays;

public class SortArrayByParity {

    static int[] nums = new int[]{4, 5, 0, 1, 0, 3, 12};

    public static void printArray() {
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        printArray();
        sortByParity(nums);
        printArray();

    }

    private static int[] sortByParity(int[] nums) {

        if (nums == null || nums.length <2)
        {
            return nums;
        }

        int temp;
        int writePointer = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]%2 == 0)
            {
                temp = nums[i];
                nums[i] = nums[writePointer];
                nums[writePointer] = temp;

                writePointer++;

            }
        }

        return nums;
    }

}
