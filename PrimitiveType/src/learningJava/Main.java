package learningJava;

import javax.swing.plaf.multi.MultiDesktopIconUI;
import java.sql.SQLOutput;

//import FirstMethod;
public class Main {
    public static void main(String[] args) {
        // write your code here

        primitiveValue();
        Main.challenge();
        floatDouble();
        poundsToKilogram(200);
        stringType();
        logicOperator();
        practiceOfOperator();
        ifElseStatement();
        displayHighScorePosition("Nacy", 1500);
        displayHighScorePosition("Nacy", 900);
        displayHighScorePosition("Nacy", 400);
        displayHighScorePosition("Nacy", 50);
        printConversion(75.114);
        printMegaBytesAndKiloBytes(0);
        System.out.println(shouldWakeUp(true,22));
        System.out.println("is LeapYear: " + isLeapYear(-1));
        System.out.println(areEqualByThreeDecimalPlaces(1.176, 1.175));
        System.out.println("hasEqualSum: " + hasEqualSum(1,2,3));
        System.out.println("hasTeen: " + hasTeen(11, 0, 99));
        System.out.println("FeetInches to cm: ------------- ");
        calFeetAndInchesToCentimeters(13,1);
        calFeetAndInchesToCentimeters(-10);

    }

    // ************* MethodOverloading parts *************
    public static double calFeetAndInchesToCentimeters(double feet, double inches){
        if( feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid inches or feet.");
            return -1;
        }else{
            System.out.println("FeetAndInches to cm is: " + (2.54 * inches + 2.54 * (12 * feet) ));
            return 1;
        }
    }
    public static double calFeetAndInchesToCentimeters(double inches){
        if(  inches < 0 ){
            System.out.println("Invalid single inches.");
            return -1;
        }else{
            System.out.println("Remaining inches is :" + (int) inches % 12);
            double feet = (int)(inches / 12);
            System.out.println(feet);
            double remainInches = (int) inches % 12;
            return calFeetAndInchesToCentimeters(feet, remainInches);
        }
    }

    public static boolean hasTeen(int first, int second, int third){
        return isTeen(first) || isTeen(second) || isTeen(third);
    }

    public static boolean isTeen(int number){
        return number >= 13 && number <= 19;
    }

    public static boolean hasEqualSum(int first, int second, int third){
        boolean equal;
        equal = (first + second) == third;
        return equal;
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        int firstInt = (int)(first * 1000);
        int secondInt = (int)(second * 1000);
        return firstInt == secondInt;
    }

    public static boolean isLeapYear(int year){
        boolean leapYear;
        if (year<1 || year > 9999){
            leapYear = false;
        }else if (year % 400 == 0){
            leapYear = true;
        }else {
            leapYear = year % 4 == 0 && year % 100 != 0;
        }

        return leapYear;
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        boolean wakeUp;
        if (isBarking){
            if (hourOfDay < 0 || hourOfDay > 23){
                wakeUp = false;
            } else if (hourOfDay< 8 || hourOfDay > 22){
                wakeUp = true;
            } else {
                wakeUp = false;
            }
        }else {
            wakeUp = false;
        }
        return wakeUp;
    }

    public static long toMilesPerHour(double kilometersPerHour){

        long milesPerHour;
        if (kilometersPerHour < 0){
            milesPerHour = -1;
        }else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }

        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour < 0 ){
            System.out.println("Invalid Value");
        }else {
            System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h ");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = kiloBytes / 1024;
            int remainKiloBytes = kiloBytes % 1024;
//            if (remainKiloBytes == 0){
//                System.out.println(kiloBytes + " KB = " + megaBytes + " MB");
//            }else {
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKiloBytes + " KB");
//            }
        }

    }

    public static void displayHighScorePosition(String playerName, int playerScore){

        int position;
        position = calculateHighScorePosition(playerScore);
        System.out.println(playerName + " Managed to get into position "
                + position +  " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position;

        if (playerScore >= 1000){
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }else {
            position = 4;
        }
        return position;
    }

    public static void primitiveValue(){
        // 2^31
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // Underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
//        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Maximum Byte Value is " + myMaxByteValue);
        System.out.println("My Minimum Byte Value is " + myMinByteValue);

        // 2^15
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Maximum Short Value is " + myMaxShortValue);
        System.out.println("My Minimum Short Value is " + myMinShortValue);

//        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Maximum Long Value is " + myMaxLongValue);
        System.out.println("My Minimum Long Value is " + myMinLongValue);

        //Casting
//        byte myCastByte = (byte) (myMinByteValue / 2);
//        short shortWrong = 32767;
//        System.out.println("Literal value ",  );
    }

    public static void challenge() {
        byte challengeByte = (byte) 10;
        short challengeShort = (short) 20;
        int challengeInt = 50;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);
        System.out.println(challengeLong);
    }

    public static void floatDouble() {

        // float  Float.MIN_VALUE  Float.MAX_VALUE
        // double Double.MIN_VALUE Double.MIN_VALUE
        float myFloatValue = 5;
        myFloatValue = (float) 5.23;
        myFloatValue = 5.23f;
        myFloatValue = 34f / 7f;

        double myDoubleValue = 5;
        myDoubleValue = 2.5;
        myDoubleValue = 2.5d;
        myDoubleValue = 34 / 7;

        int myIntValue = 34 / 7;

        System.out.println(" int / int " + myIntValue);
        System.out.println(" float / float " + myFloatValue);
        System.out.println(" double / dboule " + myDoubleValue);

        double myAttention = 34 / 7;
        System.out.println(" double 34/7 " + myAttention);
    }

    public static void poundsToKilogram(double pounds) {
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! FORGET d !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        double kilogram = pounds * 0.45359237d;
        System.out.println(pounds + " pounds to " + kilogram + " kilograms.");
    }

    public static void charBoolean() {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
    }

    public static void stringType() {

        System.out.println("This is in stringType.");
        String myString = "This is a string";
        System.out.println("myString is equal to" + myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

    }

    public static void logicOperator() {
        int myInt = 10;
        boolean isCar = true;
        if (isCar) {
            System.out.println("Is car!");
        }
        if (!isCar) {
            System.out.println("It is not Car!");
        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true!!!");
        }

    }

    public static void practiceOfOperator() {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double thirdDouble = (firstDouble + secondDouble) * 100.00;
        double remainder = thirdDouble % 40;
        System.out.println("My value total: " + remainder);
        boolean noRemainder = remainder == 0;
        // boolean noRemainder = remainder == 0 ? true : false;
        System.out.println("noRemainder is: " + noRemainder + ".");
        if (!noRemainder) {
            System.out.println("Got some remainder!");
        }
    }

    public static void ifElseStatement(){
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 10;
        int bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        } else if(!gameOver && score < 100){

        } else{
        } {

        }
    }



}

// byte -- 8 bits -128(2^7) ~ 127
// short -- 16 bits -32768(2^15) ~ 32767
// int -- 32 bits -2147483648(2^31) ~ 2147483647
// long -- 64 bits -9223372036854775808(2^63) ~ 9223372036854775807
// Convert int -> long, int -> short.
// Casting -- convert a number from one type to another.
//      -- (byte) (myMinByteValue/2) -- treat value following () as byte
//      -- always use integer.

//  floating  -- real number;
//            -- single precision number 32 bits
//            -- 1.4 E-45 ~ 3.4028235E+38
//  double  -- double precision 64 bits.
//          -- 4.9E-324 ~ 1.7976931348623157E+308
//          -- double is assumed floating point number
//          -- Recommend!!!!!!!!
//          Attention:
//            Double accept int value, if we don't give decimal in divided operation,
//            the result will perform like int.

// Division
//  Int / Int -- only accept integer part.
//
// Char
//   Two bytes of memory.
//   16 bits and width of 16.
//   Allows programmer to store unicode.
//
// Boolean
//   -- false / true
//
// String
//   -- Class
//      Immutable !!!!!!
//      (net result ????)
//      **StringBuffer** can be changed.
//   -- Can contain a sequence of characters.
//   -- 2.14 billion (max_value of int)
//      String + Number ( Int/double -> String )
//
// Operand
//  -- object that is manipulated by an operator.
// Operator
//  -- special symbols that perform specific operations on operands.
//      math:
//          myInt +\*\/\-= 2
//      logic:
//          if () {
//          }else ()
//      equal:
//          ==  !=  >  >=  <  <=
//          &&  (& bitwise and)
//          ||  (| bitwise or)
//      Ternary Operator: (? :)
//          variableClass variable = condition ? valueForTrue : valueForFalse;
//      Summary of operators:
//          https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//      Operators precedence table:
//          http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
//
// Expression
//  -- operator and operand
//  -- strings are also expressions.
//  -- always use code block. (For debug)
//
// Statement
//  -- assignment expressions,  abbreviation expression.
//  -- semicolon.
//
// WhiteSpace
//  -- will be ignored.
//
//
// Indentation
//  -- make sure things are what it should be.
//
//
// Method
//  -- method can not be nested.
//  -- can pass value or variable to method.
//  -- void
//      -- not return anything
//      -- dataType we want to return to replace void
//  -- return -1
//      -- indicate error.
//         In searching algorithm -1 indicates invalid value or value not found.
//
// Method overloading
//  Similar method but use different number of parameters.
//  -- Methods have same name but have different parameters.
//
// Constant
//  private static final String  INVALID_VALUE_MESSAGE = "Invalid value";
//  -- can not be changed once assigned.
//
//
//
//
// ***** Git learning *****
// Operation
//  -- git init
//  -- git add (git add fileName)
//  -- git commit (git commit fileName -m "Commit Message")
//  -- git log
//  -- git checkout (git checkout commitId // git checkout master)
// Timeline
//   Head
//       0 -> 0 -> 0 -> 0
//                       Master
//                       ( We are at master,
//                       checkout some code
//                       and back to master)
//
// Checkpoints
//  Excellent explanation for master and head: https://git-scm.com/book/en/v2/Git-Branching-Branches-in-a-Nutshell
//
// How to revert from current state to a snapshot made on  a certain commit.
//  git revert --no-commit commitId..HEAD
//  git commit
//
//
// Branch (basically is pointer)
//  -- master: default branch
//      -- if not change, will point to the branch we created.
//  -- HEAD: position branch
//  -- create new branch
//      -- git branch newBranchName
//  -- see status of branches
//      -- git log --oneline --decorate
//  -- switch branches (will move HEAD branch to the branch declared)
//      -- git checkout nameOfBranch
//  -- Merge branches
//      -- git merge nameOfBranch ( move previous branch to later branch)
//  -- Delete branch
//      -- git branch -d nameOfBranch
//  -- Check merge conflict
//      -- git status
//
// One useful tutorial https://www.vogella.com/tutorials/Git/article.html
//
//
//aaaaaaadfsfsfsd
// I add some changes at sub-folders and test.