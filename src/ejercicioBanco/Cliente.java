package ejercicioBanco;

public class Cliente extends Thread {
	private CuentaBancaria cuenta;
	private double montoARetirar;

	public Cliente(String nombre, CuentaBancaria cuenta, double monto) {
		super(nombre);
		this.cuenta = cuenta;
		this.montoARetirar = monto;
	}

	@Override
	public void run() {
		cuenta.retirar(getName(), montoARetirar);
	}
}
