package ejercicioBanco;

public class Main {
	public static void main(String[] args) {
		CuentaBancaria cuentaCompartida = new CuentaBancaria(1000);

		Cliente cliente1 = new Cliente("Cliente 1", cuentaCompartida, 700);
		Cliente cliente2 = new Cliente("Cliente 2", cuentaCompartida, 500);

		System.out.println("Saldo inicial: $" + cuentaCompartida.getSaldo());
		cliente1.start();
		cliente2.start();
	}
}
