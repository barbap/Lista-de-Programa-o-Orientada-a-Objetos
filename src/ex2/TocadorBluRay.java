package ex2;

public class TocadorBluRay extends Tocador implements ReproduzBluRay {

	public void reproduzir (BluRay bluray) {
		if (bluray!=null)
		System.out.println("Reproduzindo o " + bluray.getTitulo() +" do artista " + bluray.getArtista());
	}
	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		
	}
	
}
