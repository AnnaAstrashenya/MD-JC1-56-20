package Check_Classes_and_Objects;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("BYN",
                1111222233,
                -110,
                false);
        Account account2 = new Account("BYN",
                222233334,
                1200,
                false);
        Account account3 = new Account("BYN",
                333344445,
                2600,
                false);
        Account account4 = new Account("BYN",
                555566667,
                1987,
                false);
        Account account5 = new Account("BYN",
                444455556,
                -198,
                true);

        BankClient client = new BankClient();
        AccountActions actions = new AccountActions();

        client.add(account1);
        client.add(account2);
        client.add(account3);
        client.add(account4);
        client.add(account5);

        List<Account> accounts;
        Account findAccount;

        findAccount = actions.searchAccount(client.getAccounts(), 555566667);
        actions.printInfoAboutAccount("Искомый счет: ", findAccount);

        accounts = actions.sortByBalance(client.getAccounts());

        actions.print("Отсортированные счета от max к min", accounts);

        int amountMinus;
        int amountPlus;

        amountMinus = actions.sumMinusBalances(client.getAccounts());
        System.out.println("Сумма по активным счетам, имеющим отрицательный баланс = " + amountMinus);

        amountPlus = actions.sumPlusBalances(client.getAccounts());
        System.out.println("Сумма по активным счетам, имеющим положительный баланс = " + amountPlus);


    }

}
