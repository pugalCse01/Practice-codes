class printVowelsSentence {
    public static void main(String[] args) {
        String[] s = {"Apple","orange","Mango"};
        for(String w : s){
            char[] ch = w.toCharArray();
            char c1 = ch[0];
            char c2 = ch[ch.length-1];
            if(("aeiou".indexOf(c1))!=-1  || ("AEIOU".indexOf(c1))!=-1 && ("aeiou".indexOf(c2)) !=-1){
                System.out.println(w);
            }
        }
    }
}
