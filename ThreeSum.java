class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sols = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]+nums[i]<0) j++;
                else if(nums[j]+nums[k]+nums[i]>0) k--;
                else{
                    List<Integer> sol = new ArrayList<>();
                    sol.add(nums[i]);
                    sol.add(nums[j]);
                    sol.add(nums[k]);
                    sols.add(sol);
                    j++;
                    while(nums[j]==nums[j-1] && j<k) j++;
                }
            }
        }
        return sols;
    }
}
