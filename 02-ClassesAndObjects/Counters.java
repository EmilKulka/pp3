public class Counters {
    int initialValue = 0;

    void incrementValue() {
        initialValue ++;
        System.out.println("The value is " + initialValue);
    }
    void decrementValue() {
        initialValue --;
        System.out.println("The value is " + initialValue);
    }
    void increaseByTen() {
        initialValue += 10;
        System.out.println("The value is " + initialValue);
    }
    void decreaseByTen() {
        initialValue -= 10;
        System.out.println("The value is " + initialValue);
    }

    void resetToInitial() {
        initialValue = 0;
    }

    public static void main(String[] args) {
        Counters counter1 = new Counters();
        counter1.incrementValue();
        counter1.incrementValue();
        counter1.incrementValue();
        counter1.increaseByTen();
        counter1.increaseByTen();
        
        Counters counter2 = new Counters();
        counter2.decrementValue();
        counter2.decrementValue();
        counter2.decrementValue();
        counter2.decrementValue();
        counter2.decrementValue();
        counter2.decrementValue();
        counter2.decrementValue();
        counter2.decreaseByTen();
        counter2.decreaseByTen();
        counter2.decreaseByTen();
        counter2.decreaseByTen();
    }
    
}
