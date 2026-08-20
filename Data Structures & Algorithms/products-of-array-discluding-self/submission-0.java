class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int max=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                max*=nums[i];
            }
            else{
                zero++;
            }
        }
        if(zero>1)return arr;
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                if(nums[i]==0){
                    arr[i]=max;
                }
                else{
                    arr[i]=0;
                }
            }
            else{
                arr[i]=max/nums[i];
            }
        }
        return arr;
    }
}  
