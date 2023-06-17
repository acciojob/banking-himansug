package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
this.setMinBalance(5000.0);
this.setName(name);
if(balance<5000){
    throw new Exception("Insufficient Balance");
}
this.setBalance(balance);
this.tradeLicenseId=tradeLicenseId;
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
int n=tradeLicenseId.length();
for(int i=0;i<n;i++){
    char a=tradeLicenseId.charAt(i);
    char b=tradeLicenseId.charAt(i+1);
    if(a==b){
        throw new Exception("Valid License can not be generated");
    }
}
    }

}
