package ex2;

public class TocadorCD extends Tocador implements ReproduzCD{

	public void reproduzir (CD cd) {
		if (cd!=null)
		System.out.println("Reproduzindo o " + cd.getTitulo() +" do artista " + cd.getArtista());
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		
	}

}
