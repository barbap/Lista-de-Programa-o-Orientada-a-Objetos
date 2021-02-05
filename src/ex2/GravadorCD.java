package ex2;

public class GravadorCD extends TocadorCD implements GravaCD{

	
	public void gravar(String artista, String titulo) {
		CD cd = new CD();
		cd.setArtista(artista);
		cd.setTitulo(titulo);
		
	}

	@Override
	public void gravar() {
		// TODO Auto-generated method stub
		
	}

}
