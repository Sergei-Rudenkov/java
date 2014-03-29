package com.epam.rudenkov;

public class Runner {
	public static void main(String[] args){
		Account from = new Account(784354536L, 258.5);
		Account to = new Account(242355656L, 12.1);
		TransferAction action = new TransferAction(520.0);
		boolean complete = action.tranferIntoAccount(from, to);
		if(complete){
			System.out.println("Sum"+ action.getTransactionAmount() + " completed successful");
			System.out.println(" On the account of the client's ID=" + to.getId());
			System.out.println("sum is:" + to.getAmount());
		}
		else{
			System.out.println("Transaction is not completed.");
			System.out.print("On the account of the client's ID=" + to.getId());
			System.out.print(" not enough means ");
			
		}
	}
}
