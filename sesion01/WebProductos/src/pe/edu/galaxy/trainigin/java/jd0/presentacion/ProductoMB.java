package pe.edu.galaxy.trainigin.java.jd0.presentacion;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import pe.edu.galaxy.trainigin.java.jd0.beans.ProductoBean;
import pe.edu.galaxy.trainigin.java.jd0.persistencia.impl.ProductoDAOImpl;
import pe.edu.galaxy.trainigin.java.jd0.persistencia.inf.ProductoDAO;

@ManagedBean(name = "productoMB")
public class ProductoMB {

	private List<ProductoBean> productos;

	private ProductoBean producto;

	private ProductoDAO productoDAO;
	
	public void setProducto(ProductoBean producto) {
		this.producto = producto;
	}

	public ProductoBean getProducto() {
		return producto;
	}


	/*
	 * public ProductoMB(){ productoDAO = new ProductoDAOImpl(); this.listar();
	 * 
	 * }
	 */
	//
	@PostConstruct
	public void init() {
		productoDAO = new ProductoDAOImpl();
		// para que no devuelva nulo, se inicializa
		this.setProducto(new ProductoBean(0, "Cafe", 1.5f, 5 ));
		this.listar();
	}

	public void listar() {
		try {
			productos = productoDAO.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void registrar() {
		System.out.println(this.producto);
		try {
			productoDAO.insertar(this.producto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<ProductoBean> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoBean> productos) {
		this.productos = productos;
	}

}
