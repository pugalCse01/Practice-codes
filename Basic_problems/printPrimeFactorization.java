class Main {
    public static void main(String[] args) {
        Solution s  = new Solution();
        s.printPrimeFactorization(60);
    }
}
class Solution {
    // This function should print the prime factorization
    // of the number n
    // The new line is given by the driver's code.
    public static void printPrimeFactorization(int n) {
        // code here
        for(int  i = 2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n = n/i;
            }
        }
    }
}
