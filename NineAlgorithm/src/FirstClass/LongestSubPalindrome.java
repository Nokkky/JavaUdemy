package FirstClass;
public class LongestSubPalindrome {
    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */

    public static void main(String[] args){

        longestPalindrome("aaaaaa");
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        int longest = 1, start = 0;
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            isPalindrome[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
            if (isPalindrome[i][i + 1]) {
                start = i;
                longest = 2;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 2; j < n; j++) {
                System.out.println(i + " " + j);
                isPalindrome[i][j] = isPalindrome[i + 1][j - 1] &&
                        s.charAt(i) == s.charAt(j);

                if (isPalindrome[i][j] && j - i + 1 > longest) {
                    start = i;
                    longest = j - i + 1;
                }
            }
        }

        return s.substring(start, start + longest);
    }


//    public String longestPalindrome(String s) {
//
//        // write your code here
//        boolean[][] f = new boolean[s.length()][s.length()];
//        for (int i = 0; i < s.length(); i++){
//            f[i][i] = true;
//        }
//
//        int res = 1;
//        int start = 0;
//        int end = 0;
//        for (int i = 0; i < s.length() - 1; i++){
//            for (int j = i + 1; j < s.length(); j++){
//
//                if (isPalindrome(s,i,j, f)){
//                    if (j-i+1 > res){
//                        res = j - i + 1;
//                    }
//                }
//
//            }
//        }
//
//        // if j-1 >= i + 1 (i,j) = (i + 1, j-1) && i==j
//        // if j-1 < i+1 -> not valid substring -> j < i + 2 ->  i + 1 =< j <= i + 1 -> j == i + 1
//        return s.substring(start, end + 1);
//    }

//    public boolean isPalindrome(String s, int i, int j, boolean[][] f){
//
//        // not substring (i, i+1)
//        if ( j <= i + 1){
//            if (s.charAt(i) == s.charAt(j)){
//                f[i][j] = true;
//            }else{
//                f[i][j] = false;
//            }
//        }
//        // contain substring [i, i + 1, j]
//        if ( j >= i + 2){
//            if (f[i+1][j-1] && s.charAt(i) == s.charAt(j)){
//                s.charAt(0);
//                f[i][j] = true;
//            }else{
//                f[i][j] = false;
//            }
//        }
//
//        return f[i][j];
//
//    }




}