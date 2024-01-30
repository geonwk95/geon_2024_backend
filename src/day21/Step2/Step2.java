package day21.Step2;

public class Step2 {
    public static void main(String[] args) {
        Account account = new Account();

        // 예금 메소드 호출
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        // 출금 메소드 호출
        try {
            account.withdraw(30000);
        }catch ( InsufficientException e ){
            System.out.println("e = " + e);
        }



    }
}
