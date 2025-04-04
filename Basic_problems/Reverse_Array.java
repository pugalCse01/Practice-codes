// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Reverse_Array {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        System.out.println(Arrays.toString(arr));
        
   
    }
    
}
