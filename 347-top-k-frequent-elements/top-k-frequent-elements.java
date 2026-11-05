class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int[] arr = new int[k];

        for(int i=0;i<k;i++){
            int max = 0;
            int maxKey = 0;
            for(int key : hm.keySet()){
                if(hm.get(key) > max ){
                    max = hm.get(key);
                    maxKey = key;
                }
            }
            arr[i] = maxKey;
            hm.remove(maxKey);
        }

            return arr;
    }
}