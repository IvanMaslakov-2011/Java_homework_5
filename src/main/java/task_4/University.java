package task_4;

public class University {

    public static void main(String[] args){
        Student student1 = new Student("Joe", 20, 99, 75, 40, 61, 80);
        Student student2 = new Student("Mary", 21, 89, 95, 65, 87);
        Student student3 = new Student("Gary", 19, 45, 99, 99, 100, 78);

        GradeAnalyzer analyzer = new GradeAnalyzer();

        System.out.println("Статистика для " + student1.name + ":");
        System.out.println("Середній бал: " + analyzer.getAverage(student1));
        System.out.println("Найвища оцінка: " + analyzer.getHighestGrade(student1));
        System.out.println("Найнижча оцінка: " + analyzer.getLowestGrade(student1));
        System.out.println("Кількість прохідних балів: " + analyzer.countPassingGrades(student1));
        System.out.print("Усі оцінки: ");
        analyzer.printAllGrades(student1);

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Статистика для " + student2.name + ":");
        System.out.println("Середній бал: " + analyzer.getAverage(student2));
        System.out.println("Найвища оцінка: " + analyzer.getHighestGrade(student2));
        System.out.println("Найнижча оцінка: " + analyzer.getLowestGrade(student2));
        System.out.println("Кількість прохідних балів: " + analyzer.countPassingGrades(student2));
        System.out.print("Усі оцінки: ");
        analyzer.printAllGrades(student2);

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Статистика для " + student3.name + ":");
        System.out.println("Середній бал: " + analyzer.getAverage(student3));
        System.out.println("Найвища оцінка: " + analyzer.getHighestGrade(student3));
        System.out.println("Найнижча оцінка: " + analyzer.getLowestGrade(student3));
        System.out.println("Кількість прохідних балів: " + analyzer.countPassingGrades(student3));
        System.out.print("Усі оцінки: ");
        analyzer.printAllGrades(student3);



    }
}
