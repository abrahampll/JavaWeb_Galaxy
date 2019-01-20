package pe.edu.galaxy.trainigin.java.jd0.persistencia.inf;

import java.sql.SQLException;
import java.util.List;
import pe.edu.galaxy.trainigin.java.jd0.beans.TrabajadorBean;

public interface TrabajadorDAO {
	
        public List<TrabajadorBean> listar() throws SQLException;

}
