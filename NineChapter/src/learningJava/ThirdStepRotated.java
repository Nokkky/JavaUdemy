package learningJava;

public class ThirdStepRotated {

    public static void main(String[] arg){
        int[] array = {4, 5, 1, 2, 3};


    }

    public static void reduction(int[] array){

        int minPosition = 0;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                minPosition = i + 1;
            }
        }




    }
}
