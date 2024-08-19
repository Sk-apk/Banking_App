/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author sktsh
 */
public class NewMain  {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();

        System.out.println("Please enter your name and customer id ");
        ba.customerName = sc.next();
        ba.customerId = sc.nextInt();

         ba.showMenu(sc, ba.opt, ba.customerId,ba.customerName, ba.balance);

}
    
 
    }