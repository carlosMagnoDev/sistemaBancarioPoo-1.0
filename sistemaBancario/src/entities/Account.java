package entities;

public class Account {
	private int number; // atributos
	private String holder; // atributos
	private double balance; // atributos
	
	// Construtores ----------------------------------------------------------------
	
	/*
	public Account () { // contrutor padrão
		
	}
	*/
	
	public Account (int number, String holder) { // sobrecarga
		this.number = number;
		this.holder = holder;
		balance = 0;
		// para ocaso em que o cliente não vá fazer um deposito ao criar a senha
	}
	
	public Account (int number, String holder, double initialDeposit) { // construtor completo
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	// -------------------------------------------------------------------------------
	
	// ENCAPSULAMENTO - getts AND setss --------------------------------------------
	public String getHolder () {
		return holder;
	}
	
	public int getNumber () {
		return number;
	}
	
	public void setNumber (int number) {
		this.number = number;
	}
	
	public double getBalance () {
		return balance;
	}
	
	// -------------------------------------------------------------------------------
	
	// metódos -----------------------------------------------------------------------
	
	public void deposit (double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw (double withdraw) {
		this.balance = (this.balance - withdraw) - 5.0;
	}
	
	public String toString () {
		return "Account " + number + " Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
	// -------------------------------------------------------------------------------
}