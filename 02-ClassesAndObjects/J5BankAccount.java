public class J5BankAccount {
    String owner;
    String accountNumber;
    float balance;
    int numberOfCards;
    String accountType;
    
    void displayBalance() {
        System.out.println("Your balance is " + balance);
    }

    void displayAccountNumber() {
        System.out.println("Your account number is " + accountNumber);
    }

    void  depositMoney(float deposit) {
        balance += deposit;
        System.out.println("You have made deposit into your account in the amount of " + deposit + ".");
    }
}

