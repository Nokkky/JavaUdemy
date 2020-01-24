package learningJava;

public class gcd {

    public class Solution1 {
        /**
         * @param a: the given number
         * @param b: another number
         * @return: the greatest common divisor of two numbers
         */
        public int gcd(int a, int b) {

            int result;
            if ( a == 0 || b == 0)
                return -1;
            if ( a > b){
                return gcd2(a,b);
            }
            else {
                return gcd2(b,a);
            }
            // write your code here
        }
        public int gcd2(int bigger, int smaller){

            if (bigger % smaller != 0){
                return gcd2(smaller, bigger % smaller);
            }else{
                return smaller;
            }

        }
    }

}
