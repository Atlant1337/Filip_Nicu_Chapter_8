package com.company;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance(4 per) = %f\n",saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance(4 per) = %f\n",saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance(5 per) = %f\n",saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance(5 per) = %f\n",saver2.getSavingsBalance());

    }
}