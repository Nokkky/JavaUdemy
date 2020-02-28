package JavaKnowledge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));


        int[] x = {};
//        System.out.println(x[0]);
        System.out.println(x.length);
        System.out.println(x == null);
        System.out.println(x);

    }

    public class Student {
        /**
         * Declare two public attributes name(string) and score(int).
         */

        /**
         * Declare a constructor expect a name as a parameter.
         */

        /**
         * Declare a public method `getLevel` to get the level(char) of this student.
         */
        public String name;
        public int score;

        public Student(String _name){
            name = _name;
        }

        public char getLevel() {

            if (score >= 90) {

                return 'A';

            } else if (score >= 80 && score < 90) {

                return 'B';

            } else if (score >= 60 && score < 80) {

                return 'C';

            } else if (score < 60) {

                return 'D';

            }

            return 'N';
        }

    }



}

