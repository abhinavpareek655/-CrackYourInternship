class MaxArea {
    public int maxArea(int[] height) {
        int res=0;
        int n=height.length;
        for(int i=0,j=n-1;i<n && j>=0;){
            res = Math.max(res,Math.min(height[i],height[j])*Math.abs(i-j));
            if(height[i]>height[j]) j--;
            else i++;
        }
        return res;
    }
}
