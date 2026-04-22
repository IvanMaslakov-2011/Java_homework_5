package task_4;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name;
    ArrayList<Integer> grades;
    private int age;

    public Student(String name, int age, Integer... gradesInput) {
        this.name = name;
        setAge(age);
        this.grades = new ArrayList<>(Arrays.asList(gradesInput));
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 6 && age < 30) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }
}
