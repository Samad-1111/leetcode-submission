class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int[] num = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            num[i] = sum;
        }
        for(int i =0;i<num.length;i++){
            if(i == 0){
                if(num[i] == num[num.length-1]) return 0;
            }
            else if(num[i-1] == num[num.length-1] - num[i]) return i;
        }
        return -1;
    }
}