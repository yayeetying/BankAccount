public class BankAccount {
  //instance variables
  private double balance;
  private int accountID;
  private String password;

  //constructor
  public BankAccount(int ID, String pass) {
    //initialize
    balance = 0;
    accountID = ID;
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

  //method: change value of password to new specified value
  // public void setPassword(String newPass) {
  //
  // }
}
