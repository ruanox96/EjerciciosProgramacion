package capitulo4.ColeccionAntiguedades;

public class Vinilo extends Antiguedad {

	protected String nombre;
	protected String artista;

	public Vinilo(int aņoFabricacion, String origen, int precio, String nombre, String artista) {
		super(aņoFabricacion, origen, precio);
		this.nombre = nombre;
		this.artista = artista;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getArtista() {
		return artista;
	}

	protected void setArtista(String artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Vinilo [nombre=" + nombre + ", artista=" + artista + ", aņoFabricacion=" + aņoFabricacion + ", origen="
				+ origen + ", precio=" + precio + "]";
	}

}
