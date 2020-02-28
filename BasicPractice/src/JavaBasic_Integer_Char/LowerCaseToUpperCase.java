package JavaBasic_Integer_Char;

import java.util.*;
public class LowerCaseToUpperCase {
    /**
     * @param str: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String str) {
        // write your code here

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++){

            if (chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i] = (char)(chars[i] - 'a' + 'A');
            }
        }

        String result = new String(chars);

        return result;

    }

    public String LowerToUpper(String str){

        StringBuilder newString = new StringBuilder(str);

        for (int i = 0; i < newString.length(); i++){
            char c = newString.charAt(i);
            if (Character.isLowerCase(c)){
                newString.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return newString.toString();
    }
}
