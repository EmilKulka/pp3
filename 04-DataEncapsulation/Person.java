public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() { 
        if(getAge() >= 18) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return String.format("%s,%d", getName(),getAge());
    }
    
    public static void main(String[] args) {
        Person p = new Person("Anna",21);
        p.getAge(); //returns 21
        p.isAdult(); //returns true
        p.setAge(17);
        System.out.println(p.isAdult()); // returns false
        System.out.println(p.toString()); 

    }
}
