//Given an array of strings strs, group the anagrams together. You can return the answer in any order.

import java.util.*;

public class AnagramList {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> sortedAnagramList = groupAnagrams(strs);

        System.out.println(sortedAnagramList);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) {
            return new ArrayList();
        }

        Map<String, List<String>> stringListMap = new HashMap<String, List<String>>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);

            if (!stringListMap.containsKey(key)) {
                stringListMap.put(key, new ArrayList<>());
            }

            stringListMap.get(key).add(s);
        }

        return new ArrayList<>(stringListMap.values());

    }
}
