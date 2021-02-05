package ex2;
/*Agora, crie uma classe para testar as estruturas criadas através da criação
 *  de diferentes objetos. Nela, crie dois objetos de cada uma das mídias (CD, DVD e BluRay)
 *   sendo um com os atributos preenchidos e outro com atributos vazios (graváveis). 
 *   Crie também um objeto para cada Tocador (TocadorCD, TocadorDVD e TocadorBluRay) e 
 *   um objeto para cada Gravador (GravadorCD, GravadorDVD e GravadorBluRay). 
 *   Experimente passar cada mídia para cada método reproduzir() ou gravar() e exiba
 *    mensagens conforme cada situação. 
 */

public class menu {

	public static void main(String[] args) {
		CD cd = new CD();
		CD cd2 = new CD("Ivete Sangalo ao vivo no maracana", "Ivete Sangalo");
		cd2.reproduzir();
		DVD dvd = new DVD();
		DVD dvd2 = new DVD("Ivete Sangalo ao vivo no maracana", "Ivete Sangalo");
		dvd2.reproduzir();
		BluRay bluray = new BluRay();
		BluRay bluray2 = new BluRay("Ivete Sangalo ao vivo no maracana", "Ivete Sangalo");
		bluray2.reproduzir();
		TocadorCD tocCD = new TocadorCD();
		TocadorDVD tocDVD = new TocadorDVD();
		TocadorBluRay tocBluRay = new TocadorBluRay();
		
		tocCD.gravar("RBD", "Live in Rio");
		tocCD.reproduzir();
		tocDVD.gravar("RBD", "Live in Rio");
		tocDVD.reproduzir();
		tocBluRay.gravar("RBD", "Live in Rio");
		tocBluRay.reproduzir();
		cd.gravar("The Offspring", "Rock in Rio");
		dvd.gravar("The Offspring", "Rock in Rio");
		bluray.gravar("The Offspring", "Rock in Rio");
	}

}
