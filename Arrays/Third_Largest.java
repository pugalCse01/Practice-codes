hor online : https://www.geeksforgeeks.org/problems/third-largest-element/1
import java.util.*;
class Third_Largest {
    public static void main(String[] args){
        int[] arr = {7,4,3,2,1};
int l = arr.length-3;
Arrays.sort(arr);
System.out.println("THE third largest element is :" + arr[l] );

    }
}
