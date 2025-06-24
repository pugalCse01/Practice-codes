
class Main {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        int result  = s.firstDigit(123);
        System.out.println("Result is : "+result);
    }
}
class Solution {
    public static int firstDigit(int n) {
        // code here
        double d = Math.log10(n);
        int  t = (int) d;
        int a  = (int) Math.pow(10,t);
        return n/a;
    }
}
