//Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i,j=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                break;
            }
            if(j<n)
            break;
        }
        int[] a= new int[2];
        a[0]=i;
        a[1]=j;
        return a;
    }
}


//HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int d = target-nums[i];
            if(h.containsKey(d)){
                ans[0]=h.get(d);
                ans[1]=i;
                break;
            }
            h.put(nums[i],i);
        }
        return ans;
    }
}
