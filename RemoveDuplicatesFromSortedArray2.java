import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {

    static int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};


    private static void printArray() {
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        printArray();
        removeDuplicates(nums);
        printArray();

    }

    private static int removeDuplicates(int[] nums) {
        int arrayLength = nums.length;
        int count = 1;
        int i = 1;

        while (i < arrayLength) {

            if (nums[i - 1] == nums[i]) {
                count++;

                System.out.println(count);
                if (count > 2) {
                    //shift everything forward 1 step.
                    for (int j = i + 1; j < nums.length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    i--;
                    arrayLength--;

                }
            } else {
                count = 1;
            }
            i++;
        }


        return arrayLength;
    }
}
