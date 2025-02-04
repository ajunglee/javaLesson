package cls;

public class BankAccount {
    // Attribute
    // 계좌번호
    private String accountNumber;

    // 예금주
    private String name;

    // 비밀번호
    private String password;

    // 잔액
    private long balance;

    // 생성자
    public BankAccount(String accountNumber, String name, String password){
        // 이름이 다른 경우 ->
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
    }

    // Method
    // 입금
    public long deposit(long money){
        balance += money;
        return balance;
    }

    // 출금
    public long withdraw(long money,String password) {
        if (balance < money)
            return 0;

            // 멤버 변수 password //Referenced Data Type은 관계연산자를 쓸 수 없어서 equals를 사용한다.
            // 문자열 비교
        //
        if (!this.password.equals(password)) // 멤버 password와 매개변수 password와 같지 않으면
            return 0;

        balance -= money;
        return balance;
    }

    // 송금
    // public send

    // 잔액확인
    public void outputBalance(){
        System.out.printf("%s님의 통장(%s)\n잔액 : %d\n", name, accountNumber, balance);
    }


}
