/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Eider
 */
public interface IUsuarioDAO {

    int grabarUsuario(Usuario u);
    boolean validarLogin(String userName, String password);
    ArrayList<Usuario> listadoUsuarios(String nick);
    
}
