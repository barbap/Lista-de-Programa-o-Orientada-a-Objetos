package ex8;

public class Roleta {
	
	static int contRoletas; 
	//Numero de roletas ao todo, onde o valor é uníco e igual para todos os objetos instanciados na classe.
	//Exemplo de alocação estatica, pois a variavel é única para toda a classe e seus objetos

	int contGiros;
	//Numero de giros do objeto roleta
	
	public Roleta() {
		contRoletas++;
		//Ao criar uma nova roleta, aumenta o numero de roletas totais
	}
	
	
	public static void main(String args[]) {
		
		Roleta roleta1 = new Roleta();
		Roleta roleta2 = new Roleta();
		//Alocação dinamica sendo identificada ao utilizar o NEW, pois o java aloca dinamicamente memória para a inicialização do objeto 
		
		roleta1.contGiros++;
		roleta2.contGiros = roleta2.contGiros + 2;
		//Aumenta o numero de giros das roletas em especifico, dinamicamente.
		
		
	}
	
	
}
