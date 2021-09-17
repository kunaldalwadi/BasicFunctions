public class ReverseWordsInString {

    public static void main(String[] args) {

        String data = "the sky is    blue";

        System.out.println("Original = " + data);

        String reversedString = reverseWords(data);

        System.out.print("Reversed = " + reversedString);

    }

    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        if (!s.isEmpty()) {

            String[] splittedString = s.trim().split(" ");

            for (int i = splittedString.length - 1; i >= 0; i--) {
                if (!splittedString[i].isEmpty() && !splittedString[i].equals(" ")) {

                    sb.append(splittedString[i].trim());
                    if(i!=0) {
                        sb.append(" ");
                    }
                }
            }
        }

        return sb.toString();
    }
}
