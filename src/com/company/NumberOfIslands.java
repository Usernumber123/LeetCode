package com.company;

// time complexity O(n^2), где n^2= grid.length * grid[0].length
// space complexity O(n^2),), где n - число элементов в самом большом острове
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    markIslands(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void markIslands(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = 'x';//just flag
        markIslands(grid, x + 1, y);
        markIslands(grid, x, y + 1);
        markIslands(grid, x - 1, y);
        markIslands(grid, x, y - 1);
    }

}
