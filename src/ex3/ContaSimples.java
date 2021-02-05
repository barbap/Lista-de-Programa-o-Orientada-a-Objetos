package ex3;

public class ContaSimples {
	private double saldo;
	
	public ContaSimples() {
		
	}
	public ContaSimples(double saldo) {
		deposito(saldo);
	}
	public double getSaldo () {
		return saldo;
	}
 	public boolean deposito (double valor) {
		saldo += valor;
		System.out.println(saldo);
		return true;
	}
	public boolean saque (double valor) {
		if (valor>saldo) {
			System.out.println("N�o h� saldo dispon�vel na conta para realizar essa opera��o");
			return false;
		} else {
			saldo -= valor;
			System.out.println(saldo);
			return true;
		}
	}
 }
