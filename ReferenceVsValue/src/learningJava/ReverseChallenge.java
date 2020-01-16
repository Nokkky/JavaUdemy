package learningJava;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public void main(){

        System.out.println("Please enter the number of variables in array.");

        int count = scanner.nextInt();

        int[] myArray = readIntegers(count);

        reverseArray(myArray);

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

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void reverseArray(int[] array){
        int[] reversedArray = Arrays.copyOf(array, array.length);

        int start = 0;
        int end = reversedArray.length - 1;

        while(end > start){
            int temp = reversedArray[start];
            reversedArray[start] = reversedArray[end];
            reversedArray[end] = temp;
            end --;
            start ++;
        }

        System.out.println("Origional array is ");
        printArray(array);

        System.out.println("Reversed array is ");
        printArray(reversedArray);

    }



}
