package JavaBasic_Integer_Char;

public class char_to_integer {

    public static void main(String[] args){
        // write your code here
        // return character - (char) 0;


        System.out.println((char)0);
        System.out.println((char)('a' - 'a' + 'A'));
        System.out.println('a' - (char)0);
        System.out.println((int)'a');
        String str = "Hello World.";
        char[] chars = str.toCharArray();

        for (char letter: chars){
            letter = (char)(letter - 'a' + 'A');
            System.out.println(letter);
        }

        for (char letter: chars){
            System.out.println(letter);
        }

        int[] arrays = {1,2,3,4,5};
        for (int number: arrays){
            number = number + 1;
        }
        for (int number: arrays){
            System.out.print(number+ " ");
        }


    }


}
