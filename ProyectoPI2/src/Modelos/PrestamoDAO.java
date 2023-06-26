/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import Modelos.Equipo;
import Services.Fachada;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eider
 */
public class PrestamoDAO implements IPrestamoDAO{

    @Override
    public int grabarPrestamo(Prestamo p) {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try {
            con = Fachada.getConnection();
                                                     //1 2 3 4 5 6 7 
            String sql = "INSERT INTO PRESTAMOS values (?,?,?,?,?,?,?)"; //parametros
            pstm = con.prepareStatement(sql);
            pstm.setString(1, p.getUnEquipo());
            pstm.setString(2, p.getNombreResponsable());
            pstm.setString(3, p.getFechaSalida());
            pstm.setString(4, p.getFechaRetorno());
            pstm.setString(5, p.getLugarDestion());
            pstm.setString(6, p.getEstadoEquipo());
            pstm.setString(7, p.getActividades());
            
            

            rtdo = pstm.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código  : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Código : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;}

    @Override
    public ArrayList<Prestamo> listadoPrestamo(String nombreRespon) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Prestamo> listado = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";
            if (nombreRespon.equalsIgnoreCase("0")) {
                sql = "SELECT * FROM prestamos ORDER BY codigo";
            } else {
                sql = "SELECT * FROM prestamos where codigo = ? "
                        + "ORDER BY codigo";
            }
            pstm = con.prepareStatement(sql);

            if (nombreRespon != "0") {
                pstm.setString(1, nombreRespon);
            }

            rs = pstm.executeQuery();

            Prestamo prestamo = null;
            while (rs.next()) {
                prestamo = new Prestamo();
                
                prestamo.setUnEquipo(rs.getString("Codigo"));
                prestamo.setNombreResponsable(rs.getString("NombreDelResponsable"));
                prestamo.setFechaSalida(rs.getString("FechaDeSalida"));
                prestamo.setFechaRetorno(rs.getString("FechaDeRetorno"));
                prestamo.setLugarDestion(rs.getString("LugarDeDestino"));
                prestamo.setEstadoEquipo(rs.getString("EstadoDelEquipo"));
                prestamo.setActividades(rs.getString("ActividadesARealizar"));
                

                listado.add(prestamo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NombreDelResponsable : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "NombreDelResponsable : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listado;
    }

    @Override
    public int borrarPrestamo(String codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM prestamos WHERE codigo = ? ";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, codigo);
            rtdo = pstm.executeUpdate(); 
            return rtdo;
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        } 
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return rtdo;
    }
    
}
