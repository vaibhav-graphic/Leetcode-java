import java.util.*;

class Approch_1{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int p = m +n- 1; // Pointer for the merged result

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy any remaining elements from nums2 to nums1 if needed
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
    public static void main(String [] args){
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int m=arr1.length;
        int n=arr2.length;

        merge(arr1, m, arr2, n);
        System.out.print(Arrays.toString(arr1));
    }
}