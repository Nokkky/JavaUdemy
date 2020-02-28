package FirstClass;

import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[] args){
//        System.out.println(longestPalindrome("aaa"));
    }

    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here

        if (s == null || s.equals("")){
            return 0;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            chars[i] = (char)(chars[i] - 'a' + 'A');
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++){

            if (!map.containsKey(chars[i])){
                map.put(chars[i],0);
            }

            map.put(chars[i], map.get(chars[i]) + 1);

        }

        // abccccdd
        int length = 0;
        int remove = -1;

        for (char letter: map.keySet()){

            if (map.get(letter) % 2 == 0){
                length += map.get(letter);
            }

            if (map.get(letter) % 2 == 1){
                length += map.get(letter);
                remove++;
            }
        }

        if (remove == -1){
            return length;
        }

        return length - remove;
    }


}