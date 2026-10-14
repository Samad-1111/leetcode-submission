class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> fr = new ArrayList<>();
        fr.add(1);
        result.add(fr);

        for(int i =1;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> pr = result.get(i-1);
            for(int j = 0;j<= i;j++){
                if(j == 0 || j ==i){
                    row.add(1);
                }
                else{
                    row.add(pr.get(j) + pr.get(j-1));
                }
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
}