package Check_Classes_and_Objects;


import java.util.ArrayList;
import java.util.List;

public class BankClient {

    private List<Account> accounts;

    public BankClient() {
        accounts = new ArrayList<>();
    }


    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public boolean add(Account account) {
        return accounts.add(account);
    }

//    public List<Account> add(Account account) {
//        List<Account> accounts = new ArrayList<>();
//        accounts.add(account);
//        return accounts;
//    }


    @Override
    public String toString() {
        return "BankClient{" +
                "accounts=" + accounts +
                '}';
    }
}
