
package com.mycompany.task2_4;


public class Account {
    private String id;
    private String name;
    private int balance=0;
    
    public String getId(){
    return id;
    }
    public String getName(){
    return name;
    }
    public int getBalance(){
    return balance;
    }
    public int credit(int amount){
    
    balance+=amount;
    return balance;
    }
    public int debit(int amount){
    if (amount<=balance)
            System.out.println(balance-amount);
    else
    { System.out.println("Amount exceeded balance");}
    return balance;        
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
   
    
}
