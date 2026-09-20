//Works but is not accepted by as solution in the site (apparently a common occurrence in this exercise)
//Shows the same order of nums as the examples and the right number os removed instances
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int f = 0;
        for(int i = 0; i < nums.length-f; i++) {
            for(int j = 0; j < nums.length; j++) {
                    System.out.print(nums[j]);
                }
                System.out.println("");
            if(nums[i] == val) {
                k++;
                while(nums[nums.length-1-f] == val) {
                    f++;
                    k++;
                    if (i > nums.length-f) {k--;}
                }  
                nums[i] = nums[nums.length-1-f];
                f++;
            }
        }
        return k;
    }
}
