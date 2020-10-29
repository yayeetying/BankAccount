public class BankAccountTester {

  public static void main(String[] args) {
    //initialize object Yaoming of class BankAccount
    BankAccount Yaoming = new BankAccount(0, "blobfis@h");
    BankAccount Hoshi = new BankAccount(2348123, "Seventeen");
    BankAccount Pewpew = new BankAccount(1245, " ");

    System.out.println(Yaoming.getBalance());
    System.out.println(Hoshi.getAccountID());
    // System.out.println(Yaoming.getPassword());
    Yaoming.setPassword("donkey");
    // System.out.println(Yaoming.getPassword());
    System.out.println(Yaoming.deposit(53.43));
    System.out.println(Yaoming.getBalance());
    if ( Yaoming.deposit(-100) ) System.out.println("Deposit successful!");
    else {System.out.println("Deposit failed!");}
    System.out.println();

    // System.out.println(Pewpew.getPassword());
    System.out.println(Pewpew.getBalance());
    System.out.println(Pewpew.deposit(2147823.23));
    System.out.println(Pewpew.withdraw(9999999));
    System.out.println(Pewpew.withdraw(-1231784.23));
    System.out.println(Pewpew.withdraw(0.23));
    System.out.println(Pewpew.getBalance());
    System.out.println();

    System.out.println(Hoshi.toString());
    System.out.println(Yaoming.toString());
    System.out.println(Pewpew.toString());
    System.out.println();

    BankAccount Sophia = new BankAccount(123456, "meowmeow");
    BankAccount Funky = new BankAccount(7890, "woofwoof");
    Sophia.deposit(7500);
    System.out.println(Sophia.getBalance());
    System.out.println(Funky.getBalance());
    System.out.println(Sophia.transferTo(Funky, 500, "meowmeow")); //should be true
    System.out.println(Funky.transferTo(Sophia, 1000, "woofwoof")); //should be false
    System.out.println(Funky.transferTo(Sophia, 300, "hehehe")); //should be false
    System.out.println(Sophia.getBalance()); //should be 7000.0
    System.out.println(Funky.getBalance()); //should be 500.0

  }

}
