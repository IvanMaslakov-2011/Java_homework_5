package task_4;

import java.util.ArrayList;

public class GradeAnalyzer {

    public double getAverage(Student s) {
        if (s.getGrades().isEmpty()){
            return 0;
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < s.getGrades().size(); i++) {
            sum += s.getGrades().get(i);
            count++;
        }
        return (double) sum / count;
    }

    public int getHighestGrade(Student s){

        int highestGrade = 0;

        for(int grade : s.getGrades()){

            if (grade > highestGrade){

                highestGrade = grade;
            }
        }

        return highestGrade;
    }

    public int getLowestGrade(Student s){

        int lowestGrade = s.getGrades().get(0);

        for(int grade : s.getGrades()){

            if (grade < lowestGrade){

                lowestGrade = grade;
            }
        }

        return lowestGrade;
    }

    public int countPassingGrades(Student s){

        int passingGrades = 0;

        for (int grade : s.getGrades()){
            if (grade >= 60){
                passingGrades++;
            }
        }
        return passingGrades;
    }

    public void printAllGrades(Student s) {

        if (s == null || s.getGrades() == null) {
            return;
        }

        for (int i = 0; i < s.getGrades().size(); i++){
            System.out.print(s.getGrades().get(i) + ", ");
        }
    }

}
