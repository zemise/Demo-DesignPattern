package io.github.zemise.patterns.behavioral.template;

public abstract class Account {
    private String accountNumber;

    public Account() {
        accountNumber = null;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 基本方法，确定账户类型，留给子类实现
    protected abstract String getAccountType();

    // 基本方法，确定利息，留给子类实现
    protected abstract double getInterestRate();

    // 基本方法，根据账户类型和账号确定账户金额
    public double calculateAmount(String accountType, String accountNumber) {
        // 访问数据库... （此处仅仅示意性的返回一个数值）
        return 4567.00D;
    }

    // 模版方法，计算账户利息
    public double calculateInterest() {
        String accountType = getAccountType();
        double interestRate = getInterestRate();
        double amount = calculateAmount(accountType, accountNumber);

        return amount * interestRate;
    }
}
