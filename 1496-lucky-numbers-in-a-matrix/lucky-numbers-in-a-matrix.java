class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int col=0;
        
        for(int i =0;i<matrix.length;i++){
            int min =10000000;
            boolean lucky = true;
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j] <min){
                    min = matrix[i][j];
                    col = j;
                }
            }
            for(int k =0;k<matrix.length;k++){
                if(min < matrix[k][col]){
                    lucky = false;
                }
            }
            if(lucky){
                result.add(min);
            }
        }return result;
    }
}