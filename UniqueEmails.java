import java.util.ArrayList;

public class UniqueEmails {

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        ArrayList<String> stringArrayList = new ArrayList<>();


        for (String email : emails) {

            String cleanEmail = cleanUpAndConcatenateEmail(email);

            if (!stringArrayList.contains(cleanEmail)) {
                stringArrayList.add(cleanEmail);
            }

        }

        System.out.println(stringArrayList.size());

    }

    private static String cleanUpAndConcatenateEmail(String email) {

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {

            char c = email.charAt(i);

            if (c == '+' || c == '@')
            {
                //start from end of array and come up till @.
                break;
            }

            if (c != '.') {
                firstHalf.append(c);
            }
        }


        for (int j = email.length()-1; j >= 0; j--) {

            char c = email.charAt(j);

            if (c == '@') {
                secondHalf.append(c);

                secondHalf.reverse();
                break;
            }
            secondHalf.append(c);
        }

        String cleanEmail = firstHalf.toString() + secondHalf.toString();

        System.out.println(cleanEmail);

        return cleanEmail;

    }
}
