class Solution {
    public void rotate(int[] nums, int k) {
        int[] num = new int[nums.length];
        int c =0;
        k = k % nums.length;
        if(k == 0){

        }
        else{
        for(int i =nums.length-k;i<nums.length;i++){
            num[c++] = nums[i];
            if(c == nums.length) break;
            if(i==nums.length-1) i = -1;

        }
        for(int i =0;i<nums.length;i++){
            nums[i] = num[i];
            }
        }
    }
}