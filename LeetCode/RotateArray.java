// Array rotation from the right side where k = 2 
public class RotateArray {
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }    

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 2;

        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1); // reverese whole array 
        reverse(arr, 0, k - 1); // reverese first k elements 
        reverse(arr, k, n - 1); // reverse remaining elements 
        for (int num : arr){ // print result 
            System.out.print(num + " ");
        }
    }
}

// Array rotation from the left side where k = 2 write this code by yourself 
