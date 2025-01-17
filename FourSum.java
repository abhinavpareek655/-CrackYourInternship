class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        boolean check=true;
        for(int n:nums){
            if(n<=0){
                check = false;
            }
        }
        if(target <= 0 && check) return new ArrayList<>();
        List<List<Integer>> sols= new ArrayList<>();
        int dif = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    if(nums[i]+nums[j]+nums[k]+nums[l]<target) k++;
                    else if(nums[j]+nums[k]+nums[i]+nums[l]>target) l--;
                    else{
                        List<Integer> sol = new ArrayList<>();
                        sol.add(nums[i]);
                        sol.add(nums[j]);
                        sol.add(nums[k]);
                        sol.add(nums[l]);
                        sols.add(sol);
                        k++;
                        while(nums[k]==nums[k-1] && k<l) k++;
                    }
                }
            }
        }
        return sols;
    }
}
