//Funciona só que muito devagar
class Solution {
    public int jump(int[] nums) {
        int end = nums.length-1;
        if(end <= 1) {return end;}
        int[] jumps = new int[nums.length];
        jumps[0] = end;
        int lastJump = 0; 
        for(int i = end-1; i >= 0; i--) {
            if(nums[i] + i >= jumps[lastJump]) {
                while(lastJump-1 >= 0 && nums[i] + i >= jumps[lastJump-1]) { 
                    lastJump--;
                }
                lastJump++;
                jumps[lastJump] = i; 
            }
        }
        return lastJump;
    }
}
