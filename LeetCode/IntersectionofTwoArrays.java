// public class IntersectionofArrays {
//     public static void main(String[] args){
//         int[] nums1 = {1,2,2,1}; 
//         int[] nums2 = {2,2};
//         for (int i = 0; i < nums1.length; i++){
//             for (int j = 0; j < nums2.length; j++){
//                 if (nums1[i] == nums2[j]) {
//                     System.out.print("Common elements" + nums1[i]);
//                     nums2[j] = -1; // mark used 
//                     break;
//                 }
//             }
//         }
//     }    
// }


// Intersection using Hashtable 

import java.util.*;

public class IntersectionofTwoArrays{
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,3,4};

        Set<Integer> result = new HashSet<>();
        for (int num1 : nums1){
            for (int num2 : nums2){
                if (num1 == num2){
                    
                }
            }
        }
     }
}

