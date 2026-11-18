class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int psum = 0;
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            
            psum += nums[i];
            arr[i] = psum;
        }
        for(int i =0;i<nums.length;i++){
            if(i ==0) {
                if(arr[nums.length-1] - arr[i] == 0) return i;
            }

            else if(arr[i-1] == arr[nums.length-1]-arr[i]) return i;
        }
        return -1;
    }
}