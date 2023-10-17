package io.github.zemise.patterns.behavioral.template;

public class ClientAccount {
    public static void main(String[] args) {
        Account account = new DemandAccount();
        System.out.println("活期利息：" + account.calculateInterest());
        account = new FixedAccount();
        System.out.println("定期利息：" + account.calculateInterest());
    }
}
