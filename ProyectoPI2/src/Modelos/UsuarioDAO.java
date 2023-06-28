/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Modelos.IUsuarioDAO;
import Modelos.Usuario;
import Services.Fachada;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eider
 */
public class UsuarioDAO implements IUsuarioDAO {

    public UsuarioDAO() {
    }

    /**
     *
     * @param u Objeto de la clase Programa a grabar
     * @return rtdo resultado de la operación grbar
     */
    @Override

    public int grabarUsuario(Usuario u) {
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try {
            con = Fachada.getConnection();
            //1 2 3 4 5 6 7 8
            String sql = "INSERT INTO USUARIOS values (?,?,?,?,?,?,?,?)"; //parametros
            pstm = con.prepareStatement(sql);
            pstm.setString(1, u.getNombre());
            pstm.setString(2, u.getApellido());
            pstm.setString(3, u.getNick());
            pstm.setString(4, u.getContrasena());
            pstm.setString(5, u.getDomicilio());
            pstm.setString(6, u.getTelefono());
            pstm.setString(7, u.getCorreo());
            pstm.setString(8, u.getTipoUsuario());

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
    public ArrayList<Usuario> listadoUsuarios(String nick) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Usuario> listado = new ArrayList<>();
        try {
            con = Fachada.getConnection();
            String sql = "";
            if (nick.equalsIgnoreCase("0")) {
                sql = "SELECT * FROM usuarios ORDER BY Nick";
            } else {
                sql = "SELECT * FROM usuarios where Nick = ? "
                        + "ORDER BY Nick";
            }
            pstm = con.prepareStatement(sql);

            if (nick != "0") {
                pstm.setString(1, nick);
            }

            rs = pstm.executeQuery();

            Usuario usuario = null;
            while (rs.next()) {
                usuario = new Usuario();

                usuario.setNombre(rs.getString("Nombre"));
                usuario.setApellido(rs.getString("Apellido"));
                usuario.setNick(rs.getString("Nick"));
                usuario.setContrasena(rs.getString("Contraseña"));
                usuario.setDomicilio(rs.getString("Domicilio"));
                usuario.setTelefono(rs.getString("Telefono"));
                usuario.setCorreo(rs.getString("Correo"));
                usuario.setTipoUsuario(rs.getString("TipoUsuario"));

                listado.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nick : "
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
    public boolean validarLogin(String userName, String password) {
        boolean respuesta = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {
            con = Fachada.getConnection();

            // Preparar la consulta SQL para validar el login
            String sql = "SELECT * FROM USUARIOS WHERE NICK = ? AND contraseña = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, userName);
            pstm.setString(2, password);

            // Ejecutar la consulta
            rs = pstm.executeQuery();

            // Verificar si se encontró un resultado válido
            if (rs.next()) {
                // Se encontró una coincidencia válida, el usuario y contraseña son válidos
                // Crear un objeto Usuario y establecer sus atributos según los valores obtenidos del ResultSet
                respuesta = true;
                // Establecer los demás atributos del usuario según el esquema de la base de datos
            } else {
                respuesta = false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } finally {
            // Cerrar los recursos en el orden inverso a como fueron abiertos
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // Manejar la excepción
                }
            }
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException ex) {
                    // Manejar la excepción
                }
            }
            if (con != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // Manejar la excepción
                }
            }
        }

        return respuesta;
    }

}
