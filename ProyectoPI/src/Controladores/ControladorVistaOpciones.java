/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.VistaDeOpciones;
import Vistas.VistaIngresoDeEquipo;
import Vistas.VistasPrestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Eider
 */
public class ControladorVistaOpciones {

    private VistaDeOpciones miVista;

    public ControladorVistaOpciones(VistaDeOpciones miVista) {
        this.miVista = miVista;

        this.miVista.jmenuItemSalir(new manejadorDeEventos());
        this.miVista.jmenuItemVerPrestamos(new manejadorDeEventos());
        this.miVista.jmenuItemIngresarEquipos(new manejadorDeEventos());
        this.miVista.jmenuItemModificarEquipos(new manejadorDeEventos());

    }

    class manejadorDeEventos implements ActionListener {

        VistaIngresoDeEquipo IngresoEquipo = null;

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equalsIgnoreCase("INGRESAR EQUIPO")) {
                if (IngresoEquipo == null) {
                    IngresoEquipo = new VistaIngresoDeEquipo();
                    miVista.addJDesktopPane(IngresoEquipo);

                }

                IngresoEquipo.setVisible(true);
//                VistaIngresoDeEquipo miVistaInsertarEquipo = new VistaIngresoDeEquipo();
//                miVista.addJDesktopPane(miVistaInsertarEquipo);
            }

            if (e.getActionCommand().equalsIgnoreCase("REALIZAR PRESTAMO")) {
                VistasPrestamos miVistaPrestamos = new VistasPrestamos();
                miVista.addJDesktopPane(miVistaPrestamos);
            }
            if (e.getActionCommand().equalsIgnoreCase("EXIT")) {
                System.exit(0);
            }

        }

    }

}
