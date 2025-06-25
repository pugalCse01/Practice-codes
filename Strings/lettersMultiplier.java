import java.util.*;

class  lettersMultiplier{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            // If current char is a digit
            if (Character.isDigit(c)) {
                int n = c - '0';  // Convert char digit to int
                char prevChar = s.charAt(i - 1);  // Get the letter before the digit
                String str = String.valueOf(prevChar);
                String repetitions = str.repeat(n);
                System.out.print(repetitions);
            }
        }
    }
}
