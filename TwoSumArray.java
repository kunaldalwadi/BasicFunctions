import java.util.Arrays;

//Find two numbers in an Array that adds up to the target number;
//return the indices of the numbers that adds up to the target;
public class TwoSumArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};
        int target = 5;

        System.out.println("Nums = " + Arrays.toString(nums));

        int[] printThis = twoSum(nums, target);

        System.out.println("Nums = " + Arrays.toString(printThis));

    }


    public static int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        if (nums != null || nums.length != 0)
        {

            for(int i=0; i< nums.length; i++)
            {
                for(int j=i+1; j< nums.length; j++) {

                    int total = nums[i] + nums[j];

                    if (total == target)
                    {
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }

        }

        return answer;
    }
}
