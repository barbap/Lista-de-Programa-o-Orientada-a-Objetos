package ex5;

import java.util.ArrayList;

public class Conta {
	private int numero;
	private double saldo;
	private ArrayList<String> operacoes = new ArrayList<String>();
	
	public Conta(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		//this.operacoes = operacoes;
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
	public ArrayList<String> getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(ArrayList<String> operacoes) {
		this.operacoes = operacoes;
	}
	public void inserirOperacao(String op) {
		operacoes.add(op);
	}
	public void listaOperacoes() {
		for (String o:operacoes) 
		{
			System.out.println(o);
		}
	}
	
	
}
