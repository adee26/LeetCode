package arraysandstring;

public class RotateMatrix {
    /**
     * Input: matrix = [[1,2,3],
     *                  [4,5,6],
     *                  [7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]] -> m[2][0] -> m[0][0];    m[1][0] -> m[0][1];    m[0][0] -> m[0][2]
     *                                   -> m[2][1] -> m[1][0];    m[1][1] -> m[1][1];    m[0][1] -> m[1][2]
     *                                   -> m[2][2] -> m[2][0];    m[1][2] -> m[2][1];    m[0][2] -> m[2][2]
     * ---                        m[length-1][i] -> m[i][i];  m[length-2][i] -> m[i][i+1]; m[length-3][i] -> m[i][i+2]
     *                            m[length-1][i]->m[i][i]; ... m[length-n-1][i] -> m[i][[i+n-1]
     * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
     * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
     * [7][4][1]
     * [][][]
     * [][][]
     */
    public static int[][] rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];

        int temp;
        for (int i = 0; i<matrix.length; i++) {
            temp = 0;
            for(int j = matrix.length-1; j>=0 ; j--) {
                result[i][temp] = matrix[j][i];
                temp++;
            }
        }
        return result;
    }
}
