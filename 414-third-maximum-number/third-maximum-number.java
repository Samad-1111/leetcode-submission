
class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        boolean y = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max1 = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max2 && nums[i] < max1) {
                max2 = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max3 &&
                nums[i] < max2 &&
                nums[i] < max1) {
                max3 = nums[i];
                y = true;
            }
        }

        if (y) {
            return (int) max3;
        }

        return (int) max1;
    }
}
