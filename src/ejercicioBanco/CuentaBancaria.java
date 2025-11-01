package ejercicioBanco;

import java.util.concurrent.atomic.AtomicBoolean;

public class CuentaBancaria {
	private double saldo;

	private AtomicBoolean lock = new AtomicBoolean(false);

	public CuentaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void retirar(String nombreCliente, double monto) {
		System.out.println(">> " + nombreCliente + " quiere retirar $" + monto);

		while (!lock.compareAndSet(false, true)) {
		}

		try {
			if (saldo >= monto) {
				System.out.println("   (" + nombreCliente + " está procesando el retiro...)");
				Thread.sleep(1000);
				saldo -= monto;
				System.out.println("Retiro exitoso para " + nombreCliente + ". Saldo restante: $" + saldo);
			} else {
				System.out.println("Fondos insuficientes para " + nombreCliente + ". Saldo actual: $" + saldo);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("El retiro fue interrumpido.");
		} finally {
			lock.set(false);
		}
	}
}
