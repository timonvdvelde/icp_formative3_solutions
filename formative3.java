class BankAccount {
  private double balance;

  BankAccount() {
    balance = 0;
  }

  void deposit(double amount) {
    balance = balance + amount;
  }

  double getBalance() {
    return balance;
  }
}

class SavingsAccount extends BankAccount {
  // yearly
  // 4%
  // 0.04
  private double interestRate;

  SavingsAccount(double interestRate) {
    this.interestRate = interestRate;
  }

  // assuming one year has passed
  // returns new balance after adding interest
  double addInterest() {
    double balance = getBalance();
    double increase = interestRate * balance;
    deposit(increase);
    return increase;
  }
}

class Main {
  public static void main(String[] args) {
    SavingsAccount myAccount = new SavingsAccount(0.04);

    System.out.println("Balance " + myAccount.getBalance());
    myAccount.deposit(1000);
    System.out.println("Balance " + myAccount.getBalance());
    double increase = myAccount.addInterest();
    System.out.println("Balance increased by " + increase);
    System.out.println("Balance " + myAccount.getBalance());
  }
}
