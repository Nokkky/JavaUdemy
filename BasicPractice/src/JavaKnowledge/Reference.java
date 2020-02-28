package JavaKnowledge;

import sun.security.util.AuthResources_sv;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Reference {

    public static class Student{
        public String name;
        public int score;

        public Student(String _name, int _score){
            name = _name;
            score = _score;
        }
        public Student(){
            name = "";
            score = 0;
        }
    }

    static public void main(String[] args){
        Student student = new Student("Jonh", 100);
        Student student2 = new Student();
        student2.name = student.name;

        student2.name = "Mary";
        // String reference 的赋值不会相互影响。
        System.out.println("student " + student.name);
        System.out.println("student2 " + student2.name);

        ArrayList<Integer> arrayList = new ArrayList<>();


    }
}
