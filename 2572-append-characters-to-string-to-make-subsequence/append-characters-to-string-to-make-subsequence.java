class Solution {
    public int appendCharacters(String s, String t) {
        int  i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();

        while(i<n && j<m){
            char s1 = s.charAt(i);
            char t1 = t.charAt(j);

            if(s1 == t1){
                j = j+1;
            }
           i = i+1;
        }
        return m-j;
    }
}