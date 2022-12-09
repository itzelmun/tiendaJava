package tiendita;

public class NoParecible extends Producto{

	private int contenido;
	private int calorias;
	public NoParecible(String nombre, Double precio, int contenido, int calorias) {
		super(nombre, precio);
		this.contenido = contenido;
		this.calorias = calorias;
	}
	@Override
	public String toString() {
		return "NoParecible [contenido=" + contenido + ", calorias=" + calorias + super.toString()+"]";
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	
	
	
}
