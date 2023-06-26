/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Services.Fachada;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Eider
 */
public class EquipoDAO implements IEquipoDAO{

    public EquipoDAO() {
    }
    
    
    

    @Override
    public int grabarEquipo(Equipo e) {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try {
            con = Fachada.getConnection();
                                                     //1 2 3 4 5 6 7 8
            String sql = "INSERT INTO EQUIPO values (?,?,?,?,?,?,?,?)"; //parametros
            pstm = con.prepareStatement(sql);
            pstm.setString(1, e.getCodigoEquipo());
            pstm.setString(2, e.getResponsable());
            pstm.setString(3, e.getFrecuenciaMantenimiento());
            pstm.setString(4, e.getUltimoMantenimiento());
            pstm.setString(5, e.getProximoMantenimiento());
            pstm.setString(6, e.getUbicacionActual());
            pstm.setString(7, e.getFechaCompra());
            pstm.setString(8, e.getEstado());

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
        return rtdo;
        }

    @Override
    public ArrayList<Equipo> listadoEquipos(String codigoEquipo) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Equipo> listado = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";
            if (codigoEquipo.equalsIgnoreCase("0")) {
                sql = "SELECT * FROM equipo ORDER BY codigoDeEquipo";
            } else {
                sql = "SELECT * FROM equipo where codigoDeEquipo = ? "
                        + "ORDER BY codigoDeEquipo";
            }
            pstm = con.prepareStatement(sql);

            if (codigoEquipo != "0") {
                pstm.setString(1, codigoEquipo);
            }

            rs = pstm.executeQuery();

            Equipo equipo = null;
            while (rs.next()) {
                equipo = new Equipo();

                equipo.setCodigoEquipo(rs.getString("CodigoDeEquipo"));
                equipo.setResponsable(rs.getString("Responsable"));
                equipo.setFrecuenciaMantenimiento(rs.getString("FrecuenciaMantenimiento"));
                equipo.setUltimoMantenimiento(rs.getString("UltimoMantenimiento"));
                equipo.setProximoMantenimiento(rs.getString("ProximoMantenimiento"));
                equipo.setUbicacionActual(rs.getString("UbicacionActual"));
                equipo.setFechaCompra(rs.getString("FechaDeCompra"));
                equipo.setEstado(rs.getString("Estado"));

                listado.add(equipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CodigoDeEquipo : "
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
                JOptionPane.showMessageDialog(null, "Nick : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listado;

    }

    @Override
    public int borrarEquipo(String codigo) {
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM equipo WHERE codigodeequipo = ? ";
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

    @Override
    public int modificarEquipo(Equipo e) {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE equipo " +
                         "SET  responsable = ?, frecuenciamantenimiento = ?, ultimomantenimiento = ?, proximomantenimiento= ?, ubicacionactual= ?, fechadecompra= ?, estado= ? "
                    +    "WHERE codigodeequipo=?";
            pstm = con.prepareStatement(sql); 
            
            
            pstm.setString(1, e.getResponsable());
            pstm.setString(2, e.getFrecuenciaMantenimiento());
            pstm.setString(3, e.getUltimoMantenimiento());
            pstm.setString(4, e.getProximoMantenimiento());
            pstm.setString(5, e.getUbicacionActual());
            pstm.setString(6, e.getFechaCompra());
            pstm.setString(7, e.getEstado());
            pstm.setString(8, e.getCodigoEquipo());
            rtdo = pstm.executeUpdate();  
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

    @Override
    public ArrayList<Equipo> listadoEquiposDisponible(String ubicacion) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Equipo> listado = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";
            if (ubicacion.equalsIgnoreCase("0")) {
                sql = "select * from equipo WHERE ubicacionactual= 'Empresa'";
            } else {
                sql = "select * from equipo WHERE ubicacionactual= 'Empresa'"
                        + "ORDER BY codigoDeEquipo";
            }
            pstm = con.prepareStatement(sql);

            if (ubicacion != "0") {
                pstm.setString(1, ubicacion);
            }

            rs = pstm.executeQuery();

            Equipo equipo = null;
            while (rs.next()) {
                equipo = new Equipo();

                equipo.setCodigoEquipo(rs.getString("CodigoDeEquipo"));
                equipo.setUbicacionActual(rs.getString("UbicacionActual"));

                listado.add(equipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CodigoDeEquipo : "
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
                JOptionPane.showMessageDialog(null, "Nick : "
                        + ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listado;
}
    
}
