
class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int even = 1;
        int odd = 0;
        int prefixSum = 0;
        int ans = 0;

        for(int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if(prefixSum % 2 == 0) {
                ans = (ans + odd) % MOD;
                even++;
            }
            else {
                ans = (ans + even) % MOD;
                odd++;
            }
        }
        return ans;
    }
}
