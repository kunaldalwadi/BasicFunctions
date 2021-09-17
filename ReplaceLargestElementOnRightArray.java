import java.util.Arrays;

public class ReplaceLargestElementOnRightArray {

    static int[] nums = new int[]{17, 18, 5, 4, 6, 1};

    public static void main(String[] args) {

        replaceElements(nums);
    }

    private static void printArray() {
        System.out.println(Arrays.toString(nums));
    }

    private static int[] replaceElements(int[] nums) {

        if (nums == null || nums.length < 2) {
            nums[0] = -1;
            return nums;
        }

        int max;

        for (int i = 0; i < nums.length; i++) {

            if (i + 1 < nums.length) {
                max = nums[i + 1];

                for (int j = i + 1; j < nums.length; j++) {

                    if (max < nums[j]) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }

        nums[nums.length - 1] = -1;

        return nums;
    }
}
