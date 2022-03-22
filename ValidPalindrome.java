public class ValidPalindrome {

    private static String data = "A man, a plan, a canal: Panama";

    public static void main(String[] args) {

        System.out.println(isPalindromeMyApproach());
        System.out.println(isPalindromeTwoPointerApproach(data));

    }


    private static boolean isPalindromeMyApproach() {

        //Space Complexity : O(n)
        //Time Complexity : O(n)

        //Any String less than 2 which is either 0 or 1 is always true.
        if (data.length() < 2)
        {
            return true;
        }

        //Clean the given string
        StringBuilder sb = new StringBuilder();
        char[] dataArray = data.toCharArray();
        for (Character c: dataArray) {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }
        String finalData = sb.toString();

        //Check if Palindrome
        char[] charArray = finalData.toCharArray();
        for (int i = 0, j = finalData.length()-1 ; i < j; i++, j--) {

            if (charArray[i] != charArray[j])
            {
                return false;
            }
        }
        return true;
    }




    public static boolean isPalindromeTwoPointerApproach(String s) {

        //Space Complexity : O(1)
        //Time Complexity : O(n)

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }

        return true;
    }
}
