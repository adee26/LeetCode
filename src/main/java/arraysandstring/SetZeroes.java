package arraysandstring;

import java.util.ArrayList;

public class SetZeroes {
    /**
     * Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],
     *          [0,0,0],
     *          [1,0,1]]
     */
    public static void setZeroes(int[][] matrix){
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();

        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        if(!rows.isEmpty()) {
            for (int i = 0; i<matrix.length; i++) {
                for (int j = 0; j<matrix[0].length; j++) {
                    if(rows.contains(i)) {
                        matrix[i][j] = 0;
                    }
                    if(columns.contains(j)) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
