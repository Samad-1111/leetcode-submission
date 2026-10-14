class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int k =0;
        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        int[][] mat2 = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                 mat2[i][j] = mat[k/mat[0].length][k%mat[0].length];
                 k++;
            }
        }return mat2;
    }
}