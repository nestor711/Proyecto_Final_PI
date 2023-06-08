/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.VistaDeOpciones;
import Vistas.VistaDevolucionEquipo;
import Vistas.VistaHacerPrestamo;
import Vistas.VistaIngresoDeEquipo;
import Vistas.VistaModificarEquipos;
import Vistas.VistaListaDeEquipos;
import Vistas.VistaListaDePrestamos;
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
        
        this.miVista.jmenuItemSalir(new manejadorDeEventos());
        this.miVista.jmenuItemVerEquipos(new manejadorDeEventos());
        this.miVista.jmenuItemVerPrestamos(new manejadorDeEventos());
        this.miVista.jmenuItemIngresarEquipos(new manejadorDeEventos());
        this.miVista.jmenuItemModificarEquipos(new manejadorDeEventos());
        this.miVista.jmenuItemHacerPrestamo(new manejadorDeEventos());
        this.miVista.jmenuItemDevolucionQuipo(new manejadorDeEventos());
      
        
    }
   
   
    class manejadorDeEventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            if(e.getActionCommand().equalsIgnoreCase("INGRESAR EQUIPO")){
                VistaIngresoDeEquipo miVistaInsertarEquipo = new VistaIngresoDeEquipo();
                miVista.addJDesktopPane(miVistaInsertarEquipo);
            }
            if(e.getActionCommand().equalsIgnoreCase("MODIFICAR EQUIPO")){
                VistaModificarEquipos miVistaModificarEquipos = new VistaModificarEquipos();
                miVista.addJDesktopPane(miVistaModificarEquipos);
            }
            if(e.getActionCommand().equalsIgnoreCase("VER EQUIPOS")){
                VistaListaDeEquipos miVistaEquipos = new VistaListaDeEquipos();
                miVista.addJDesktopPane(miVistaEquipos);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("REALIZAR PRESTAMO")){
                VistaHacerPrestamo miVistaHacerPrestamo = new VistaHacerPrestamo();
                miVista.addJDesktopPane(miVistaHacerPrestamo);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("DEVOLUCION DE EQUIPO")){
                VistaDevolucionEquipo miVistaDevolucion = new VistaDevolucionEquipo();
                miVista.addJDesktopPane(miVistaDevolucion);
            }
            
            if(e.getActionCommand().equalsIgnoreCase("VER PRESTAMOS")){
                VistaListaDePrestamos miVistaPrestamos = new VistaListaDePrestamos();
                miVista.addJDesktopPane(miVistaPrestamos);
            }
            if(e.getActionCommand().equalsIgnoreCase("EXIT")){
                System.exit(0);
            }
            
        }
        
    }
   
    
}
