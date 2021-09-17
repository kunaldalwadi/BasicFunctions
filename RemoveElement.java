import java.util.Arrays;

public class RemoveElement {

    static int[] nums = new int[]{3,2,2,1,3};
    static int val = 3;

    public static void main(String[] args) {

        int i = removeElement(nums, val);

        System.out.println(i);

        printArray();
    }


    public static int removeElement(int[] nums, int val)
    {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void printArray(){
        System.out.println(Arrays.toString(nums));
    }
}
