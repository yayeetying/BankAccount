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

  //method: shows accountID and balance in format: "#ID\t$BALANCE"
  public String toString() {
    return "#" + accountID + "\t" + "$" + balance;
  }

  //PRIVATE method will allow internal methods to check password easily
  private boolean authenticate(String password) {
    return this.password.equals(password);
  }

  //when password matches & withdrawal succeeds, transfer money from
  //this BankAccount to other BankAccount
  public boolean transferTo(BankAccount other, double amount, String password) {
    //short circuiting! if authenticate returns false, java won't look
    //at the boolean statements afterwards (so no need to nest so many ifs)
    if ( authenticate(password) && withdraw(amount) ) {
      //other.deposit(amount); return true;
      //also works, but here, we're accounting for if below error happens
      if ( other.deposit(amount) ) {
        return true;
      }
      //keep in mind that this else (you failed to deposit said amount)
      //should NEVER happen; if you can withdraw the amount, but not
      //deposit it, where did the money go?
      else {
        System.out.println("YUH-OH! RED LIGHT! EMERGENCY MEETING!");
        System.out.println(amount + "withdrawn from Account #"
                          + getAccountID() +
                          "; Failed to deposit to Account #"
                          + other.getAccountID());
      }
    }
    return false;
  }

}
