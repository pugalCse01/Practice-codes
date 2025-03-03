// for online practice : https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
import java.util.*;
class Search{
    static int  find_value(int[] arr,int x){
           // Your code here
        int s= arr.length-1;
        for(int i = 0;i<= s;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
class Search_element{
    public static void main(String[] args){
        int[] arr = {1,6,7,4,3};
        int x = 3;
        Search se = new Search();
         int s = se.find_value(arr,x);
        if(s==-1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index : "+ s);
        }
    }
}
