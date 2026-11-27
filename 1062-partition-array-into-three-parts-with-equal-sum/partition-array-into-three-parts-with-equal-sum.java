class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {

        int sum = 0,pre=0,c=0;
        int[] nums = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            pre += arr[i];
            nums[i] = pre;
        }

        if(nums[nums.length-1] % 3 != 0) return false;
        int val = nums[nums.length-1] / 3;
        int t = val;
            for(int i =0;i<nums.length;i++){

            if(nums[i] == val){
                val = val + t;
                c++;
            }
            if(c == 3) return true;

        }return false;
    }
}