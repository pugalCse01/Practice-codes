//use  print upside triangle for upside and down triangle for downside
//https://www.naukri.com/code360/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
class Half_Diamond_Star_Pattern{
    public static void main(String[] args) {
       //upside triangle
        int n =1;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
               
            }
             System.out.println(" ");
        }
      //DownsideTriangle
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
}
