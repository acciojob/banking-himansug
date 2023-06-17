package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
this.name=name;
this.balance=balance;
this.minBalance=minBalance;
    }

    public BankAccount() {
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        int sumOfDigit = 0;


        while (digits > 0)
        {

            // Stores the last digit if N
            int rem;
            rem = digits % 10;

            // Increment the value of
            // sumOfDigits
            sumOfDigit += rem;

            // Update the prodOfDigit


            // Divide N by 10
            digits /= 10;
        }
        String s=Integer.toString(digits);
        if(sumOfDigit==sum){
            return s;
        }
        else{
            throw new Exception("Account Number can not be generated");
        }

    }

    public void deposit(double amount) {
        //add amount to balance
balance=balance+amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
if(balance-amount<minBalance){
    throw new Exception("Insufficient Balance");
}
else{balance=balance-amount;
}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}