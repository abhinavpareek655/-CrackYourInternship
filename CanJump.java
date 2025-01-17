class CanJump {
    public boolean canJump(int[] nums) {
        int last = 0;
        for(int i=0;i<nums.length;i++){
            if(last<i){
                return false;
            }
            last = Math.max(last,i+nums[i]);
        }
        return true;
    }
}
