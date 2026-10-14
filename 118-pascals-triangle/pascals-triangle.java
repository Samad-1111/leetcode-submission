class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> fr = new ArrayList<>();

        if(numRows == 0){
            return result;
        }
        fr.add(1);
        result.add(fr);

        for(int i =1;i<numRows;i++){
            List<Integer>rows = new ArrayList<>();
            List<Integer>pr = result.get(i-1);
            for(int j =0;j<=i;j++){
                if(j ==0 || j == i){
                    rows.add(1);
                }
                else{
                    rows.add(pr.get(j-1) + pr.get(j));
                }
            }result.add(rows);
        } 
        return result;
    }
}