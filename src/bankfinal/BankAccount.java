/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfinal;

/**
 *
 * @author Haseeb
 */
   public class BankAccount
        {
         long accountNo;
         double accountBalance;
         
         public BankAccount(long accountNo, double accountBalance)
         {
         this.accountNo = accountNo;
         this.accountBalance = accountBalance;
         }
         public long getAccountNo()
         {
         return this.accountNo;
         }

         public double getAccountBalance()
         {
         return this.accountBalance;
                 }
         public synchronized void withdraw(double value, String name)
         {
           System.out.println("Amount: " + value*-1 + ", was withdrawn by user: " + name);
           accountBalance -= value;
         }
         public synchronized void deposit(double value, String name)
         {
           System.out.println("Amount: " + value + ", was deposited by user: " + name);
           accountBalance +=value;
         }
        
        
        }