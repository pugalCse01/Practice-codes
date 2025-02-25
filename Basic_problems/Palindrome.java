import java.util.*; 

public class Main { 
    public static boolean isPalindrome(int n) {
        int org = n;
        int sum = 0;
        
        while (n > 0) {
            int id = n % 10;
            sum = (sum * 10) + id;
            n = n / 10;
        }
        
        return sum == org;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {  
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

        sc.close();
    }
}
