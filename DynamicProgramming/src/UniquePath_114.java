public class UniquePath_114 {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */

    public int uniquePaths(int m, int n) {
        // start from 1,1 end m,n
        // f[m,n] = f[m-1, n] + f[m, n-1] (end stiuation is easier to analyze)
        //  if next point is in boundary
        //     f[next point ] = f[next point] + f[prev point];
        //  if next point is not in boundary
        //     break;

        int[][] f = new int[m][n];
        f[0][0] = 1;
        // start from top left point.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // first go right
                if (j + 1 < n) {
                    f[i][j + 1] += f[i][j];
                }
                // then go down
                if (i + 1 < m) {
                    f[i + 1][j] += f[i][j];
                }
            }
        }
        return f[m - 1][n - 1];
    }
}