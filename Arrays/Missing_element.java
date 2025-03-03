imort java.util.*;
class Solution {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= (i+1)){ //1 =! (0+1) 
                return i+1;  // based on index value 
            }
        }
        return arr.length+1; // return if the all elements are there it will return the next element like 1,2,3,4,5 is there so next missing element is 6  
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
