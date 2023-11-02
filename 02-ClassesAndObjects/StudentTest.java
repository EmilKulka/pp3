public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Emil";
        student1.age = 20;
        student1.idCard = "226310";
        student1.semesterNumber = 3;
        student1.averageGrade = 4;

        Student student2 = new Student();
        student2.name = "Maciek";
        student2.age = 25;
        student2.idCard = "125521";
        student2.semesterNumber = 2;
        student2.averageGrade = 4;

        student1.studentInfo();
        student1.changeIdCardStatus(true);
        student1.idInfo();
    

        student2.studentInfo();
        student2.changeIdCardStatus(false);
        student2.idInfo(); 

        /*student1.sayHello();
        student1.displayName();
        student1.displayAge();

        student2.sayHello();
        student2.displayName();
        student2.displayAge(); */
    }
}
