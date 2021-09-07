import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] chars = new char[]{'H','a','N','n','A','h'};

        System.out.println("Initial = " + Arrays.toString(chars));

        reverseString(chars);
    }

    public static void reverseString(char[] chars) {

        char temp;

        for (int i=0; i<chars.length/2; i++)
        {
            temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }

        System.out.println("Final = " + Arrays.toString(chars));

    }
}
