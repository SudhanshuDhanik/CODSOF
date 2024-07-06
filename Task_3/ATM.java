package Task_3;

import java.util.Scanner;

class ATMCard{
    double balance;
    int pin=2024;
    public void PinCheck(){
        System.out.print("Enter the pin:");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input==pin)
          functions();
          else
          System.out.println("Invalid pin...");
          PinCheck();
          sc.close();
    }
    public void functions(){
        System.out.println("\nEnter 1 for Balance Check\nEnter 2 for Withdrawl\nEnter 3 for Deposit\nEnter 4 for exit ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            BalanceCheck();
            case 2:
            Withdrawl();
            case 3:
            Deposit();
            case 4:
            break;
            default:
            System.out.println("\nInvalid choice");
            break;
        }
        sc.close();
    }
    public void BalanceCheck(){
        System.out.println("\nYour Balance is "+balance);
        functions();
    }
    public void Withdrawl(){
        System.out.print("\nEnter the amount you want to withdrawl:");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        if(amount>balance || amount==0)
        System.out.println("\nInsufficient balance.");
        else{
        balance-=amount;
        System.out.println("\n"+amount+" rupees successfully withdrawl from your account");
    }
    functions();
    sc.close();
}
public void Deposit(){
    System.out.print("\nEnter the amount you want to deposit: ");
    Scanner sc=new Scanner(System.in);
    double amount=sc.nextDouble();
    if(amount<0)
    System.out.println("\nInvalid amount");
    else{
        balance+=amount;
        System.out.println("\n"+amount+" rupess successfully deposit in your account");
    }
    functions();
    sc.close();
}}
public class ATM {
    public static void main(String[] args) {
        ATMCard user=new ATMCard();
        user.PinCheck();
    }
}
