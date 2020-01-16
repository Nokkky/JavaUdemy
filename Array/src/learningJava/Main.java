package learningJava;

import java.util.Scanner;

public class Main {

    // need to put outside the method. constant variable.
    // private static variable for all instances.
    // can not change value latter.
    private static Scanner scanner = new Scanner(System.in);

    //
    public static void main(String[] args) {
	// write your code here

        int[] myArray = getIntegers(5);
        printArray(myArray);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
//        System.out.println("double");
//        System.out.println(3.0/2);
//        System.out.println(3/2.0);
//        System.out.println(3/2);
    }

    public static void littlePractice(){
        int[] myVariable ;
        myVariable = new int[10]; // 10 int variables
        myVariable[5] = 50; // 6 variable's value is 50
        double[] myDoubleArray = new double[10];

        int[] myIntArray = {1,2,3,4,5};

        System.out.println(myVariable[5]);
        System.out.println("Length of array is: " + myVariable.length);
    }

}

// Array
//  -- Array is a data structure that
//      allows you to store multiple values of
//      the same type into a single variable.

//  -- Default values = 0,
//      of numeric array elements are set to zero.

//  -- Zero indexed.
//      Exception: ArrayIndexOutOfBoundsException.

//  -- Initialize method:
//      1. int[] myIntVariable = new int[10];
//         Initialize inline.
//      2. int[] myIntVariable = {1, 2, 3, 4} Only acceptable at this time.
//
//  -- Get length of an array:
//      1. myVariable.length  ( a field of array, store the length of array)
//
//  -- A better way to copy array:
//      int[] copiedArray = Arrays.copyOf(array, array.length);
//
//
//
//
//
//
//
//
//

