import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;
    int numberOFGrades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOFGrades) {
        this.studentName = name;
        randomGrades(numberOFGrades);
    }

    void randomGrades(int numberOFGrades) {
        Random random = new Random();
        grades = new double[numberOFGrades];

        for(int i = 0; i < grades.length; i ++) {
            grades[i] = 2.0 + (random.nextDouble() * 3.0);
        }

    }

    StudentGrades(String name) {
        this.studentName = name;
        gradesFromKeybord();
    }

    void gradesFromKeybord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of grades for " + studentName);
        grades = new double[(int) scanner.nextDouble()];

        for(int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade " + (i+1) + ":");
            grades[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    double lowestGrade(double[] grades) {
        double lowest = grades[0];
        for(int i = 1; i < grades.length - 1; i++) {
            if(grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        return lowest;
    }

    double highestGrade(double[] grades) {
        double highest = grades[0];
        for(int i = 1; i < grades.length - 1; i++) {
            if(grades[i] > highest) {
                highest = grades[i];
            }
        }
        return highest;
    }

    int numberOfGrades(double[] grades) {
        return grades.length;
    }

    double gradePointAverage(double[] grades) {
        double sumGrades = 0;
        for(double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.length;
    }

    void studentInfo() {
        System.out.println("Student name: " + studentName + "\n" +
        "Student grades: " + Arrays.toString(grades) + "\n" + 
        "Number of grades: " + grades.length + "\n" +
        "Lowest grade: " + lowestGrade(grades) + "\n" +
        "Highest grade: " + highestGrade(grades) + "\n" +
        "Grade point average: " + String.format("%1.2f",gradePointAverage(grades)));
    }

    public static void main(String[] args) {
        StudentGrades student1 = new StudentGrades("Emil", 5);
        student1.studentInfo();
        // double[] amandaGrades = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        // double[] jamesGrades = {2.0, 3.0, 2.0, 4.5, 4.5};
        // StudentGrades student1 = new StudentGrades("Amanda",amandaGrades);
        // StudentGrades student2 = new StudentGrades("James", jamesGrades);

        // student1.studentInfo();
        // student2.studentInfo();
    }
}   


