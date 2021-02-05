package ex2;

public class GravadorDVD extends TocadorDVD implements GravaDVD {
	
	
	@Override
	public void gravar(String titulo, String artista) {
		DVD dvd = new DVD();
		dvd.setArtista(artista);
		dvd.setTitulo(titulo);
	}
	
}
