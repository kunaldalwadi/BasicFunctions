//Check is the string is a valid palindrome ignoring cases and spaces.
public class PalindromeString {

    public static void main(String[] args) {

        String data = " ";

        System.out.println("Original Length =  " + data.length());

        String goodString = makeCleanString(data);

        System.out.println("Length after Cleaning =  " + goodString.length());

        boolean b = isPalindrome(goodString);

        System.out.println("Is it Palindrome? " + b);
    }

    public static boolean isPalindrome(String goodString) {
        //Thought Process
        //Put the string into Array
        //Take two pointers one at start second at end
        //traverse inwards and compare.(since we are ignoring spaces and cases we need to make clean string first)

        if (goodString.length() == 0) {
            return true;
        }

        char[] chars = goodString.toCharArray();

        for (int i=0, j= chars.length-1; i<=j; i++,j--)
        {
            if (chars[i] != chars[j])
            {
                return false;
            }
        }

        return true;
    }

    private static String makeCleanString(String data) {

        StringBuilder sb = new StringBuilder();
        char[] chars = data.toCharArray();

        for (Character c : chars) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}
