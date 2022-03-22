/*

Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2,
return the shortest distance between these two words in the list.

Example 1:
Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
Output: 3

Example 2:
Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
Output: 1

 */

public class ShortestDistanceBetweenTwoWords {

    static String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
    static String word1 = "coding";
    static String word2 = "practice";

    public static void main(String[] args) {

        int answer = findShortestDistanceBruteForce(wordsDict, word1, word2);

        System.out.println("Answer = " + answer);

    }

    public static int findShortestDistanceBruteForce(String[] str, String word1, String word2) {

        int minDist = str.length;

        //BruteForce.
        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(word1)) {

                for (int j = 0; j < str.length; j++) {

                    if (str[j].equals(word2)) {

                        minDist = Math.min(minDist, Math.abs(i - j));
                    }
                }
            }
        }

        return minDist;
    }

    public static int findShortestDistance(String[] str, String word1, String word2) {

        int minDist = str.length;
        int w1 = -1;
        int w2 = -1;

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(word1))
            {
                w1 = i;
            }
            else if (str[i].equals(word2))
            {
                w2 = i;
            }

            if (w1 != -1 && w2 != -1)
            {
                minDist = Math.min(minDist, Math.abs(w1 - w2));
            }

        }

        return minDist;
    }
}
