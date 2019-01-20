
package pe.edu.galaxy.trainigin.java.jd0.persistencia.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.galaxy.trainigin.java.jd0.beans.TrabajadorBean;
import pe.edu.galaxy.trainigin.java.jd0.persistencia.inf.TrabajadorDAO;
import pe.edu.galaxy.trainigin.java.jd0.utilitario.BD;

public class TrabajadorDAOImpl implements TrabajadorDAO{

    @Override
    public List<TrabajadorBean> listar() throws SQLException {
      List<TrabajadorBean> lstTrabajadorBean = new ArrayList<>();
        try {
            Connection cn = BD.conectar();
            String sql = "SELECT ID,APELLIDO_PATERNO,APELLIDO_MATERNO,NOMBRE FROM TRABAJADOR";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TrabajadorBean trabajadorBean = new TrabajadorBean();
                trabajadorBean.setId(rs.getInt("ID"));
                trabajadorBean.setApellidoPaterno(rs.getString("APELLIDO_PATERNO"));
                trabajadorBean.setApellidoMaterno(rs.getString("APELLIDO_MATERNO"));
                trabajadorBean.setNombre(rs.getString("NOMBRE"));
                lstTrabajadorBean.add(trabajadorBean);
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            throw e;
        }
        return lstTrabajadorBean;
    }
    
}
