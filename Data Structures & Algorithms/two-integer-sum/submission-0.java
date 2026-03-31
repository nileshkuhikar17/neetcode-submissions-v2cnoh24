class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int third=target-nums[i];
            if(map.containsKey(third)){
              return  new int[]{map.get(third),i};
            }
            map.put(nums[i],i);
        }
      return  new int[]{-1,-1};
    }
}
