package JavaBasic_Integer_Char;

import java.util.ArrayList;

public class PalindromeNumber_491 {

    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        // store at ArrayList
        // two pointer Compare

        ArrayList<Integer> single = new ArrayList<Integer>();

        while(num > 0){
            single.add(num % 10);
            num = num / 10;
        }

        int start = 0;
        int end = single.size() - 1 ;

        while (start < end){

            if (single.get(start) != single.get(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;

    }

    public boolean isPalindrome2(int num){

        String string = String.valueOf(num);

        int start = 0, end = string.length() - 1;

        while(start < end){
            if (string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;

    }


}
