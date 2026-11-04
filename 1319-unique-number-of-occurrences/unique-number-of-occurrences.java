class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0) + 1);
        }
        for(int nums : hm.values()){
            hm2.put(nums,hm2.getOrDefault(nums,0) + 1);
        }
        for(int count : hm2.values()){
            if(count > 1){
                return false;
            }
        
        }return true;
    }
}