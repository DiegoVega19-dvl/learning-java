package videojuego;

public class Tanque extends Personaje {

	public Tanque(String nombre, String clase, String ultimate, int nivel) {
		super(nombre, clase, ultimate, nivel);

	}

	@Override
	public String saltar() {
		// TODO Auto-generated method stub
		return nombre + "esta saltanto";
	}

	@Override
	public String agacharse() {
		// TODO Auto-generated method stub
		return nombre + "se esta agachando";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return nombre + "esta corriendo";
	}

	@Override
	public String andar() {
		// TODO Auto-generated method stub
		return nombre + "esta caminando";
	}

	@Override
	public String usarUlti() {
		// TODO Auto-generated method stub
		return nombre + "uso su ulti: " + ultimate;
	}

	@Override
	public String animacion() {
		// TODO Auto-generated method stub
		return nombre + "esta saludando";
	}

}
