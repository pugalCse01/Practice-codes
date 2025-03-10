import java.util.*;
class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        Arrays.sort(arr);
        int n =  arr.length;
        for(int i =0;i<n-1;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<target){
                    ;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    return true;
                }
            }
        }
        j++
        return false;
            
            
        }
    }
class Main {
    public static void main(String[] args) {
      int[] arr = {1, 4, 45, 6, 10, 8};
      int target = 13;
      Solution s = new Solution();
      if(s.hasTripletSum(arr,target)){
          System.out.println("this array contains the triplet number");
      }
      else{
          System.out.println(" No triplet numbers");
      }
      
      }
}
