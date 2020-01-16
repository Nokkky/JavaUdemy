package learningJava;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class MinimumElementChallenge {
    /** readIntegers(int count)
     *  findMin(array)
     *    -- return the minimum value in the array
     *  main()
     *    -- read count from the console and call readIntegers()
     *  **/
    private static Scanner scanner = new Scanner(System.in);

    public void main(){

        System.out.println("Please enter the number of variables in array.");

        int count = scanner.nextInt();

        int[] myArray = readIntegers(count);

        int miniValue = findMin(myArray);

        System.out.println("The minimum value in array is " + miniValue);
    }
    public int findMin(int[] array){

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if (minimum > array[i]){
                minimum = array[i];
            }
        }

        return minimum;
    }
    public int[] readIntegers(int count){

        int[] myArray = new int[count];

        System.out.println("Please enter "+ count + " numbers.");
        for (int i = 0; i < count; i++){
            myArray[i] = scanner.nextInt();
//            scanner.nextLine();
        }
        return myArray;
    }




}
