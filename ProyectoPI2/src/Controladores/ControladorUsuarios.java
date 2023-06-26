/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Usuario;
import Modelos.UsuarioDAO;
import Vistas.VistaIngresoDeUsuario;
import Vistas.VistaRegistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Eider
 */
public class ControladorUsuarios {

    private VistaRegistroUsuario registro;
    private VistaIngresoDeUsuario ingreso;
    private UsuarioDAO modelo;

    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtNick;
    private JPasswordField txtContrasena;
    private JTextField txtDomicilio;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JComboBox cbxTipoUsuario;

    public ControladorUsuarios(VistaRegistroUsuario registro, UsuarioDAO modelo) {
        this.registro = registro;

        this.modelo = modelo;

        this.registro.botonRegistrar(new ManejadorDeEventos());
        this.registro.botonCancelar(new ManejadorDeEventos());

        txtNombre = registro.gettxtNombre();
        txtApellido = registro.gettxtApellido();
        txtNick = registro.gettxtNick();
        txtContrasena = registro.gettxtContra();
        txtDomicilio = registro.gettxtDomicilio();
        txtTelefono = registro.gettxtTel();
        txtCorreo = registro.gettxtCorreo();
        cbxTipoUsuario = registro.gettxtTipoU();

    }

    public class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equalsIgnoreCase("Registrar")) {

                //registrar();
                limpieza();
                registro.dispose();

                VistaIngresoDeUsuario miVista = new VistaIngresoDeUsuario();
                UsuarioDAO miUser = new UsuarioDAO();
                ControladorVistaIngreso miControlador = new ControladorVistaIngreso(miVista, miUser);
            }

            if (e.getActionCommand().equalsIgnoreCase("Cancelar")) {
                registro.dispose();
                VistaIngresoDeUsuario miVista = new VistaIngresoDeUsuario();
                UsuarioDAO miUser = new UsuarioDAO();
                ControladorVistaIngreso miControlador = new ControladorVistaIngreso(miVista, miUser);
            }
        }

    }

    private void limpieza() {
        registro.limpiar();
    }

    private void registrar() {

        if (txtNombre.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su nombre",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtApellido.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su apellido",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtNick.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su nick",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtContrasena.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su contrasena",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtDomicilio.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su domicilio",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtTelefono.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su telefono",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtCorreo.getText().trim().equals("")) {
            registro.gestionMensajes("Ingrese su correo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (cbxTipoUsuario.getSelectedItem().toString().trim().
                equals("Seleccionar ...")) {
            registro.gestionMensajes("Seleccione un nivel",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } else {

            Usuario usuario = new Usuario();
            usuario.setNombre(txtNombre.getText());
            usuario.setApellido(txtApellido.getText());
            usuario.setContrasena(txtContrasena.getText());
            usuario.setDomicilio(txtDomicilio.getText());
            usuario.setTelefono(txtTelefono.getText());
            usuario.setCorreo(txtCorreo.getText());
            usuario.setTipoUsuario(cbxTipoUsuario.getSelectedItem().toString().trim());
            usuario.setNick(txtNick.getText());

            int tamaño;
            tamaño = modelo.listadoUsuarios(usuario.getNick()).size();

            if (tamaño == 0) {
                int resultado = 0;
                resultado = modelo.grabarUsuario(usuario);
                if (resultado == 1) {
                    registro.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Usuario> listadoUsuario;
                    listadoUsuario = modelo.listadoUsuarios("0");

                } else {
                    registro.gestionMensajes("Error al grabar",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                registro.gestionMensajes("Codigo ya está registrado",
                        "Confirmación",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
