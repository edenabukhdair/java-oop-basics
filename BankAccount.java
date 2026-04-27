public class BankAccount {
    public String owner;
   public double balance;
   public double deposit( double amount) {
       if(amount > 0) {
       balance += amount;}
       return balance;
   }
   public double withdraw(double amount) {
       if(amount < balance) {
           balance -= amount;
       }
       return balance;
   }
      public String toString() {
          return "bank account{owner = " + owner + ", balance = " + balance + "}";
   }}
