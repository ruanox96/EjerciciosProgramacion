package capitulo4.ColeccionAntiguedades;

public class Antiguedad {

	protected int a�oFabricacion;
	protected String origen;
	protected int precio;

	protected Antiguedad(int a�oFabricacion, String origen, int precio) {
		this.a�oFabricacion = a�oFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	protected int getA�oFabricacion() {
		return a�oFabricacion;
	}

	protected void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
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
		return "Antiguedad [a�oFabricacion=" + a�oFabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

}
