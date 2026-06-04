class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
       int []result=new int[2];
       HashSet<Integer> set=new HashSet<>();
       for(int i:nums){
         if(set.contains(i)){
                result[0]=i;
            }
            set.add(i);
        }
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                result[1] = i; 
                break;
            }
        }
        return result; 
       }
    }
