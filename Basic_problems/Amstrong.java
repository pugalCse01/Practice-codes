import java.util.*;
// this code only for three digit numbers
class Amstrong{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    // org for comparing the last sum and the n value we cannot comare sum with n because n undergoes n/10 so n value will change  
    int org = n;
    int sum = 0;
    while(n>0){
      // n%10 for getting the last digit for each iteration
      int id = n%10;
      sum = sum+ (int) Math.pow(id,3);
      n= n/10;
    }
    if(sum == org){
      System.out.println(" it is a amstrong number");
    }
    else{
      System.out.println("it is not a amstrong number");
    }
      
  }
}
