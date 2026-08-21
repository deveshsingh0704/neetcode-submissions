class Solution {
    public int longestConsecutive(int[] nums) {
        int rmax=1;
        int max=1;
        if(nums.length==0)return 0;
        HashSet<Integer> set=new HashSet<>();
        
        for(int n:nums)set.add(n);
        for(int num:set){
            if(!set.contains(num-1)){
                int n=num;     
                while(set.contains(n+1)){
                    max++;
                    n+=1;
                }                   
                if(!set.contains(n+1)){
                    rmax=Math.max(rmax,max);
                    max=1;
                }
            }
        }
        System.out.println(set);
        return Math.max(rmax,max);
    }
}
