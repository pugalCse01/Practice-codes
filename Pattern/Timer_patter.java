// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Timer_pattern  {
    public static void main(String[] args) {
        int  n = 5;
        for(int i =n;i>0;i--){
            
        for(int k =n;k>i;k--){
            
        
        System.out.print(" ");
            
        }
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int  i = 1;i<=n;i++){
            for(int  k =n;k>i;k--){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
