class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i+1]-nums[i]==1){
               count++;
            }
            else {
                res=max(res,count);
                count=1;
            }
        }
        return ((max(res,count))+1);
    }
    private int max(int a,int b){
        return a>b?a:b;
    }
}
