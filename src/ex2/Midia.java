//Crie a classe Midia, que não deve permitir sem instanciada, com os atributos artista 
//(String) e titulo
//(String), que devem ser encapsulados

package ex2;

abstract class Midia {
	private String artista;
	private String titulo;
	
	
	public Midia() {
		super();
	}
	public Midia(String artista, String titulo) {
		super();
		this.artista = artista;
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void gravar (String artista, String titulo) {
		setTitulo(titulo);
		setArtista(artista);
	}
	public void reproduzir (DVD dvd) {
		System.out.println(dvd.getArtista() + " - "+ dvd.getTitulo());
	}
	public void reproduzir (CD cd) {
		System.out.println(cd.getArtista() + " - " + cd.getTitulo());
	}
	public void reproduzir (BluRay bluray) {
		System.out.println(bluray.getArtista() + " - " + bluray.getTitulo());
	}
}
