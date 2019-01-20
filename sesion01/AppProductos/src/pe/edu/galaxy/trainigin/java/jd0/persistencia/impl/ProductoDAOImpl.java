package pe.edu.galaxy.trainigin.java.jd0.persistencia.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.galaxy.trainigin.java.jd0.beans.ProductoBean;
import pe.edu.galaxy.trainigin.java.jd0.persistencia.inf.ProductoDAO;
import pe.edu.galaxy.trainigin.java.jd0.utilitario.BD;

public class ProductoDAOImpl implements ProductoDAO {

    @Override
    public List<ProductoBean> listar() throws SQLException {
        List<ProductoBean> lstProductoBean = new ArrayList<>();
        try {
            Connection cn = BD.conectar();
            String sql = "SELECT ID,NOMBRE,PRECIO,STOCK FROM PRODUCTO";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductoBean productoBean = new ProductoBean();
                productoBean.setId(rs.getInt("ID"));
                productoBean.setNombre(rs.getString("NOMBRE"));
                productoBean.setPrecio(rs.getFloat("PRECIO"));
                productoBean.setStock(rs.getInt("STOCK"));
                lstProductoBean.add(productoBean);
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            throw e;
        }
        return lstProductoBean;
    }

    @Override
    public boolean insertar(ProductoBean productoBean) throws SQLException {
        try {
            String sql = "INSERT INTO PRODUCTO"
                    + "(ID,NOMBRE,PRECIO,STOCK)"
                    + "VALUES(SEQ_PRODUCTO.NEXTVAL,?,?,?)";
            Connection cn = BD.conectar();
            
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, productoBean.getNombre());
            ps.setFloat(2, productoBean.getPrecio());
            ps.setInt(3, productoBean.getStock());
            
            ps.executeUpdate();
            
            ps.close();
            cn.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

}
