public class CreditCard {
    private int accountNumber;
    private double balance;

    CreditCard() {
        accountNumber = (int)(Math.random() * 1e6);
        balance = 0.0;
    }

    CreditCard(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // пополнение баланса
    public void increaseBalance(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Successful!");
        } else
            System.out.println("Enter the correct amount!");
    }

    // снятие денег с карты
    public void withdrawTheAmount(int amount) {
        if(amount > 0) {
            double isBalance = balance - amount;
            if(isBalance >= 0) {
                balance = isBalance;
                System.out.println("Successful. You withdraw: " + amount);
            }
            else
                System.out.println("You don't have enough money! Your balance: " + balance);
        } else
            System.out.println("Enter the correct amount!");
    }

    public void checkInfo() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Account number: " + accountNumber + "\nCurrent balance: " + balance;
    }
}

class CheckCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard(224567, 10000);
        CreditCard card3 = new CreditCard(578435,50000);

        card1.increaseBalance(40000);
        card2.increaseBalance(20000);
        card3.withdrawTheAmount(2000);

        card1.checkInfo();
        System.out.println();
        card2.checkInfo();
        System.out.println();
        card3.checkInfo();
    }
}
