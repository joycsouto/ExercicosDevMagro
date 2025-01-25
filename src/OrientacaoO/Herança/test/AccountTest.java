package OrientacaoO.Herança.test;

import OrientacaoO.Herança.domain.Account;
import OrientacaoO.Herança.domain.BusinessAcount;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(555, "Lari",5000D);
        BusinessAcount businessAcount = new BusinessAcount(363,"joyce", 5000.0 ,500D);

        System.out.println(account);
        account.deposit(100.0);
        account.withdraw(50D);

        System.out.println(businessAcount);
        businessAcount.deposit(100D);
        businessAcount.loan(200d);
        businessAcount.withdraw(20d);



    }
}
