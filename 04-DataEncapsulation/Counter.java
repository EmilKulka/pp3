public class Counter {
    int value = 0;

    public void increase() {
        value ++;
    }

    public void decrease() {
        value --;
    }

    public void increase(int n) {
        value += n;
    }

    public void decrease(int n) {
        value -= n;
    }

    public int value() {
        return value;
    }


    public static void main(String[] args) {
        Counter c = new Counter();
        c.value(); 
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());

    }
}


