public class BankAccountTester {

  public static void main(String[] args) {
    //initialize object Yaoming of class BankAccount
    BankAccount Yaoming = new BankAccount(0, "blobfis@h");
    BankAccount Hoshi = new BankAccount(2348123, "Seventeen");
    BankAccount Pewpew = new BankAccount(1245, " ");

    System.out.println(Yaoming.getBalance());
    System.out.println(Yaoming.getAccountID());
    System.out.println(Yaoming.getPassword());
    Yaoming.setPassword("donkey");
    System.out.println(Yaoming.getPassword());
    Yaoming.deposit(53.43);
    System.out.println(Yaoming.getBalance());
    if ( Yaoming.deposit(-100) ) System.out.println("Deposit successful!");
    else {System.out.println("Deposit failed!");}

    System.out.println(Pewpew.getPassword());
    System.out.println(Pewpew.getBalance());
  }

}
