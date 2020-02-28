package JavaKnowledge;

public class strToInteger {
    /**
     * @param str: A string
     * @return: An integer
     */
    public static void main(String[] args){
        System.out.println(stringToInteger("-1"));
    }
    public static int stringToInteger(String str) {
        // write your code here
        if (str == null){
            return 0;
        }
        int base = 1;

        // negative Number
        if (str.charAt(0) == '-'){
            str = str.substring(1);
            base = -1;
        }

        char[] charArray = str.toCharArray();
        int result = 0;
        for (char numChar: charArray){
            int number = numChar - '0';
            result = result*10 + number * 1;
        }


        return base * result;

    }

}