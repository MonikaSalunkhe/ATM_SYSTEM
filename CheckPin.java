/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_task;

/**
 *
 * @author DELL
 */
public class CheckPin {
    int Pin=1234;
    int balance = 10000;
    
    
    public CheckPin()
    {
        this.Pin=Pin;
        this.balance= balance;
    }
    
    public boolean withdraw(double ammount)
    {
        if(this.balance-ammount>=0)
        {
            this.balance-=ammount;
            return true;
            
        }
        return false;
    }
    
    public void deposit( double ammount)
    {
        this.balance+=ammount;
        
    }
    
    public int getPin()
    {
        return Pin;
    }
    public double getBalance()
    {
        return balance;
    }
    
    public String toString()
    {
        return Pin+";"+balance;
    }
}


