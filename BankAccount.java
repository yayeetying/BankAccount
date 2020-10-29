public class BankAccount {
  //instance variables
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(int ID, String pass) {
    //initialize
    balance = 0.0;
    accountID = ID;
    //if parameter name was accountID (var same name as parameter), you'd do
    //this.accountID = accountID;
    password = pass;
  }

  //method: access balance of account
  public double getBalance() {
    return balance;
  }

  //method: access accountID of account
  public int getAccountID() {
    return accountID;
  }

  // //method: access password of account
  // public String getPassword() {
  //   return password;
  // }

  //method: change value of password to new specified value
  public void setPassword(String newPass) {
    password = newPass;
  }

  //method: deposit money into account
  public boolean deposit(double amount) {
    if (amount < 0) return false;
    else {
      balance += amount;
      return true;
    }
  }

  //method: withdraw money from account
  public boolean withdraw(double amount) {
    if (amount > balance || amount < 0) return false;
    else {
      balance -= amount;
      return true;
    }
  }

  //method: shows accountID and balance in format: "ID\tBALANCE"
  public String toString() {
    return "#" + accountID + "\t" + "$" + balance;
  }

  private boolean authenticate(String password) {
    return this.password.equals(password);
  }

  // public boolean transferTo(Bank)
}
