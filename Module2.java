import java.util.ArrayList;

public class Module2 {

	private double amount;
	private ArrayList<Double> transactions;
	
	public Module2() {
		this.amount = 0.0;
		this.transactions = new ArrayList<>();	
	}
	
	public void dep(double amt) {
		
		if(amt > 0) {
			amount += amt;
			transactions.add(amt);
		}else {
			System.out.println("Deposit amount invalid. ");
		}
	}
	public void wit(double amt) {
			
			if(amt < 0) {
				amount += amt;
				transactions.add(amt);
			}else {
				System.out.println("Withdrawal amount invalid. ");
			}
	}
	public void listInteractions() {
		System.out.println("Transactions:");
		
		for (int i = 0; i < transactions.size(); i++) {
		    System.out.println(transactions.get(i));
		}
		System.out.println("Total Amount: " + amount);
	}
	
	public static void main(String[] args) {
		Module2 myBank = new Module2();
		myBank.dep(600.31);
		myBank.wit(-563.36);
		myBank.dep(245.87);
		myBank.wit(-253.45);
		myBank.dep(752.91);
		myBank.listInteractions();
	}
	
}
