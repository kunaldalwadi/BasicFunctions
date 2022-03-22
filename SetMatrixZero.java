import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {

//    static int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    static int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};


    static Set<Integer> rows = new HashSet<>();
    static Set<Integer> cols = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Rows = " + rows.toString());
        System.out.println("Cols = " + cols.toString());

        System.out.println();

        prettyPrintMatrix();

        System.out.println();

        findZero();

        System.out.println("Rows = " + rows.toString());
        System.out.println("Cols = " + cols.toString());

        System.out.println();

        makeZero();

        prettyPrintMatrix();


    }

    public static void findZero() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

    }

    public static void makeZero() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void prettyPrintMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
