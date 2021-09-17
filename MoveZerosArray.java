import java.util.Arrays;

public class MoveZerosArray {

    static int[] nums = new int[]{4, 5, 0, 1, 0, 3, 12};

    public static void main(String[] args) {

        printArray();
        removeZeros(nums);
        printArray();

    }

    private static void removeZeros(int[] nums) {

        int count = 0;
        //count number of zeros
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
            {
                count++;
            }
        }

        System.out.println("Count = " + count);

        //move all non-zero elements together
        int writePointer = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0)
            {
                nums[writePointer] = nums[j];
                writePointer++;
            }
        }

        //add count number of zeros at the end;
        int k = 1;
        while (count != 0)
        {
            nums[nums.length-k] = 0;
            k++;
            count--;
        }

    }

    public static void printArray() {
        System.out.println(Arrays.toString(nums));
    }
}
