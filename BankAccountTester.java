public class BankAccountTester {

  public static void main(String[] args) {
    //initialize object b1 of class BankAccount
    BankAccount b1 = new BankAccount(57, "blobfish");
    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());
    System.out.println(b1.getPassword());
    b1.setPassword("donkey");
    System.out.println(b1.getPassword());
  }

}
