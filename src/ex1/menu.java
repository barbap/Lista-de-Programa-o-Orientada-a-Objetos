package ex1;

 

public class menu {

	public static void main(String[] args) {
		Lampada lamp1, lamp2, lamp3, lamp4, lamp5;
		lamp1 = new Lampada(110,"Verelho");
		lamp2 = new Lampada(110,"Roxo");
		lamp3 = new Lampada(110,"Rosa");
		lamp4 = new Lampada(220,"Verde");
		lamp5 = new Lampada(220,"Azul");
		Abajur abj1, abj2;
		abj1 = new Abajur(110,lamp1,true);
		abj2 = new Abajur(220,lamp3,true);
		abj1.ligar(null);//esse aqui nem chama
		abj2.ligar(lamp2);
		abj1.ligar(lamp2);
		abj1.trocarLampada(lamp2);
		abj1.trocarLampada(lamp5);
		abj1.desligar(false);
		abj1.trocarLampada(lamp1);
		abj2.trocarLampada(lamp4);
	}

}
