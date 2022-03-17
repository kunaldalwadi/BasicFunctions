import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    static int[][] intervals = {{1,3},{4,5},{2,6},{8,10},{9,11},{15,18}};

    public static void main(String[] args) {


        System.out.println("Intervals array :");
        prettyPrint2DArray(intervals);


        int[][] merge = mergeUsingLinkedList(intervals);

        System.out.println();
        System.out.println("Merged Array : ");
        prettyPrint2DArray(merge);

    }

    public static int[][] mergeUsingLinkedList(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        LinkedList<int[]> mergedList = new LinkedList<>();

        for (int[] interval : intervals) {

            if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0])
            {
                mergedList.add(interval);
            }
            else
            {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }

    public static void prettyPrint2DArray(int[][] intervals) {

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {

                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }
    }
}
