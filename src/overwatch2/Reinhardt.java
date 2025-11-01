package overwatch2;

public class Reinhardt extends Personaje implements ITanque {

	public Reinhardt(String nombre, String skin) {
		super(nombre, skin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String saltar() {

		return "Reinhardt esta saltando";
	}

	@Override
	public String agacharse() {

		return "Reinhardt se agacha";
	}

	@Override
	public String moverse() {

		return "Reinhardt se esta moviendo";
	}

	@Override
	public String mirar() {

		return "Reinhardt esta mirando la camara";
	}

	@Override
	public String ultimate() {

		return "Quebrantazuelos";
	}

	@Override
	public String absorberDano() {

		return "Reinhardt usa escudo";
	}

}
