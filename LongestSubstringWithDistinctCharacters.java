import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithDistinctCharacters {

    static String s = "abcdeafbdgcbb";
//    static String s = "dvdf";

    public static void main(String[] args) {

        int answer = lengthOfLongestSubstring(s);

        System.out.println(answer);
    }

    public static int lengthOfLongestSubstring(String str) {

        int length = str.length();
        int max = 0;

        if(length < 2)
        {
            return length;
        }

        Map<Character,Integer> characterIntegerMap = new HashMap<>();

        for (int right = 0, left=0; right < length; right++) {

            if (characterIntegerMap.containsKey(str.charAt(right)))
            {
                //because a duplicate number was found we want to move the left pointer to the found duplicate location.
                left = Math.max(characterIntegerMap.get(str.charAt(right)),left);
            }

            // this gives the maximum value from
            // old maximum value and the current[right] location - current[left] location which gives the distance between them +1 coz 0-indexed.
            max = Math.max(max,right-left+1);
            characterIntegerMap.put(str.charAt(right), right+1);
        }

        return max;
    }
}
