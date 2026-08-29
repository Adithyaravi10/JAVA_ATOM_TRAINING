package Day6.classTask;

public class LowBalanceException extends Exception{

    LowBalanceException() {
        System.out.println("Cannot withdraw while balance is zero!!");
    }
}
class MaxAmountException extends Exception {
    MaxAmountException() {

        System.out.println("Amount should not exceed 10000");

    }
}