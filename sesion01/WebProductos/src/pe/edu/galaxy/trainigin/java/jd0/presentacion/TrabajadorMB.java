package pe.edu.galaxy.trainigin.java.jd0.presentacion;

import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import pe.edu.galaxy.trainigin.java.jd0.beans.TrabajadorBean;
import pe.edu.galaxy.trainigin.java.jd0.persistencia.impl.TrabajadorDAOImpl;
import pe.edu.galaxy.trainigin.java.jd0.persistencia.inf.TrabajadorDAO;


@ManagedBean(name="trabajadorMB")
public class TrabajadorMB {
	
	
	private List<TrabajadorBean> trabajadores;
	private TrabajadorDAO trabajadorDAO;
	
	@PostConstruct
	public void init(){
		trabajadorDAO=new TrabajadorDAOImpl();
		this.listar();
	}
	
	public void listar(){
		try {
			trabajadores=trabajadorDAO.listar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
	
	

}
