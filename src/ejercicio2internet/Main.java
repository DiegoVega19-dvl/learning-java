package ejercicio2internet;

public class Main {
	
	public static void main(String[] args) {
		
		
		Libro libro = new Libro(31321321,500,"el llano en llamas","Juan Rulfo");
		Libro libro1 = new Libro(53645555,345,"it","Sthephen King");
		
		System.out.println(libro);
		System.out.println(libro1);
		
		if(libro.getNoPaginas()>libro1.getNoPaginas()) {
			System.out.println("el libro con el mayor numero de paginas es: " + libro.getTitulo() + " con " + libro.getNoPaginas() + " paginas");
		}else {
			System.out.println("el libro con el mayor numero de paginas es: " + libro1.getTitulo() + " con " + libro1.getNoPaginas() + " paginas");
		}
	}

}
