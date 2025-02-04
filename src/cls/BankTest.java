package cls;

public class BankTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("1234567","홍길동","1234");
        BankAccount ba2 = new BankAccount("7654321","아이유","5678");

        ba1.deposit(1000);
        ba1.outputBalance();

        ba2.deposit(5000);
        ba2.withdraw(10000,"5678");
        ba2.outputBalance();

        BankAccount ba3 = new BankAccount("xxxxxxx","강호동","8888");



    }
}
