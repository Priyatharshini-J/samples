
import java.util.*;
import java.lang.*;
import java.io.*;


class Balance
{
	double current_bal;
	void balance(double amount){
		this.current_bal = amount;
	}
	double getbalance(){
		return this.current_bal;
	}
	void printbalance(){
		System.out.println("Your current balance is : " + current_bal);
	}
}

class Cashwithdrawl
{
	double current_bal;
	double amount;
	double final_bal;
	Balance bal;
	void cashwithdrawl(Balance bal, double amount){
		this.bal = bal;
		this.amount = amount;
		current_bal = bal.getbalance();
		final_bal = current_bal - amount;
		if(final_bal < 0)
		{
			System.out.println("You dont have enough balance to withdraw the cash");
		}
		else
		{
			System.out.println("Amount of " + amount + " is successfully withdrawn");
			bal.balance(final_bal);
			bal.printbalance();
		}
	}
}

class Cashdeposit
{
	double current_bal;
	double amount;
	double final_bal;
	Balance bal;
	void cashdeposit(Balance bal, double amount){
		this.bal = bal;
		this.amount = amount;
		current_bal = bal.getbalance();
		final_bal = current_bal + amount;
		bal.balance(final_bal);
		System.out.println("Amount of " + amount + " is successfully deposited");
		bal.printbalance();
	}
}


class Checkoperation
{
	String operation;
	Scanner scan = new Scanner (System.in);
	Balance bal;
	Cashwithdrawl cashwth = new Cashwithdrawl();
	Cashdeposit cashdep = new Cashdeposit();
	void checkoperation(String operation, Balance bal){
	this.operation = operation;
	this.bal = bal;
	System.out.println("Operation is : " + operation);
	if(operation.equals("Cash_withdrawal")){
		System.out.println("How much money needed to be withdrawn?");
		double amount = scan.nextDouble();
		cashwth.cashwithdrawl(bal,amount);
	}
	else if(operation.equals("Cash_deposit")){
		System.out.println("How much money needed to be deposited?");
		double amount = scan.nextDouble();
		cashdep.cashdeposit(bal,amount);
	}
	else if(operation.equals("Check_balance"))
	{
		bal.printbalance();
	}
}
}

public class ATM
{
	public static void main(String[] args){
	System.out.println("Welcome to ATM.");
	System.out.println("Please enter the operation you need to perform : Cash_withdrawal / Check_balance / Cash_deposit");
	double def_amount = 100000;
	Scanner scan = new Scanner (System.in);
	String op = scan.nextLine();
	Checkoperation checkop = new Checkoperation();
	Balance bal = new Balance();
	bal.balance(def_amount);
	checkop.checkoperation(op,bal);
	}
}