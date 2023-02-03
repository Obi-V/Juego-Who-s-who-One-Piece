package Juego;

public class Personajes {
	//Características necesarias para cada personaje.
	private String nombre;
	private boolean humano, poderes, armas, masculino, nadar, fuerte;

	//Constructor por defecto vacío para hacer consultas por ejemplo en la base de datos.
	public Personajes() {
	}
 
	//Constructor por parámetros para la creación de los persona.
	public Personajes(String nombre, boolean humano, boolean poderes, boolean armas, boolean masculino, boolean nadar,
			boolean fuerte) {
		this.nombre = nombre;
		this.humano = humano;
		this.poderes = poderes;
		this.armas = armas;
		this.masculino = masculino;
		this.nadar = nadar;
		this.fuerte = fuerte;
	}

	//Getters para consultar el valor de los atributos en VentanaJuego.
	public String getNombre() {
		return nombre;
	}

	public boolean isHumano() {
		return humano;
	}

	public boolean isPoderes() {
		return poderes;
	}

	public boolean isArmas() {
		return armas;
	}

	public boolean isMasculino() {
		return masculino;
	}

	public boolean isNadar() {
		return nadar;
	}

	public boolean isFuerte() {
		return fuerte;
	}

	//Método toString para poder comprobarlo en consola.
	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", humano=" + humano + ", poderes=" + poderes + ", armas=" + armas
				+ ", masculino=" + masculino + ", nadar=" + nadar + ", fuerte=" + fuerte + "]";
	}
}