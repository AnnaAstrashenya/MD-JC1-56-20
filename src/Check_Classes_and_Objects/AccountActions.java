package Check_Classes_and_Objects;
/*
Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы
отдельно.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountActions {// классы не именуем множественным числом

    public Account searchAccount(List<Account> clientAccounts, long countNumber) {
        Account result = new Account();
        for (Account currentAccount : clientAccounts) {
            if (currentAccount.getCountNumber() == countNumber) {
                result = currentAccount;
            }
        }
        return result;
    }


    public List<Account> sortByBalance(List<Account> clientAccounts) {
        List<Account> result = new ArrayList<>();
        result.addAll(clientAccounts);

        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                Account a1 = result.get(j);
                Account a2 = result.get(j + 1);
                if (a2.getBalance() > a1.getBalance()) {
                    Collections.swap(result, j, j + 1);
                }

            }
        }

        return result;
    }


    public int sumPlusBalances(List<Account> clientAccounts) {
        int sum = 0;
        for (Account currentAccount : clientAccounts) {
            if ((currentAccount.getBalance() > 0) && !(currentAccount.isBlockedAccount() == true)) {
                sum = sum + currentAccount.getBalance();
            }
        }
        return sum;
    }

    public int sumMinusBalances(List<Account> clientAccounts) {
        int sum = 0;
        for (Account currentAccount : clientAccounts) {
            if ((currentAccount.getBalance() < 0) && !(currentAccount.isBlockedAccount() == true)) {
                sum = sum + currentAccount.getBalance();
            }
        }
        return sum;
    }



    public void printInfoAboutAccount(String message, Account account) {// действия по вводу-выводу лучше отделять, от действий логики. Т.е. перенести их в другой класс для начала.
        System.out.println(message);
        System.out.println("Счет: " + account.getCountNumber());
        System.out.println("Валюта счета: " + account.getCurrency());
        System.out.println("Баланс: " + account.getBalance());
        System.out.println(" ------------------------------ ");
    }

    public void print(String message, List<Account> accounts) {

        System.out.println(" ------- " + message + " ------- ");

        for(Account account : accounts) {
            System.out.println("Счет: " + account.getCountNumber());
            System.out.println("Валюта счета: " + account.getCurrency());
            System.out.println("Баланс: " + account.getBalance());
            System.out.println(" ------------------------------ ");
        }
        System.out.println();
    }


}
