import java.util.*;
class Amstrong{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int org = n;
    int sum = 0;
    while(n>0){
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
