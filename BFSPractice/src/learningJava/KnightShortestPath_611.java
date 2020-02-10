package learningJava;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class KnightShortestPath_611 {
    /**
     * param grid: a chessboard included 0 (false) and 1 (true)
     * param source: a point
     * param destination: a point
     * return: the shortest path
     */
    static class Point {
        public int x;
        public int y;
        public Point() { x = 0; y = 0; }
        public Point(int a, int b) {
            x = a;
            y = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    public static void main(String[] args){

        int [][] grid = new int[40][40];
        Point source = new Point(15,10);
        Point destination = new Point(36,21);

        System.out.println(shortestPath(grid, source, destination));
    }
    public static int shortestPath(int[][] grid, Point source, Point destination) {
        // write your code here

        // bfs from start
        // for eight direction
        // if neighbor is not visited at start and end
        //    mark as visited and add to queue
        // else return (starDis[node] + endDis[node])
        // bfs from end
        // for eight direction
        // if neighbor is not visited at start and end
        //    mark as visited and add to queue
        // else return (starDis[node] + endDis[node])

        if (source.x == destination.x && source.y == destination.y){
            return 0;
        }

        Queue<Point> starQue = new LinkedList<>();

        // start and end enter queue
        starQue.offer(source);

        HashMap<Point, Integer> starVisited = new HashMap<Point, Integer>();

        // // mark distance for start and end
        starVisited.put(source, 0);

        int[] xDirection = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] yDirection = {2, -2, 2, -2, 1, -1, 1, -1};

        while (!starQue.isEmpty()) {
            // traverse on current level at starQue
            int length = starQue.size();
            for (int i = 0; i < length; i++) {
                Point fromStar = starQue.poll();
                if (fromStar.x == destination.x && fromStar.y == destination.y) {
                    return starVisited.get(fromStar);
                }
                // go to eight direction.
                for (int j = 0; j < 8; j++) {
                    // find next point
                    Point neighbor = new Point(
                            fromStar.x + xDirection[j],
                            fromStar.y + yDirection[j]
                    );

                    if ( neighbor.x == destination.x && neighbor.y == destination.y ) {
                        return starVisited.get(fromStar) + 1;
                    }
                    if (isValidNeighbor(neighbor, grid)) {

                        // if neighbor is visited at start path continue
                        if (starVisited.containsKey(neighbor)) {
                            continue;
                        }

                        // add to queue and mark as visited
                        starQue.offer(neighbor);
                        starVisited.put(neighbor, starVisited.get(fromStar) + 1);
                    }
                }
            }

        }
        return -1;
    }

    public static boolean isValidNeighbor(Point neighbor, int[][] grid){

        int xbound = grid.length;
        int ybound = grid[0].length;

        if (neighbor.x < 0 || neighbor.x >= xbound) return false;

        if (neighbor.y < 0 || neighbor.y >= ybound) return false;

        if (grid[neighbor.x][neighbor.y] == 1) return false;

        return true;
    }
    public static int shortestPath2(int[][] grid, Point source, Point destination) {
        // write your code here

        // bfs from start
        // for eight direction
        // if neighbor is not visited at start and end
        //    mark as visited and add to queue
        // else return (starDis[node] + endDis[node])
        // bfs from end
        // for eight direction
        // if neighbor is not visited at start and end
        //    mark as visited and add to queue
        // else return (starDis[node] + endDis[node])

        if (source.x == destination.x && source.y == destination.y){
            return 0;
        }

        Queue<Point> starQue = new LinkedList<>();
        Queue<Point> endQue = new LinkedList<>();

        // start and end enter queue
        starQue.offer(source);
        endQue.offer(destination);

        HashMap<Point, Integer> starVisited = new HashMap<Point, Integer>();
        HashMap<Point, Integer> endVisited = new HashMap<Point, Integer>();

        // // mark distance for start and end
        starVisited.put(source, 0);
        endVisited.put(destination, 0);

        int[] xDirection = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] yDirection = {2, -2, 2, -2, 1, -1, 1, -1};

        while (!starQue.isEmpty()) {
            // traverse on current level at starQue
            int length = starQue.size();
            for (int i = 0; i < length; i++) {

                Point fromStar = starQue.poll();
                if (fromStar.equals(destination)) {
                    return starVisited.get(fromStar);
                }
                // go to eight direction.
                for (int j = 0; j < 7; j++) {
                    // find next point
                    Point neighbor = new Point(fromStar.x + xDirection[j], fromStar.y + yDirection[j]);

                    if (neighbor.equals(destination)) {
                        return starVisited.get(fromStar) + 1;
                    }
                    if (isValidNeighbor(neighbor, grid)) {
                        // if both visited return distance
                        if (starVisited.containsKey(neighbor) && endVisited.containsKey(neighbor)) {
                            return starVisited.get(neighbor) + endVisited.get(neighbor);
                        }

                        // if neighbor is visited at start path continue
                        if (starVisited.containsKey(neighbor)) {
                            continue;
                        }

                        // add to queue and mark as visited
                        starQue.offer(neighbor);
                        starVisited.put(neighbor, starVisited.get(fromStar) + 1);
                    }
                }
            }


//             traverse on current level at endQue
            length = endQue.size();
            for (int i = 0; i < length; i++){

                Point fromEnd = endQue.poll();
                if (fromEnd.equals(source)){
                    return endVisited.get(fromEnd);
                }

                // go to eight direction.
                for (int j = 0; j < 7 ; j ++ ){
                    // find next point
                    Point neighbor = new Point(fromEnd.x + xDirection[j], fromEnd.y + yDirection[j]);
                    if (isValidNeighbor(neighbor, grid)){

                        // if both visited return distance
                        if (starVisited.containsKey(neighbor) && endVisited.containsKey(neighbor)){
                            return starVisited.get(neighbor) + endVisited.get(neighbor);
                        }

                        // if neighbor is visited at end path continue
                        if (endVisited.containsKey(neighbor)){
                            continue;
                        }

                        // add to queue and mark as visited
                        endQue.offer(neighbor);
                        endVisited.put(neighbor, endVisited.get(fromEnd) + 1);

                    }
                }
            }
        }
        return -1;
    }

    public static boolean isValidNeighbor2(Point neighbor, int[][] grid){

        int xbound = grid.length;
        int ybound = grid[0].length;

        if (neighbor.x < 0 || neighbor.x >= xbound) return false;

        if (neighbor.y < 0 || neighbor.y >= ybound) return false;

        if (grid[neighbor.x][neighbor.y] == 1) return false;

        return true;
    }

}