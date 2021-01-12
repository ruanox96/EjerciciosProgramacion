package capitulo4.ColeccionAntiguedades;

public class Antiguedad {

	protected int aņoFabricacion;
	protected String origen;
	protected int precio;

	protected Antiguedad(int aņoFabricacion, String origen, int precio) {
		this.aņoFabricacion = aņoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	protected int getAņoFabricacion() {
		return aņoFabricacion;
	}

	protected void setAņoFabricacion(int aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}

	protected String getOrigen() {
		return origen;
	}

	protected void setOrigen(String origen) {
		this.origen = origen;
	}

	protected int getPrecio() {
		return precio;
	}

	protected void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Antiguedad [aņoFabricacion=" + aņoFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

}
