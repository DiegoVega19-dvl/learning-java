package overwatch2;

public class Main {
	
	public static void main(String[] args) {
		
		
		Reinhardt tanque = new Reinhardt("Reinhardt", "skin base");
		
		System.out.println(tanque.getNombre() + " utiliza " + tanque.ultimate());
		System.out.println( tanque.absorberDano());
	}

}
