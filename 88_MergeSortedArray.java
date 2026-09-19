class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Integer[] merge = new Integer[nums1.length]; 
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(n1 != m) {
                if(n2 != n) {
                    if(nums2[n2] < nums1[n1]) {
                        merge[i] = nums2[n2];
                        n2++;
                    } else {
                        merge[i] = nums1[n1];
                        n1++;
                    } 
                } else {
                    merge[i] = nums1[n1];
                    n1++;
                }
            } else {
                merge[i] = nums2[n2];
                n2++;
            }
        }
        for(int i = 0; i < merge.length; i++) {
            nums1[i] = merge[i];
        }
    }
}
//messy execution, redo later
