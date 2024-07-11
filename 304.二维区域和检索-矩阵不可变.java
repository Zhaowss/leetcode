/*
 * @lc app=leetcode.cn id=304 lang=java
 *
 * [304] 二维区域和检索 - 矩阵不可变
 */

// @lc code=start
class NumMatrix {

    int[][] matrix1;
    int[][] presum;
    // 出现求和的这种首先考虑的就是前缀和
    public NumMatrix(int[][] matrix) {
    this.matrix1=matrix;
    presum=new int[matrix.length+1][matrix[0].length+1];
     for (int i = 1; i <=matrix.length; i++) {
        for (int j = 1; j <= matrix[0].length; j++) {
            presum[i][j]=presum[i][j-1]+presum[i-1][j]-presum[i-1][j-1]+matrix[i-1][j-1];
        }
     }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return presum[row2+1][col2+1]-presum[row1][col2+1]-presum[row2+1][col1]+presum[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end

