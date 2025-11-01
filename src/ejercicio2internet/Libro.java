package ejercicio2internet;

public class Libro {

	public int ISBN;
	public int noPaginas;
	public String Titulo;
	public String autor;

	public Libro() {

	}

	public Libro(int iSBN, int noPaginas, String titulo, String autor) {
		this.ISBN = iSBN;
		this.noPaginas = noPaginas;
		this.Titulo = titulo;
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getNoPaginas() {
		return noPaginas;
	}

	public void setNoPaginas(int noPaginas) {
		this.noPaginas = noPaginas;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "El Libro con el ISBN:  " + ISBN + ", creado por el autor " + autor + ", tiene " + noPaginas
				+ " paginas";
	}

}
