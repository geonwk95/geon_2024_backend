package day21.Step2;

public class Account {
    private long balance;

    public Account(){}

    public long getBalance(){
        return balance;
    }

    public void deposit( int money ){
        balance += money;
    }

    public void withdraw( int money ) throws InsufficientException{
        if ( balance < money ){ // 만약에 예금액 보다 출금액이 더 크면

            // 우리가 만든 예외 클래스로 예외발생 시키기
                // throw new 정의예외클래스("메세지")
            throw new InsufficientException("\n"+"잔고부족 : " + (money - balance) + " 모자람");
                // 1. try{} catch(){}
                // 2. throws
        }
        balance -= money;
    }

}
