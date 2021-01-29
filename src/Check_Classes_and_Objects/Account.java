package Check_Classes_and_Objects;
/*
Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы
отдельно.

 */


import java.util.Objects;

public class Account {


    private String currency;
    private long countNumber;
    private int balance;
    private boolean blockedAccount;

    public Account() {

    }

    public Account(String currency, long countNumber, int balance, boolean blockedAccount) {
        this.currency = currency;
        this.countNumber = countNumber;
        this.balance = balance;
        this.blockedAccount = blockedAccount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(long countNumber) {
        this.countNumber = countNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlockedAccount() {
        return blockedAccount;
    }

    public void setBlockedAccount(boolean blockedAccount) {
        this.blockedAccount = blockedAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return countNumber == account.countNumber &&
                balance == account.balance &&
                blockedAccount == account.blockedAccount &&
                currency.equals(account.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, countNumber, balance, blockedAccount);
    }

    @Override
    public String toString() {
        return "Account:" +
                "currency='" + currency + '\'' +
                ", \ncountNumber=" + countNumber +
                ", \nbalance=" + balance +
                ", \nblockedAccount=" + blockedAccount +
                '.';
    }
}
