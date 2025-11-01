package poo;

public class Coche {

	// Atributos
	String marca;
	String modelo;
	int año;

	// constructor vacio
	public Coche() {

	}

	// constructor
	public Coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;

	}

	// setters y getters, es buena practica colocar los setters y getters debajo del
	// contructor o antes de los metodos

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	// Metodo
	public void acelerarCoche() {
		System.out.println("acelerando");

	}

	// Metodo
	public void frenarCoche() {
		System.out.println("frenando");

	}

}
