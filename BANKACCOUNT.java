public class BANKACCOUNT {
    private String owner;
    public void setOwner(String owner) {
        this.owner = owner;}
    public String getOwner() {
        return owner;}

    private int balance;
    public void setBalance(int balance) {
        this.balance = balance;}
    public int getBalance(){
        return balance;}

    public double setDeposit(int amount) {
        if(amount > 0) {
            balance += amount;}
        return balance;}

    public double setWithdraw(int amount) {
        if(amount < balance) {
            balance -= amount;}
        return balance;}

    public String toString() {
        return "bank account{owner = " + getOwner() + ", balance = " + getBalance() + "}";
    }}


