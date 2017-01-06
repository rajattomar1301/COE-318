package coe318.lab4;

/**
 * Created by satchel on 2016-10-15.
 */
public class Account {

    private String name;
    private int number;
    private double balance;

    //constructor
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        balance = initialBalance;

    }

    // method to get account name
    public String getName() {
        return this.name;
    }

    // method to get account number
    public int getNumber() {
        return this.number;
    }

    // method to get account balance
    public double getBalance() {
        return this.balance;
    }

    // deposit function that will also return a bool for success
    public boolean deposit(double amount){
        if(amount <=0) {
            return false;
        }else {
            this.balance += amount;
            return true;
        }
    }// end deposit

    // withdraw function that will also return a bool for success
    public boolean withdraw(double amount){
        if((this.balance - amount) >= 0 && amount > 0){
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }// end withdraw


    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
} // end class
