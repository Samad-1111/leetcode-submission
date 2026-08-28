class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
    if(n==1) return nums[n-1];

        if(nums[0] != nums[1]){
            
            return nums[0];
        }
        for(int i=2;i<n-1;i++){
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                
                return nums[i];
            }
        }if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }return 0;
    }
}
            
  