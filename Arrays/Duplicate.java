/*Given array of integers find if the array contains duplicates
Use Hash Set as it has only unique elements.

SC=O(n)
TC=O(n)*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>numbers=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(numbers.contains(nums[i]))
                return true;
                numbers.add(nums[i]);
        }
        return false;
    }
}
