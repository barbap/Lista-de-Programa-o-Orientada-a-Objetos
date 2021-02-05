package ex9;

abstract class Animal {
	String nome;
	String especie;
	
	public Animal(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}
	
	public void ehDomesticoInterrogacao () {
		
	}
	
	public Animal(String especie) {
		super();
		this.especie = especie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
