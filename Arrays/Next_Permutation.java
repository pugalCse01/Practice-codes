
import java.util.*;
class Next_Permutation  {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        System.out.println("Next permutation is :"+ Arrays.toString(arr));
       
    }
     public static void nextPermutation(int[] arr) {
        // code here
        
        int ind = -1;
        int  n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            for(int i = 0;i<n/2;i++){
                int temp = arr[i];
                arr[i] = arr[n-1-i];
                arr[n-1-i] = temp;
            }
        }
        else{
        for(int i = n-1;i>ind;i--){
            if(arr[i] > arr[ind]){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        int start  = ind+1;
        int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
    }
}
