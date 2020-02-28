package FirstClass;

public class ValidPalindrome {

    public static void main(String[] args){
        String s = "sssssssb";
//        System.out.println(s.charAt(0) == 's');
//        System.out.println('s' > 'z');
//        System.out.println('s' < 'A');
        validPalindrome("ssssssb");

    }
    public static boolean validPalindrome(String s) {
        // write your code here

        if (s == null){
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        boolean match = true;

        // check at string
        while (start < end){

            // get valid startCharacter and endCharacter
            int[] indexes = new int[2];
            indexes = validIndex(s, start, end);
            if (indexes[0] == -1){
                break;
            }
            // compare, if not same then not match
            start = indexes[0];
            end = indexes[1];
            char a = (char)(s.charAt(start) - 'a' + 'A');
            char b = (char)(s.charAt(end) - 'a' + 'A');
            if (a != b){
                match = false;
                break;
            }

            // move start and end pointer
            start++;
            end--;
        }

        return match;

    }

    public static int[] validIndex(String s, int start, int end){

        // find the first and last letter at s[start].. s[end]
        int[] indexes = new int[2];
        System.out.println(start);
        System.out.println(s);
        System.out.println(s.charAt(0));
        while (s.charAt(start) < 'a' || s.charAt(start) > 'A'){
            start++;
            System.out.println(start);
            if (start > s.length()){
                break;
            }
        }
        System.out.println(end);
        while (s.charAt(end) < 'a' || s.charAt(end) > 'A'){
            end--;
            if (end < 0){
                break;
            }
        }

        if (start < end){
            indexes[0] = start;
            indexes[1] = end;
        }else{
            indexes[0] = -1;
            indexes[1] = -1;
        }

        return indexes;

    }

}

