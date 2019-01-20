package pe.edu.galaxy.trainigin.java.jd0.beans;

public class ProductoBean {

	// Atributos ( Fields) 
	// - privados(encapsulaci�n)
	
	private int id; 
	private String nombre;
	private float precio;
	private int stock;
	
	
	// Metodos
	
		// Constructores
		public ProductoBean() {
			super();
		}
		
		public ProductoBean(int id, String nombre, float precio, int stock) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.stock = stock;
		}
		// Getters/Setters
		
		

		public int getId(){
			return this.id;
		}
		public void setId(int id){
			this.id=id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		
		// toString()

		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", precio="
					+ precio + ", stock=" + stock + "]";
		}
		
	
		// operacionales
		public String getProducto(){
			return this.getId()
					+ ":" + this.getNombre().toUpperCase();
		}
	
}
