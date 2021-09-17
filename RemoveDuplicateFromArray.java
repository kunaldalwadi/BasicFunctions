import javax.sound.midi.MidiFileFormat;
import java.util.Arrays;

public class RemoveDuplicateFromArray {

    static int[] nums = new int[]{1, 2, 2, 2, 2, 3, 4, 4, 5, 6};

    public static void main(String[] args) {

        printArray();

        int elementsInArray = removeDuplicates(nums);

        System.out.println(elementsInArray);

        printArray();

    }

    private static void printArray() {
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            printArray();
        }
        return i + 1;
    }

}
