// This question is copy of move Zeroes at the end to move 1 in front
public class Move1infront {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 1, 8, 1, 10, 1};
        int[] ans = new int[nums.length];
        int k = 0;
        // Put all 1s first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ans[k] = nums[i];
                k++;
            }
        }

        // remaining elements 
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 1){
                ans[k] = nums[i];
                k++;
            }
        }
        // Print array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
