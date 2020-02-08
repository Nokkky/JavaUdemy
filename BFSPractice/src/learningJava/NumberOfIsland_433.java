package learningJava;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_433 {
    /**
     * param grid: a boolean 2D matrix
     * @return: an integer
     */

    class Coordinate {
        public int x, y;

        public Coordinate(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public int numIslands(boolean[][] grid) {
        // write your code here
        //  on each node at matrix:
        // bfs start from node not visited
        //      go right down up left
        //          add neighbors into queue and mark neighbors as visited
        // when bfs end island ++
        //
        if (grid == null) return 0;
        if (grid.length == 0) return 0;

        int xbound = grid.length;
        int ybound = grid[0].length;
        boolean[][] visited = new boolean[xbound][ybound];

        int numberOfIsland = 0;
        for (int i = 0; i < xbound; i ++){
            for (int j = 0; j < ybound; j ++){
                if (!visited[i][j] && grid[i][j]){
                    bfs(grid, i, j, visited);
                    numberOfIsland ++;
                }
            }
        }

        return numberOfIsland;
    }

    public void bfs(boolean[][] grid, int x, int y, boolean visited[][]){

        // add root node into queue
        Queue<Coordinate> queue = new LinkedList<>();
        Coordinate root = new Coordinate(x,y);
        queue.offer(root);
        visited[x][y] = true;

        // bfs
        while (!queue.isEmpty()){

            Coordinate start = queue.poll();
            // go right
            goToNeighbor(start.x, start.y + 1, grid, visited, queue);
            // go left
            goToNeighbor(start.x, start.y - 1, grid, visited, queue);
            // go down
            goToNeighbor(start.x + 1, start.y, grid, visited, queue);
            // go up
            goToNeighbor(start.x - 1, start.y, grid, visited, queue);
        }
    }

    public void goToNeighbor(int x, int y, boolean[][] grid, boolean[][] visited, Queue<Coordinate> queue){

        int xbound = grid.length;
        int ybound = grid[0].length;

        // check boundary
        if (x < 0 || x >= xbound) return;
        if (y < 0 || y >= ybound) return;

        // check whether visited
        if (visited[x][y]) return;

        // check whether is island
        if (!grid[x][y]) return;

        // if valid and not visited add to queue and mark as visited.
        Coordinate neighbor = new Coordinate(x, y);
        queue.offer(neighbor);
        visited[x][y] = true;

    }
}
