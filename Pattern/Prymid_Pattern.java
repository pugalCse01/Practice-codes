

class Prymid_Pattern {
    public static void main(String[] args) {
        int n =5;
        int l=1 ;
        for(int i =0;i<n;i++){
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            for( int j=l;j>0;j--){
                if(j==l){
                    l= l;
                }
                
                    System.out.print("*");
                    
                
            }
            l= l+2;
            
            System.out.println();
        }
    }
}
