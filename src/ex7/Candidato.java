package ex7;

public class Candidato {
	private String nome;
	private int qtdvotos;
	
	public Candidato(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdvotos() {
		return qtdvotos;
	}

	public void setQtdvotos(int qtdvotos) {
		this.qtdvotos = qtdvotos;
	}

	@Override
	public String toString() {
		return  nome +" \t" +qtdvotos ;
	}
	
	

}
