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
import java.util.Scanner;

public class Application {

    String name;
    String surname;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<user> list1 = new ArrayList< user>();
        BankAccount ba = null;
        double bankbal = 1980;
        long accountnum = 9876543210l;
        user saul = null;
        user walter = null;
        user pinkman = null;
        user hank = null;

        while (true) {
            System.out.println("Select one of the following options: \n 1.Create Bank Account\n 2.Create User \n 3.Run Simulation\n 4.Exit ");  //Menu
            int choice = input.nextInt();
            if (choice == 1) {
                ba= new BankAccount(accountnum, bankbal);
                System.out.println("Bank Account: " + accountnum + " with a balance: " + bankbal + " was sucessfully created");
            }

            if (choice == 2) {
                if (ba == null) {
                } else {
                    double[] saulList;
                    saulList = new double[]{50.0, 10.0, -20.0, 10.0, -20.0, 20.0, 10.0, 50.0, -10.0, 10.0, -10.0, 50.0};
                    double[] walterList;
                    walterList = new double[]{20.0, 20.0, -20.0, 50.0, -20.0, 10.0, 50.0, 50.0, -20.0, 10.0, 10.0};
                    double[] pinkList;
                    pinkList = new double[]{50.0, 10.0, 10.0, -10.0, -10.0, 50.0, 20.0, -10.0, -20.0};
                    double[] hankList;
                    hankList = new double[]{50.0, 10.0, -20.0, 20.0, 10.0, -20.0};

                    saul = new user("Saul", "goodman", ba, saulList);
                    walter = new user("Walter", "White", ba, walterList);
                    pinkman = new user("Jessie", "Pinkman", ba, pinkList);
                    hank = new user("Hank", "Schradar", ba, hankList);

                    list1.add(saul);
                    list1.add(walter);
                    list1.add(pinkman);
                    list1.add(hank);

                    System.out.println("Default users created \n 1. Saul Goodman \n 2. Walter White \n 3. Jessie Pinkman \n 4. Hank Schrader ");
                }
            }

            if (choice == 3) 
            {

                if (list1.isEmpty()) {
                    System.out.println("Create users first to go ahead with the simulation");
                } else {
                    if (ba == null) {
                        System.out.println("Please create a bank account with an account balance and account number to continue");
                    } else {

                        for (int i = 0; i < 4; i++) {
                            list1.get(i).start();   //starting all threads
                        }
                    System.out.println("Enter 4 to exit");
                    }
                }
            }

            if (choice == 4) {
                System.exit(0);                                                                                             //exiting the program
            }
        }
    }
}
