import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfIslands2 {

    public static void main(String[] args) {

    }

    public static List<Integer> numIsland2(int row, int col, int[][] positions) {

        List<Integer> answer = new ArrayList<>();

        //they only gave row and col which is their sizes respectively.
        // we have to create grid ourself.

        //this just initialized a char grid of similar size.
        char[][] grid = new char[row][col];

        //now put values in the grid.
        //all initial values are 0;
        for (char[] r : grid) {
            Arrays.fill(r,'0');
        }

        //now all positions that are given should be made '1';
        for (int[] pos : positions) {
            grid[pos[0]][pos[1]] = '1';

            //also add this to arraylist that we previously created, BUT only after checking if it was already visited or not.
            answer.add(numberOfIsland(grid));
        }

        return answer;
    }

    //exactly similar to numOfIsland problem with added visited variable to keep track of already visited positions.
    public static int numberOfIsland(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numOfIslands = 0;
        int numOfRows = grid.length;
        int numOfCols = grid[0].length;

        //addition from num of island is this boolean grid that keeps track of visited node.
        //initiate the boolean grid.
        boolean[][] visited = new boolean[numOfRows][numOfCols];
        //populate that boolean grid here. start with all false, we change as we visit.
        for (boolean[] ro : visited) {
            Arrays.fill(ro, false);
        }


        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                if (grid[i][j] == '1' && !visited[i][j])
                {
                    ++numOfIslands;
                    dfs(grid, i, j, visited);
                }
            }
        }

        return numOfIslands;
    }

    public static void dfs(char[][] grid, int row, int col, boolean[][] visited) {

        int numOfRows = grid.length;
        int numOfCols = grid[0].length;

        if (row < 0 || col < 0 || row >= numOfRows || col >= numOfCols || grid[row][col] == '0' || visited[row][col])
        {
            return;
        }

        //Another change is here where we start putting true for each visited node.
//        grid[row][col] = '0';
        visited[row][col] = true;
        dfs(grid, row - 1, col, visited);
        dfs(grid, row + 1, col, visited);
        dfs(grid, row, col - 1, visited);
        dfs(grid, row, col + 1, visited);
    }

}
