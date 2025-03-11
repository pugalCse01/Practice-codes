import java.util.*;
// same as three sum 
class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        Arrays.sort(arr);
         int n = arr.length;
        for(int i = 0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == 0){
                    return true;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return false;
    }
}
class Triplet {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        Solution s =new Solution();
        if(s.findTriplets(arr)){
            System.out.println("Triplets are founded");
        }
        else{
            System.out.println("NO triplets are found");
        }
    }
}
