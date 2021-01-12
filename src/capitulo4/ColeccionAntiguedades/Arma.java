package capitulo4.ColeccionAntiguedades;

class Arma extends Antiguedad {

	protected String fabricante;
	protected String calibre;

	public Arma(int aņoFabricacion, String origen, int precio, String fabricante, String calibre) {
		super(aņoFabricacion, origen, precio);
		this.fabricante = fabricante;
		this.calibre = calibre;

	}

	protected String getFabricante() {
		return fabricante;
	}

	protected void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	protected String getCalibre() {
		return calibre;
	}

	protected void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	@Override
	public String toString() {
		return "Arma [fabricante=" + fabricante + ", calibre=" + calibre + ", aņoFabricacion=" + aņoFabricacion
				+ ", origen=" + origen + ", precio=" + precio + "]";
	}

}
