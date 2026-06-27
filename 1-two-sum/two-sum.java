class Solution {
    // in this code we are using the public int[] because in the output we want to display the index pairs  
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;// for calculating the length of an array
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};// this prints the index values of the target sum
                }
            }
        }
        return new int[]{};// this prints the empty value
    }
}