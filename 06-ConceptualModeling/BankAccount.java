public class BankAccount {
    private float balance;
    private String accountHolder;

    public BankAccount(String accountHolder) {
        this.balance = 0;
        this.accountHolder = accountHolder;
    }

    public String displayBalance() {
        return String.format("Your balance is %.2f PLN", balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Your balance is less than withdrawal amount");
        }
        else if(amount > 500) {
            System.out.println("You can't withdraw more than 500 PLN at one time");
        }
        else {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount one = new BankAccount("Emil Kulka");

        one.deposit(500);
        System.out.println(one.displayBalance());
        one.deposit(200);
        System.out.println(one.displayBalance());
        one.withdraw(300);
        System.out.println(one.displayBalance());
        one.withdraw(501);
        one.deposit(500);
        one.withdraw(501);
    }

    

}
