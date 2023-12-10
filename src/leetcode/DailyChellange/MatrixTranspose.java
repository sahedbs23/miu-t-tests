package leetcode.DailyChellange;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }

        public static int[][] transpose(int[][] matrix) {
            int m = matrix.length; // 2
            int n = matrix[0].length; // 3
            int[][] r = new int[n][m];

            for(int i=0; i<m; i++){ // i=0
                for(int j=0; j<n; j++){ //j=0
                    r[j][i]=  matrix[i][j]; //[0][0]=1 [1][0]=2,[2][0]=3
                }
            }
            return r;
        }
}
