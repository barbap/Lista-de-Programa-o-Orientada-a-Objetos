package ex9;

public class Mamifero extends Animal implements MamiferoAcoes {
	private String dono;

	public Mamifero(String especie) {
		super(especie);
		// TODO Auto-generated constructor stub
	}
	public Mamifero(String nome, String especie, String dono) {
		super(especie,nome);
		this.setDono(dono);
	}
	@Override
	public void jaFoiAdotado(String nome, String dono) {
		System.out.println("O " + nome + " foi adotado pelo(a) " + dono);
		
	}
	public void jaFoiAdotado(String especie) {
		System.out.println("O " + especie + " est� pronto para ado��o respons�vel ");
		
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public void ehDomestico() {
		System.out.println("A maioria dos mam�feros s�o animais dom�sticos");
	}
}
