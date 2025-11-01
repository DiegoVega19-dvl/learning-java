package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {

	}

	public static long fibonacci(long posicion) {
		long siguiente = 1, actual = 0, temporal = 0;
		for (long x = 1; x <= posicion; x++) {

			System.out.print(actual + ", ");
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		System.out.println(actual);
		return actual;
	}
}