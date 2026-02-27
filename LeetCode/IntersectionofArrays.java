public class IntersectionofArrays {
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1}; 
        int[] nums2 = {2,2};
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]) {
                    System.out.print("Common elements" + nums1[i]);
                    nums2[j] = -1; // mark used 
                    break;
                }
            }
        }
    }    
}


// for leetcode Intersection of the array is not that easy. You need to learn alot