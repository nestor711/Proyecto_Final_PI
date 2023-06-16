/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.UsuarioDAO;
import Vistas.VistaDeOpciones;
import Vistas.VistaIngresoDeUsuario;
import Vistas.VistaRegistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Eider
 */
public class ControladorVistaIngreso {

    private VistaIngresoDeUsuario miVista;
    private UsuarioDAO miUser;

    private JTextField txtUsuario;
    private JTextField txtContra;

    public ControladorVistaIngreso(VistaIngresoDeUsuario miVista, UsuarioDAO miUser) {
        this.miVista = miVista;
        this.miUser = miUser;

        controladorDeEventos miControlador = new controladorDeEventos();
        this.miVista.botonIngresar(miControlador);
        this.miVista.botonRegistrar(miControlador);

        txtUsuario = this.miVista.txtUsuario();
        txtContra = this.miVista.txtContra();

    }

    class controladorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equalsIgnoreCase("INGRESAR")) {

                ingresar();

                if (ingresar() == true) {

                    VistaDeOpciones vistaOpciones = new VistaDeOpciones();
                    ControladorVistaOpciones controladorOpciones = new ControladorVistaOpciones(vistaOpciones);
                    miVista.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "NO SE HAN ENCONTRADO DATOS CONSISTENTES EN LA BASE DE DATOS");

                }

            }
            if (e.getActionCommand().equalsIgnoreCase("REGISTRARSE")) {

                miVista.dispose();

                VistaRegistroUsuario miVista2 = new VistaRegistroUsuario();
                UsuarioDAO miUserDAO = new UsuarioDAO();
                ControladorUsuarios miControlador2 = new ControladorUsuarios(miVista2, miUserDAO);

            }

        }

    }

    public boolean ingresar() {

        boolean respuesta;

        if (txtUsuario.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese su usuario",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtContra.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese su contraseña",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        }

        int h = 1;
        if (h == 1) {

            respuesta = true;

        } else {

            respuesta = false;
        }

        return respuesta;
    }

}
