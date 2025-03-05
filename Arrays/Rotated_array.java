//for online practice : https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Rotated_array {
    public static void main(String[] args) {
        int[] arr  = {5,6,7,8,9,0}; 
        Solution s = new Solution();
        s.rotate(arr);
        for(int num : arr){
            System.out.println(num + "");
        }
    }
}
class Solution {
    public void rotate(int[] arr) {
        // strore the last digit for replacing the last variable to first
        int last = arr[ arr.length-1];
        // add the decrement operator for the like if 5 means it decrement to 5,4,3,2
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
            
            
        }
        arr[0] =last;
        
        
        
    }
}
