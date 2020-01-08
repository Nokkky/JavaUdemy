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
}
// Switch variable can be int, string, char.
//
// for Statement
//  -- for(init statement; termination statement; increment statement)
//
//  isPrime(i)
//   -- can be used to judge whether number i is prime number.
//  (long) Math.sqrt(n)
//  (long) Math.sqare(n)