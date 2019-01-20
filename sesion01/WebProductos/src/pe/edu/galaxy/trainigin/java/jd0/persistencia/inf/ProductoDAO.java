
package pe.edu.galaxy.trainigin.java.jd0.persistencia.inf;

import java.sql.SQLException;
import java.util.List;
import pe.edu.galaxy.trainigin.java.jd0.beans.ProductoBean;

public interface ProductoDAO {
    
    public List<ProductoBean> listar() throws SQLException;
    
    public boolean insertar(ProductoBean productoBean) throws SQLException;
    
}
