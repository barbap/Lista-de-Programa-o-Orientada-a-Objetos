package ex2;

public class GravadorBluRay extends TocadorBluRay implements GravaBluRay{

	@Override
	public void gravar(String titulo, String artista) {
		BluRay blu = new BluRay();
		blu.setArtista(artista);
		blu.setTitulo(titulo);
		
	}

}
