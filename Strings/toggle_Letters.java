import java.util.*;
class toggle_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string  : ");
        String s = sc.nextLine();
        int al = 0;
        int all =0;
        String f = " ";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( c>='a' && c<='z'|| c>='A' && c<='Z'){
                System.out.print((char)(c^32));
            }}
        
    }
}
