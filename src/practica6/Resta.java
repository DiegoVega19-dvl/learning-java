package practica6;

public class Resta implements Operaciones {

	double numero;
	double numero1;
	double resultado;

	public Resta(double numero, double numero1) {
		this.numero = numero;
		this.numero1 = numero1;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	@Override
	public double calcular() {

		resultado = numero - numero1;

		return resultado;
	}

}
