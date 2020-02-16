package learningJava;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numberAsInteger = "2018";
        System.out.println("numberAsString: " + numberAsInteger);
        int number = Integer.parseInt(numberAsInteger);
        System.out.println("Number equal: " + number);
        printSquareStar(5);

        String log = "10.223.157.186 - - [15/Jul/2009:15:50:51 -0700] \"GET /assets/css/960.css HTTP/1.1\" 304 -";
        String log1 = log.replaceFirst("\\[", "");

        String[] record = log.split(" ");

        for(String iter: record){
            System.out.println(iter);
        }

        record[3] = record[3].replaceFirst("\\[", "");
        record[4] = record[4].replaceFirst("\\]", "");
        System.out.println("--------");
        for(String iter: record){
            System.out.println(iter);
        }

        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        hashmap.put("111", 1);
        hashmap.put("2222", 2);
        for (String key : hashmap.keySet()){
            if (hashmap.get(key) == 1){
                System.out.println(key);
                System.out.println(hashmap.get(key));
            }
        }
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