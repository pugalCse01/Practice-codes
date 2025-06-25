import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int i = 0;
        while (i < s.length()) {
            char letter = s.charAt(i); 
            i++;
            String num = "";
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num += s.charAt(i);
                i++;
            }
            int count = Integer.parseInt(num);
            System.out.print(String.valueOf(letter).repeat(count));
        }
    }
}
