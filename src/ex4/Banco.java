/*
 * 
 * . Nessa classe Banco, coloque os métodos abrirConta() e
encerrarConta(), que respectivamente adicionam e remover instancias de Conta à lista de contas do banco. O método
abrirConta() deve poder ser chamado informando um deposito inicial ou ainda nenhum parâmetro. Coloque também os
métodos saque(int numeroDaConta, double valor), depósito(int numeroDaConta, double valor) e transferência(int
numeroContaOrigem, int numeroContaDestino, double valor) que deverão ser chamados informando o número da conta
e o valor da operação.
 */

package ex4;

import java.util.ArrayList;


public class Banco  {
	static ArrayList<Conta> contas = new ArrayList<Conta>();
	public static void main (String[] args) {
		Conta c1 = new Conta(1);
		abrirConta(c1);
		Conta c2 = new Conta(2);
		abrirConta(c2);
		Conta c3 = new Conta(3);
		abrirConta(c3);
		encerrarConta(1);
		saque(2,200);
		deposito(2,300);
		transferencia (2,3,100);
		
	}
	
	public static void abrirConta(Conta c) {
	      contas.add(c);
		
	}
	
	public static void encerrarConta (int i) {
	    contas.remove(i);
		
	}
	
	public static void saque(int n, double saque) {
		for(Conta c:contas) {
			if(c.getNumero()==n) {
				if (c.getSaldo()>saque) {
					c.setSaldo(c.getSaldo()-saque);
					System.out.println(c.getSaldo());
				}
			}
		}
			
	}
	public static void deposito(int n, double deposito) {
		for (Conta c: contas) {
			if (c.getNumero()==n) {
				c.setSaldo(c.getSaldo()+deposito);
				System.out.println(c.getSaldo());
			}
		}
	}
	public static void transferencia(int numeroContaOrigem, int numeroContaDestino, double valor) {
		for (Conta co: contas) {
			if (co.getNumero()==numeroContaOrigem) {
				saque(co.getNumero(),valor);
			} 
		}
		for (Conta cd: contas) {
			if (cd.getNumero()==numeroContaDestino) {
				deposito(cd.getNumero(),valor);
			}
		}
		
	}
	
}

	
 