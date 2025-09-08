class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> num = new ArrayList<>();
        Arrays.sort(arr);
        for (int  i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                num.add(arr[i]);
            }
        }
        return num;
        
        
  
    }
}
// Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.
// Examples:
// Input: arr[] = [2, 3, 1, 2, 3]
// Output: [2, 3] 
// Explanation: 2 and 3 occur more than once in the given array.
