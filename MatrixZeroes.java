public class MatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        
        int width = matrix.length;
        int height = matrix[0].length;
        
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                if (matrix[i][j] == 0)
                {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                if (rows.contains(i) || columns.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}