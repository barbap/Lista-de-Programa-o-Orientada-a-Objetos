package ex9;

public class Reptil extends Animal implements ReptilAcoes{
	
	
	public Reptil(String nome, String especie) {
		super(nome, especie);
		// TODO Auto-generated constructor stub
	}
	public Reptil(String especie) {
		super(especie);
		// TODO Auto-generated constructor stub
	}
	public void rastro (String nome, String especie) {
		System.out.println("O/A " + especie + " " +nome + " anda de rastro");
	}
	public void rastro (String especie) {
		System.out.println("O/A " + especie + " anda de rastro");
	}
	
	public void alimentaSe (String nome, String especie, String alimento) {
		System.out.println("O/A " + especie + " " +nome + " se alimenta de" + alimento);
	}
	public void alimentaSe (String especie, String alimento) {
		System.out.println("O/A " + especie + " se alimenta de" + alimento);
	}
	
	public void ehDomesticoInterrogacao () { 
		System.out.println("Repteis geralmente são animais selvagens");
	}
	
}
