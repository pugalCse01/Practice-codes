// for online practice : https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

class Max_and_Min {
    public static void main(String[] args){
  int[] arr = {1,4,88,99,1000};
  int min = arr[0];
  int max = arr[0];
  for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
          max = arr[i];
      }
      else if(arr[i]>min){
          min = arr[i];
      }
  }
  System.out.println("Minimum number is : " +min);
  System.out.println("Maximum number is : " +max);
    }
}
