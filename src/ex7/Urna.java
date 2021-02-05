/*
 * 
 * Crie uma classe Urna, que possua um Map<String, int> de nome de candidatos e quantidade de votos,
a ser inseridos pelo m�todo adicionarCandidato ou removidos pelo m�todo removerCandidato(), ambos recebem um
nome de candidato como par�metro, e; e votos que devem ser incrementados pela chamada do m�todo votar(String
candidato). Crie tamb�m um m�todo que imprima na tela o nome dos candidatos e a sua quantidade de votos.
 */

package ex7;


import java.util.Hashtable;


public class Urna {
	
	public static void main (String args[]) {
	int nCandidatos = 0;
	Hashtable<Integer, Candidato> chapa = new Hashtable<Integer, Candidato>();
	
	Candidato c1 = new Candidato("Candidato 1");
	chapa.put(nCandidatos++, c1);
	adicionarCandidato(c1);
	
	
	Candidato c2 = new Candidato("Candidato 2");
	chapa.put(nCandidatos++, c2);
	adicionarCandidato(c2);
	
	
	Candidato c3 = new Candidato("Candidato 3");
	chapa.put(nCandidatos++, c3);
	adicionarCandidato(c3);
	
	for (int i=1; i<11;i++) {
	votar(c1);
	}
	for (int i=1; i<25;i++) {
	votar(c2);
	}
	for (int i=1; i<80;i++) {
	votar(c3);
	}
	resultado(chapa);

}
	
	private static void adicionarCandidato(Candidato c1) {
		System.out.println(c1.getNome() + " candidatado");
		System.out.println(" ");
		System.out.println(" ");
	}

	public static void votar(Candidato c) {
		int qtdvotos = c.getQtdvotos();
		qtdvotos++;
		c.setQtdvotos(qtdvotos);
		
	}
	
	public static void resultado(Hashtable<Integer,Candidato> chapa) {
		System.out.println("Candidato \tN�mero de votos");
		for (int i=0;i<chapa.size();i++) {
			System.out.println(chapa.get(i));
		}
	}

}
