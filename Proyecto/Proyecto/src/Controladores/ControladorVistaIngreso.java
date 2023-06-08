/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.VistaDeOpciones;
import Vistas.VistaIngresoDeUsuario;
import Vistas.VistaRegistrarUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Eider
 */
public class ControladorVistaIngreso {
    
    
    private VistaIngresoDeUsuario miVista;

    public ControladorVistaIngreso(VistaIngresoDeUsuario miVista) {
        this.miVista = miVista;
        
        controladorDeEventos miControlador= new controladorDeEventos();
        this.miVista.botonIngresar(miControlador);
        this.miVista.botonRegistrar(miControlador);
    }
    
    
    
    class controladorDeEventos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getActionCommand().equalsIgnoreCase("INGRESAR")){
                
                VistaDeOpciones vistaOpciones = new VistaDeOpciones();                
                ControladorVistaOpciones controladorOpciones = new ControladorVistaOpciones(vistaOpciones);
                miVista.dispose();
                
            }if(e.getActionCommand().equalsIgnoreCase("REGISTRARSE")){
                
                VistaRegistrarUsuarios vistaRegistro = new VistaRegistrarUsuarios();
                miVista.dispose();
                 
               
            }
            
            
        }
        
        
    
    }
    
    
}


