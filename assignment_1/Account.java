public class Account {
    private double balance;

    public Account(){
        this.balance = 0.0;
    }

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void printInfo(){
        System.out.println("Balance: " + this.balance);
    }

    public String toString(){
        return String.valueOf(this.balance);
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }
}
