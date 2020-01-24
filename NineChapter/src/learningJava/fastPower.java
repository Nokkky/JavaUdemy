package learningJava;

import java.util.ArrayList;

public class fastPower {

    public static void main(String[] arg) {
        System.out.println(fastPower(2147483647,1147483647,2147483647));
//        System.out.println(fastPower(11, 123898, 12345));
        doublePow(8.84372, -5);
    }

    /** Recursion version can not pass
     *  Big Number Test!
     *  eg: a: 2147483647, b: 1147483647, n: 2147483647 **/
    public static long recursionFastPower(int a, int b, int n) {

        if ( b == 0) return -1;
        // write your code here
        if (n == 0) return (1 % b);
        if (a % b == 0) return 0;

        long reminder = recursionDivided(a, b, n);
        return (long)(reminder % b);
    }
    public static long recursionDivided(int a, int b, int n){

        if (n == 1) return a % b;
        long reminder ;
        reminder = recursionDivided(a, b, n/2);

        if (reminder == 0) return 0;

        if (n % 2 == 0){
            reminder = reminder % b;
            return (reminder * reminder % b);
        }else{
            long temp = a % b;
            reminder = reminder % b;
            temp = temp * reminder * reminder % b;
            return temp % b;
        }
    }

    /** using while loop to solve a^n % b **/
    public static int fastPower(int a, int b, int n){
        long ans = 1, base = a;
        while (n != 0){
            if ( n % 2 == 1){
                ans =  (ans * base) % b;
            }
            base = (base * base) % b;
            n = n / 2;
        }

        return (int) ans % b;
    }

    /** While loop to implement quickPower
     *  log(n) calculate x^n  **/
    public static int quickPower(int x, int n) {
        int ans = 1, base = x;
        while (n != 0) {
            System.out.println("n = " + n);
            if (n % 2 == 1) {
                ans *= base;
                System.out.println("ans = " + ans);
            }
            base *= base;
            System.out.println("base = " + base);
            n = n / 2;
        }
        return ans;
    }

    /** double format for quickPower
     *  n might be negative!!! **/
    public static double doublePow(double x, int n) {

        if( n == 0) return 1;

        boolean negativePower = false;
        double ans = 1, base = x;
        System.out.print("double " + n + " power of " + x + " is :" );
        if (n < 0) {
            // negativePower = true;
            base = 1/base;
        }
        // write your code here

        while(n != 0){
            if (n % 2 == 1 || n % 2 == -1){
                ans *= base;
            }
            base *= base;
            n = n / 2;
        }
        System.out.print( ans);
        return ans;
    }

}
