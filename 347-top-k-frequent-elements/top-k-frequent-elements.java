class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int[] arr = new int[k];

        for(int i =0;i<k;i++){
            int max = 0;
            int maxkey = 0;

            for(int key : hm.keySet()){
                if(hm.get(key) > max){
                    max = hm.get(key);
                    maxkey = key;
                }
            }
            arr[i] = maxkey;
            hm.remove(maxkey);
        }
        return arr;
    }
}