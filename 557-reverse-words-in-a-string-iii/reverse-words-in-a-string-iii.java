class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String result="";

        for (String word: words){
            String rev="";
            for (int i=word.length()-1;i>=0;i--){
                rev+=word.charAt(i);
            }
            result+=rev+" ";
        }
        return result.trim();
    }
}