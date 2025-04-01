import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int largest= arr[arr.length-1];
        for(int  i = arr.length-2;i >=0;i--){
            if(arr[i]<largest){
                return arr[i];
            }
        }
        return -1;
    }}
class Second_largest {
    public static void main(String[] args) {
        Solution s  = new Solution();
        int[] arr = {10,10,5};
         int result =s.getSecondLargest(arr);
        System.out.println("The second largest is "+ result);
    }
}
