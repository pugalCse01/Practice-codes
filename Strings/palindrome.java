
import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string  : ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length()-1;
        boolean t = true;
        
       
       while(left<right){
           if(s.charAt(left) != s.charAt(right)){
               t = false;
               break;
           }
           left++;
           right--;
       }
            
            
        
        if(t){
            System.out.println("palindrome ");
        }
        else{
            System.out.println("Not palindrome");
        }
        
    }

}
