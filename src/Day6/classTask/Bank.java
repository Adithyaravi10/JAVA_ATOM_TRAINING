package Day6.classTask;

public class Bank {
    String accName;
    double balance;
    int accId;
    static String bankName;
    //withdraw
    public void withdraw(double amt) throws LowBalanceException {
        if(amt<=0){
            throw new IllegalArgumentException();
        }
        else if (balance<=0) {
            throw new LowBalanceException();
        }
        else
            balance = balance-amt;
        System.out.println("amount withdrawn : " +amt );
    }
    //deposit
    public void deposit (double amt) throws InvalidAmountException, MaxAmountException {
        if(amt<=0){
            throw new InvalidAmountException();
        }
        else if (amt > 10000) {
            throw new MaxAmountException();
        }
        else
            balance = balance+amt;
        System.out.println("amount deposited : " +amt );
    }





}
class BankDemo{
    public static void main(String[] args) {
        Bank b1= new Bank();
        try {
            b1.deposit(-100000);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(" BALANCE IS LOW");
        }
        System.out.println(b1.balance);
    }

}