package ex9;
/* Professor, vou comentar meus exemplos no arquivo/classe menu e na classe abstrata Animal
 * 
 * 
 * */
public class menu {

	public static void main(String[] args) {
		Reptil reptil = new Reptil("Laís","Lagartixa");//sobrecarga do metodo 
		reptil.rastro(reptil.getNome(),reptil.getEspecie());
		reptil.alimentaSe(reptil.getNome(),reptil.getEspecie()," insetos");//sobrecarga do metodo 
		reptil.ehDomesticoInterrogacao();
		
		Reptil reptil2 = new Reptil("Jacaré");//sobrecarga do metodo 
		reptil2.rastro(reptil2.getEspecie());//implementando o metodo da interface
		reptil2.alimentaSe(reptil.getEspecie(), "Peixes");//sobrecarga do metodo 
		reptil.ehDomesticoInterrogacao();
		
		Mamifero mam = new Mamifero("Cão","Pim","Bárbara");//sobrecarga do metodo 
		mam.jaFoiAdotado(mam.getNome(), mam.getDono());//sobrecarga do metodo e implementando o metodo da interface
		mam.ehDomestico();//sobrescrita 
		
		Mamifero mam2 = new Mamifero ("gato");//sobrecarga do metodo
		mam2.jaFoiAdotado(mam2.getEspecie());//sobrecarga do metodo e implementando o metodo da interface
		mam2.ehDomestico();//sobrescrita 
		
		
		//
		
	}

}
