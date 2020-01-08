package learningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 3;
        switch(switchValue){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3: case 4: case 5:
                System.out.println("3 or 4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;

        }
        forStatement();
        whileStatement();
        sumDigits(10);
        System.out.println("Is palindrome: " + numberPalindrome(-0));
    }
    public static void forStatement(){
        for(int i = 0; i < 5; i++){
            System.out.println("hello");
        }
        int start = 10000;
        for(int i = 2; i < 9; i++){
            System.out.println(start + i);
        }
        for(int i = 8; i>=2; i--){

        }
        for(int i = 2; i < 9; i = i + 2){
            System.out.println(start + i);
        }
    }

    public static void whileStatement(){
        int count = 1;
        while(count <= 5){
            count ++;
            System.out.println("count number is :" + count);
        }
        count = 1;
        do{
            System.out.println("count value = " + count);
            count ++;
        }while(count != 6);
    }

    private static int sumDigits(int number){
        int sum = 0;
        if (number < 10){
            System.out.println("sumDigits: invalid number.");
            return -1;
        }else {
            while (number > 0) {
                // get the lest-significant digit;
                sum = sum + (number % 10);
                // drop the least-significant digit;
                number = number / 10;
            }
        }
        System.out.println("sumDigits: " + sum);
        return sum;
    }

    private static boolean numberPalindrome(int number){
        // create a new number to store reversed number
        int reversedNum = 0;
        // store the original number;
        int originalNum = number;
        while(originalNum != 0) {
            // get the remainder of original number
            int remainder = originalNum % 10;
            // add the remainder to reversed number
            reversedNum = reversedNum * 10 + remainder;
            // remove the last digit number
            originalNum = originalNum / 10;
        }
        // compare the reserved number with original number
        if (number == reversedNum){
            return true;
        }else{
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number){
        // get the last digit;
        if(number == 0){
            return 0;
        }
        int lastDigit = number % 10;

        // get the first digit;
        int firstDigit = 0;
        while(number != 0){
            firstDigit = number % 10;
            number = number / 10;
        }
        // sum together;
        int sum = firstDigit + lastDigit;
        return sum;
    }
}
// Switch variable can be int, string, char.
//
// for Statement
//  -- for(init statement; termination statement; increment statement)
//
//  isPrime(i)
//  -- can be used to judge whether number i is prime number.
//  (long) Math.sqrt(n)
//  (long) Math.sqare(n)
// while statement
//  -- while (condition) {
//      if (condition) {
//          process;
//          continue;  // skip some step;
//      }
//      if(condition){
//          break;
//      }
//  }