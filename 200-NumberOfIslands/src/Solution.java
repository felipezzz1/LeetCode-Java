import java.util.HashSet;
import java.util.Set;

class Solution {
    private Set<String> visited = new HashSet<>();
    private char[][] grid;
    private int rows, cols;

    public int numIslands(char[][] grid) {
        if (grid == null) return 0;

        this.grid = grid;

        rows = grid.length;
        cols = grid[0].length;
        int islands = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++){
                if (grid[r][c] == '1' && !visited.contains(r + "," + c)) {
                    dfs(r,c);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void dfs(int r, int c) {
        if (visited.contains(r + "," + c) || r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }

        visited.add(r + "," + c);

        dfs(r+1,c);
        dfs(r-1,c);
        dfs(r,c+1);
        dfs(r,c-1);
    }
}