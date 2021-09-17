import java.util.Arrays;

public class ReverseWordsInString2 {

    public static void main(String[] args) {

//        char[] chars = new char[]{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        char[] chars = new char[]{'a',' ','b',' ','c',' ','d'};

        System.out.println(Arrays.toString(chars));

        reverseWords(chars);

    }

    public static void reverseWords(char[] s) {


        //Use two pointers to reverse the whole array by swapping and then reverse each word.
        int start=0,end=0;
        //reversing the whole input.
        reversingMechanism(s,0,s.length-1);

        //reverse each word
        for (start=0; start<s.length; start++)
        {
            for (end=start+1; end<s.length; end++) {
                if (Character.isSpaceChar(s[end])) {
                    reversingMechanism(s,start,end-1);

                    start = end+1;
                    end = end+2;
                }
                if (end==s.length-1)
                {
                    reversingMechanism(s,start,end);
                    break;
                }
            }

            break;
        }


    }

    public static void reversingMechanism(char[] s, int start, int end){

        //this reversed the whole string
        char temp;
        for (int i=start, j=end; i<=j; i++,j--)
        {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

        System.out.println(Arrays.toString(s));

    }
}
