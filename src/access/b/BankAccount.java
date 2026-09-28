package access.b;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 매서드 : 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않음 금액입니다.");
        }

    }

    // public 매서드 : 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않거나 잔액이 부족합니다");
        }

    }

    // public 매서드 : 잔액
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

}
