package Entities;

public class Account {

	 private Integer number;
	 private String holder;
	 private double balance;
	 
	 public Account(Integer number, String holder) {
			this.number = number;
			this.holder = holder;
		 }	

	 public Account(Integer number, String holder, Double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	 }
	 
	 public Integer getNumber() {
		 return number;
	 }
	 
	 public String getHolder() {
		 return holder;
	 }
	 public void setHolder(String holder) {
		 this.holder = holder;
	 }
	 public Double getBalance() {
		 return balance;
	 }	
	 
	 public void deposit(double amount) {
		 this.balance += amount;
	 }	
	 
	 public void withdraw(double amount) {
		 this.balance -= amount + 5.00;
	 }

	 @Override
	 public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	 }	
	 
	 
	 
}
