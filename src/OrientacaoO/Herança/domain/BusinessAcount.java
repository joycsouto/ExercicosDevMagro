package OrientacaoO.Herança.domain;

public class BusinessAcount extends Account {
    private Double loadLimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Integer number, String holder, Double balance, Double loadLimit) {
        super(number, holder, balance);
        this.loadLimit = loadLimit;
    }

    @Override
    public String toString() {

        return
                "Account{" +
                        "number=" + getNumber() +
                        ", holder='" + getHolder() + '\'' +
                        ", balance=" + getBalance() +
                        '}' + "loadLimit=" + loadLimit +
                        '}';
    }

    public Double getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(Double loadLimit) {
        this.loadLimit = loadLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
        System.out.println(balance);

    }

    public void withdraw(Double amount) {
       balance -= amount;
        System.out.println(balance);
    }

    public void loan(Double amount) {
        if (amount <= loadLimit) {
            balance += amount + 10;
        }
        System.out.println(balance);
    }

}
