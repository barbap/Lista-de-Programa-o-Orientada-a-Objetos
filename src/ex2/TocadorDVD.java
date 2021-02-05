package ex2;

public class TocadorDVD extends Tocador implements ReproduzDVD {
	public void reproduzir (DVD dvd) {
		if (dvd!=null)
		System.out.println("Reproduzindo o " + dvd.getTitulo() +" do artista " + dvd.getArtista());
	}

	@Override
	public void reproduzir() {
		
	}
}
