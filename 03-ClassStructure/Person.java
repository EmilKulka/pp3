public class Person {
    String name;
    double weightInKg;
    double heightInCm;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weightInKg, double heightInCm) {
        this.name = name;
        this.heightInCm = heightInCm;
        this.weightInKg = weightInKg;
    }

    public void setWeightAndHeight(double weightInKg, double heightInCm) {
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
    }

    public double calculateBMI() {
        return weightInKg / Math.pow((heightInCm / 100),2);
    }

    public void displayRecord() {
        double bmi = calculateBMI();
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weightInKg);
        System.out.println("Height: " + heightInCm);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("BMI too low");
        }
        else if ( bmi > 24.5) {
            System.out.println("BMI too high");
        }
    }


    public static void main(String[] args) {
        Person person1 = new Person("Emil");
        person1.setWeightAndHeight(75.5,179.0);
        person1.calculateBMI();
        person1.displayRecord();

         Person person2 = new Person("Nikola", 52.0,165.0);
         person2.calculateBMI();
         person2.displayRecord();

    }
}
