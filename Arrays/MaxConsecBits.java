// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MaxConsecBits {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0, 1, 0, 1, 1, 1, 1};
        int result =  s. maxConsecBits(arr);
        System.out.println(result);
       
    }
}
class Solution {
    public int maxConsecBits(int[] arr) {
       
        int n = arr.length;
        int cur = 1;
        int max = 1;
        for(int i =1;i<n;i++){
            if(arr[i] ==arr[i-1]){
                cur++;
                max = Math.max(max,cur);
            }
            else{
                cur = 1;
            }
        }
        
        return max;
            }
            
        }
 
