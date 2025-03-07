import java.util.*;

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum == target){
                return true;
            }
            else if(sum <target){
                start ++;
            }
            else{
                end--;
            }
           
        }
        return false;
    }
}
class Two_sum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 16;
        Solution s = new Solution();
        if(s.twoSum(arr,target)){
            System.out.println("Target is getting in this array");
        }
        else{
            System.out.println("Target is not getting in this array");
        }
    }
}
