package learningJava;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        userInputChallenge();
//        MinAndMaxInputChallenge();
        inputThenPrintSumAndAverage();
    }

    private static void problemHandling(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            System.out.println("Entered year of birth is: " + yearOfBirth);
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age > 0 && age <= 100){
                System.out.println("Your age is: " + age);
                System.out.println("Your name is: " + name);
            }else{
                System.out.println("Invalid age.");
            }
        }else{
            System.out.println("Invalid year of birth input.");
        }
        scanner.close();
    }

    private static void userInputChallenge(){

        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(count < 10){
            int order = count + 1;
            System.out.println("Please Enter number " + order);

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                sum += scanner.nextInt();
                count ++;
            }else{
                System.out.println("Invalid number input!");
            }

            scanner.nextLine();
        }
        System.out.println("Total input is: " + sum);
        scanner.close();
    }

    private static void MinAndMaxInputChallenge(){

            int maxNum = Integer.MIN_VALUE;
            int minNum = Integer.MAX_VALUE;

            Scanner input = new Scanner(System.in);

            System.out.println("Please Enter number: ");

            boolean hasNextInt = input.hasNextInt();

            while(hasNextInt){
                int userInput = input.nextInt();
                if (userInput < minNum){
                    minNum = userInput;
                }
                if (userInput > maxNum){
                    maxNum = userInput;
                }
                input.nextLine();
                System.out.println("Please Enter number: ");
                hasNextInt = input.hasNextInt();
            }
            System.out.println("Max input number is " + maxNum + " Min input number is " + minNum);
            input.close();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double count = 0;
        int avg = 0;

        boolean hasNextInt = input.hasNextInt();

        while(hasNextInt){
            int userInput = input.nextInt();
            sum += userInput;
            count ++;
            input.nextLine();
            hasNextInt = input.hasNextInt();
        }

        avg = (int) Math.round(sum / count);

        System.out.println("SUM = " + sum + " AVG = " + avg);
        input.close();


    }

}

// Scanner Class
//  -- Scanner scanner = new Scanner(System.in);
//  -- scanner.nextLine();
//      -- reads input including space between the words (that is, it reads till the end of line \n).
//         Once the input is read, nextLine() positions the cursor in the next line.
//  -- scanner.nextInt();  must have scanner.nextLine() to handle the enter key.
//      --  it only reads the int value,
//          nextInt() places the cursor in the same line after reading the input.
//  -- scanner.hasNextInt();
//      --  method of java.util.Scanner class returns true
//          if the next token in this scanner’s input can be assumed as a Int value of the given radix.
//  -- scanner.next()
//      -- read the input only till the space. It can't read two words separated by space.
//         Also, next() places the cursor in the same line after reading the input.
//  -- scanner.close();

