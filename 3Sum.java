class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=0-nums[i]-nums[j];
                if(map.containsKey(sum) && map.get(sum)>j)
                {
                    ans.add(Arrays.asList(nums[i],nums[j],sum));
                    j=map.get(nums[j]);
                }
            }
            i=map.get(nums[i]);
        }
        return ans;
    }
}