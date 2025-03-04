
import java.util.*;
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0;i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
class Check_Array {
    public static void main(String[] args) {
        int[] a = {1,3,5,8};
        int[] b = {1,8,5,3};
        Solution s = new Solution();
         
         if(s.checkEqual(a,b)){
             System.out.println("Two arrays are equal");
         }
         else{
             System.out.println("Two arrays not equal");
         }
        
    }
}
