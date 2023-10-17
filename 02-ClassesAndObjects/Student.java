public class Student {
    String name;
    int age;
    String idCard;
    boolean isCardValid;
    int semesterNumber;
    float averageGrade;
    

    void sayHello() {
        System.out.println("Hello from " + name);
    }
    void displayName() { 
        System.out.println("My names is " + name);
    }
    void displayAge() {
        System.out.println("My age is " + age);
    }
    void studentInfo() {
        System.out.println("My name is " + name);
        System.out.println("Im on the " + semesterNumber + " semester.");
        System.out.println("My average grade is " + averageGrade);
    }
    void changeIdCardStatus(boolean isValid) {
        isCardValid = isValid;
    }
    void idInfo() {
        System.out.println("My name is " + name);
        System.out.println("My id is " + idCard);
        System.out.println("ID card is " + (isCardValid ? "Valid" : "Invalid"));
    }
}   
