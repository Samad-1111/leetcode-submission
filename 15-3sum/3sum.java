class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; 
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    li.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return li;
    }
}

























// import java.util.HashSet;
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n =nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(i != j && i!=k && j !=k && (nums[i]+nums[j]+nums[k]==0)){
//                         set.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                         break;
//                     }
//                 }
//             }
//         }return new ArrayList<>(set);
//     }
// }