
class Solution {
    public int maxLength(int[] nums) {

        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            long product = 1;

            for (int j = i; j < n; j++) {

                product *= nums[j];
                long gcd = nums[i];

                for (int k = i + 1; k <= j; k++) {

                    long a = gcd;
                    long b = nums[k];

                    while (b != 0) {
                        long temp = b;
                        b = a % b;
                        a = temp;
                    }

                    gcd = a;
                }

                long lcm = nums[i];

                for (int k = i + 1; k <= j; k++) {

                    long a = lcm;
                    long b = nums[k];

                    while (b != 0) {
                        long temp = b;
                        b = a % b;
                        a = temp;
                    }

                    lcm = (lcm / a) * nums[k];
                }

                if (product == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
