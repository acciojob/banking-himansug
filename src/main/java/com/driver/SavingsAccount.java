package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        this.setMinBalance(0.0);
this.setName(name);
this.setBalance(balance);
this.maxWithdrawalLimit=maxWithdrawalLimit;
this.rate=rate;
    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
if(amount>maxWithdrawalLimit){
    throw new Exception("Maximum Withdraw Limit Exceed");
}
if(amount> this.getBalance()){
    throw new Exception("Insufficient Balance");
}
this.setBalance(getBalance()-amount);
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double p=this.getBalance();
        double r=this.getRate();
        int t=years;
        double SI = (p * t * r) / 100;
       return p+SI;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double principal = this.getBalance(), rate = this.getRate(), time = years;

        /* Calculate compound interest */
        double A = principal *
                (Math.pow((1 + rate / 100), time));
        return A;


    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(double maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }
}
