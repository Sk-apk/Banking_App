
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sktsh
 */
class BankAccount extends NewMain {
    
    String customerName;
    int balance ;
    int previousTransaction;   
    int customerId =0;
    char opt;

    
    
 
    //Method for the meunu 
   public void showMenu(Scanner sc, char opt, int customerId, String customerName, int balance) {
        System.out.println("Welcome: " + customerName);
        System.out.println("Your Id is: " + customerId);
        System.out.println("\n");
        
        
         System.out.println("Please choose from the options below");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {

            System.out.println("******************************");
            System.out.println("Enter an option");
            System.out.println("*******************************");
            opt = sc.next().charAt(opt);
            System.out.println("\n");

            

            switch (opt) {

                case 'a':
                    System.out.println("***********************************");
                    System.out.println("Balance =" + balance);
                    System.out.println("\n");
                    break;

                case 'b':
                    System.out.println("******************************");
                    System.out.println("Enter the amount you want to deposit");
                    System.out.println("********************************");
                    int amount = sc.nextInt();
                   deposit(amount, balance, previousTransaction);
                    System.out.println("\n");
                    break;

                case 'c':
                    System.out.println("***************************");
                    System.out.println("Enter amount to withdraw");
                    System.out.println("***************************");
                    int amount2 = sc.nextInt();
                    withdraw(amount2, balance, previousTransaction);
                    System.out.println("\n");
                    break;

                case 'd':
                    System.out.println("***********************");
                    getpreviousTransaction(previousTransaction);
                    System.out.println("************************");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("Sorry invalid input!, enter again");
                    break;

            }

        }
        while (opt != 'e'); {
                System.out.println("Thank you for your services");
            }
        
    }

    
    
    
    //This method deposits cash
    public  void deposit(int amount, int balance, int previousTransaction) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println(amount +" has been deposited into your account");
        }
    }
    
    
    
    
    // This method withdraws cash
    public void withdraw(int amount2, int balance, int previousTransaction) {
        if (amount2 != 0) {
            balance = balance - amount2;
            previousTransaction = amount2;
        }

    }
    
    
    //This method dispalys the cash that is Deposited and Withdrawn
    public  void getpreviousTransaction(int previousTransaction) {
        if (previousTransaction > 0) {
            System.out.println("Deposited" + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn" + previousTransaction);
        } else {
            System.out.println("No transaction occured");
        }

    }
    
    
    
}
