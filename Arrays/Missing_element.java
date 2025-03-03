imort java.util.*;
class Solution {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= (i+1)){
                return i+1;
            }
        }
        return arr.length+1;
    }
}
import java.util.*;
class Missing_element{
    public static void main(String[]args){
    int[] arr = {1,2,3,5,6};
    Solution s = new Solution();
     int a= s.missingNumber(arr);
    System.out.println("The missing number is : "+ a);
    }
}
