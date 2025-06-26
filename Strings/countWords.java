

class countWords {
    public static void main(String[] args) {
       int  n = countWords("Hello How are you");
       System.out.println(n);
    }
     public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        int n = str.split("\\s").length;
        return n;
    }
}
