package com.epam.rudenkov;

public class TransferAction {
	private double transactionAmount;
	public TransferAction(double amount){
		if(amount > 0){
			this.transactionAmount = amount;
		} else {
			throw new IllegalArgumentException();
		}
	}
	public boolean tranferIntoAccount(Account from, Account to){
		double demand = from.getAmount() - transactionAmount;
		if(demand >= 0){
			from.setAsset(demand);
			to.addAsset(transactionAmount);
			return true;
		}else{
			return false;
		}
	}

	public double getTransactionAmount(){
		return transactionAmount;
	}

}
