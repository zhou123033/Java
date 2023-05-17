package com.study.作业.Homework08;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) { //存款
        super.deposit(amount - 1); //巧妙的使用了父类的 deposit
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1); //一块钱转入银行的账号
    }
}
