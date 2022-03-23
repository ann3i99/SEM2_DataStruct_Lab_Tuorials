package Week1;

//TUTORIAL QUESTION 5

interface Account{                                      //Assume the existence of an interface, Account,

    public int deposit (int depositAmount);             //deposit method accepts an integer parameter and returns an integer
    public boolean withdraw (int withdrawAmount);       //withdraw method accepts an integer parameter and return a boolean

}

public class BankAccount implements Account {           //Define a class, BankAccount, that implements the above interface

    public int balance;                                 // instance variable named balance

    BankAccount(int balance){                           //constructor that accepts an integer that is used to initialize the instance variable
        this.balance=balance;
    }


    //implementation of the deposit method that adds its parameter to the balance
    //variable. The new balance is returned as the value of the method.
    @Override
    public int deposit(int depositAmount) {
        balance=balance+depositAmount;
        return balance;
    }


    //n implementation of the withdraw method that checks whether its parameter is less
    //than or equal to the balance and if so, decreases the balance by the value of the
    //parameter and returns true; otherwise, it leaves the balance unchanged and returns
    //false.
    @Override
    public boolean withdraw(int withdrawAmount) {
        if (withdrawAmount<=balance){
            balance=balance-withdrawAmount;
            return true;
        }
        else
            return false;
    }
}
