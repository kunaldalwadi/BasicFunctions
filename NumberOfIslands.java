/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

 Input: grid = [
            ["1","1","0","0","0"],
            ["1","1","0","0","0"],
            ["0","0","1","0","0"],
            ["0","0","0","1","1"]
            ]
    Output: 3
 */

public class NumberOfIslands {

    static char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
    };

    public static void main(String[] args) {

        prettyPrintGrid(grid);

        System.out.println();

        int answer = numberOfIslands(grid);

        System.out.println("Total Islands = " + answer);

        System.out.println();

        System.out.println("At the end : ");
        prettyPrintGrid(grid);

    }

    public static int numberOfIslands(char[][] grid) {

        if (grid == null || grid.length == 0)
        {
            return 0;
        }

        int totalIslands = 0;
        int numberOfRows = grid.length;
        int numberOfCols = grid[0].length;

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                if (grid[i][j] == '1')
                {
                    ++totalIslands;
                    //start dfs here.
                    dfs(grid, i, j);
                }
            }
        }

        return totalIslands;
    }

    public static void dfs(char[][] grid, int row, int col) {
        int numberOfRows = grid.length;
        int numberOfCols = grid[0].length;

        if (row < 0 || col < 0 || row >= numberOfRows || col >= numberOfCols || grid[row][col] == '0')
        {
            return;
        }

        grid[row][col] = '0';
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }


    public static void prettyPrintGrid(char[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
