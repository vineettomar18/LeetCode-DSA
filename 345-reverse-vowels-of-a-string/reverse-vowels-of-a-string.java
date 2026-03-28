class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            if(!isVowel(arr[i])){
                i = i+1;
            }else if(!isVowel(arr[j])){
                j = j-1;
            }else{
                //swap
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = i+1;
                j = j-1;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}