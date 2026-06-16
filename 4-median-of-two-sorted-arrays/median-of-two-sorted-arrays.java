class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merged[k] = nums1[i];
                i++;
                k++; 
            }
            else{
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            merged[k] = nums1[i];
            i++;
            k++; 
        }
        while(j<n){
            merged[k] = nums2[j];
            j++;
            k++; 
        }
        int l = merged.length;
        double median = 0;
        if(l%2 == 0){
            median = (merged[l/2] + merged[(l/2) -1])/2.0;
        }
        else{
            median = merged[l/2];
        }
        return median;
    }
}