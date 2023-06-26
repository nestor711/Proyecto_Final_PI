/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;



import Modelos.EquipoDAO;
import Modelos.PrestamoDAO;
import Vistas.VistaDeOpciones;
import Vistas.VistaDevolucionPrestamo;
import Vistas.VistaIngresoDeEquipo;
import Vistas.VistasPrestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Eider
 */
public class ControladorVistaOpciones {

    private VistaDeOpciones miVista;

    public ControladorVistaOpciones(VistaDeOpciones miVista) {
        this.miVista = miVista;

        //this.miVista.jmenuItemSalir(new manejadorDeEventos());
        this.miVista.jmenuItemVerPrestamos(new manejadorDeEventos());
        this.miVista.jmenuItemIngresarEquipos(new manejadorDeEventos());
        this.miVista.jmenuItemSalir(new manejadorDeEventos());
        this.miVista.jmenuItemDevolver(new manejadorDeEventos());

    }

    class manejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equalsIgnoreCase("EQUIPOS")) {
                
                VistaIngresoDeEquipo miVistaEquipo = new VistaIngresoDeEquipo();
                EquipoDAO unEquipo = new EquipoDAO();
                ControladorEquipos miControlador = new ControladorEquipos(unEquipo, miVistaEquipo);
                miVista.addJDesktopPane(miVistaEquipo);
            }

            if (e.getActionCommand().equalsIgnoreCase("PRESTAMOS")) {
                
                VistasPrestamos miVistaPrestamos = new VistasPrestamos();
                VistaIngresoDeEquipo miVistaEquipo = new VistaIngresoDeEquipo();
                EquipoDAO miEquipo= new EquipoDAO();
                PrestamoDAO miPrestamo = new PrestamoDAO();
                
                ControladorPrestamo miConrolador = new ControladorPrestamo(miEquipo, miPrestamo, miVistaPrestamos, miVistaEquipo);
                
                miVista.addJDesktopPane(miVistaPrestamos);
                
               
            }
            if (e.getActionCommand().equalsIgnoreCase("DEVOLVER PRESTAMOS")) {
                
                PrestamoDAO miPrestamo = new PrestamoDAO();
                VistaDevolucionPrestamo miVistaDevolucion = new VistaDevolucionPrestamo();
                VistasPrestamos miVistaTxt = new VistasPrestamos();
                ControladorDevolucion miControlador= new ControladorDevolucion(miVistaDevolucion, miVistaTxt, miPrestamo);
                miVista.addJDesktopPane(miVistaDevolucion);
            }
            if (e.getActionCommand().equalsIgnoreCase("SALIR")) {
                System.exit(0);
            }

        }

    }

}
