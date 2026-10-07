class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1 || nums.length == 0) {return true;};
        int position = nums.length-1;
        return reverseJump(nums, position);
    }

    public boolean reverseJump (int[] nums, int position) {
        int end = position;
        for(int i = position; i >= 0; i--) {
            if(nums[i] + i >= end) {
                end = i;
            }
        }
        if(end <= 0) {return true;}
        return false;
    }

    /* método funcional, mas ineficiente, de grande complexidade temporal 

    int position = 0;
    return jump;
    
    public boolean jump (int[] nums, int position) {
        for(int i = nums[position]; i > 0; i--) {
             if(position+i+1 >= nums.length) {
                return true;
             } else {
                if(jump(nums, position+i) == true) {
                    return true;
                }
             }
        }
        return false;
    }*/
}
