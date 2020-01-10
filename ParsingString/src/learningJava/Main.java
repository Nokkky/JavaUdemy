package learningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numberAsInteger = "2018";
        System.out.println("numberAsString: " + numberAsInteger);
        int number = Integer.parseInt(numberAsInteger);
        System.out.println("Number equal: " + number);
        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }else{
            // row control
            for(int row = 0; row < number; row++){
                // col control
                for(int col = 0; col < number; col++){
                    // if we at first row or last row
                    if(row == 0 ||  row == (number - 1) ){
                        System.out.print("*");
                        // if we at diagonal or other position
                    }else if(col == 0 || col == number - 1 || col == row || row == (number - col - 1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
// Integer.parseInt(numberAsString)
//  -- input String should only contain number.
//  -- Successful parse String as number.
//  -- Fail will get error.
//
// Double.parseDouble(doubleAsString)
//
//
//