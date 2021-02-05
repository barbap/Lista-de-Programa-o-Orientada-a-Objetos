package ex4;

public class Conta {
	private int numero;
	private double saldo;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(int numero) {
		this.numero = numero;
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return  numero + " - " + saldo;
	}
	
	
	
}
