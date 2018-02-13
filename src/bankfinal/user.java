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

import java.util.ArrayList;

public class user extends Thread {

    private String name;                                                                                                    //Class attributes
    private String surname;
    private BankAccount bankAccount;
    private ArrayList<Double> transactionlist;
    private double[] tl1;

    public user(String n, String s, BankAccount bA, double[] tl) //Constructor for class User
    {
        this.name = n;
        this.surname = s;
        this.bankAccount = bA;
        this.tl1 = tl;
    }

 @Override
    public void run() 
    {
        for (int i = 0; i < tl1.length; i++) {
            if (tl1[i] < 0) {
                bankAccount.withdraw(tl1[i], this.name + " " + this.surname);
            } else {
                bankAccount.deposit(tl1[i], this.name + " " + this.surname);
            }
        }
    }
}
