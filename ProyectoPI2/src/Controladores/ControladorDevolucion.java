/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Prestamo;
import Modelos.PrestamoDAO;
import Vistas.VistaDevolucionPrestamo;
import Vistas.VistasPrestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eider
 */
public class ControladorDevolucion {
    
    private VistaDevolucionPrestamo miVista;
    private VistasPrestamos miVistaTxt;
    private PrestamoDAO modelo;

    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnSalir;
    
    private JTable tblDevolucion;
    
    private javax.swing.JTextArea jTextEstado;
    private javax.swing.JTextArea jTextActividad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextSalida;
    private javax.swing.JTextField jTextRetorno;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextPrestamo;
    private javax.swing.JTextField jTextBusquedad;
    
    public ControladorDevolucion(VistaDevolucionPrestamo miVista,VistasPrestamos miVistaTxt, PrestamoDAO modelo) {
        this.miVista = miVista;
        this.miVistaTxt = miVistaTxt;
        this.modelo = modelo;
        
        
        ArrayList<Prestamo> listadoprestamos;
        listadoprestamos = this.modelo.listadoPrestamo("0");
        
        btnBuscar = this.miVista.botonBuscar();
        btnCancelar = this.miVista.botonCancelar();
        btnDevolver = this.miVista.botonDevolver();
        btnSalir = this.miVista.botonSalir();
        jTextBusquedad = this.miVista.txtDevol();
        
        tblDevolucion = this.miVista.tablaDevo();
        tblDevolucion.addMouseListener(new ProgramaMouseListener());
        cargarPrestamos(listadoprestamos);
        
        jTextEstado= this.miVistaTxt.txtEstado();
        jTextActividad= this.miVistaTxt.txtActividades();
        jTextNombre= this.miVistaTxt.txtResponsable();
        jTextSalida= this.miVistaTxt.txtfechaSalida();
        jTextRetorno= this.miVistaTxt.txtfechaRetorno();
        jTextDestino= this.miVistaTxt.txtLugarDestino();
        jTextPrestamo= this.miVistaTxt.txtEquipo();
        
        
        btnCancelar.addActionListener(new PrestamoListener());
        btnBuscar.addActionListener(new PrestamoListener());
        btnDevolver.addActionListener(new PrestamoListener());
        btnSalir.addActionListener(new PrestamoListener());
    }
    
    public class PrestamoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equalsIgnoreCase("BUSCAR")) {
                
            }
            if (e.getActionCommand().equalsIgnoreCase("DEVOLVER PRESTAMO")) {
                borrar();
            }
            if (e.getActionCommand().equalsIgnoreCase("CANCELAR")) {
                limpiar();
            }
            if (e.getActionCommand().equalsIgnoreCase("SALIR")) {
                cerrarAction();
            }
        }

    }
    
    public void cerrarAction(){
        miVista.dispose();
    } 
    
    private void limpiar(){
        
        jTextBusquedad.setText("");
        
    }
    
    private void limpiarListadoTabla(){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblDevolucion.getModel();
        tableModelo.getDataVector().removeAllElements();
    }
    
    
    public void cargarPrestamos(ArrayList<Prestamo> listadoPrestamos){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblDevolucion.getModel();        
        limpiarListadoTabla();
        for(int i= 0; i < listadoPrestamos.size(); i++){
              tableModelo.addRow(new Object[]{
              listadoPrestamos.get(i).getUnEquipo(),
              listadoPrestamos.get(i).getNombreResponsable(),
              listadoPrestamos.get(i).getFechaSalida(),
              listadoPrestamos.get(i).getFechaRetorno(),
              listadoPrestamos.get(i).getLugarDestion(),
              listadoPrestamos.get(i).getEstadoEquipo(),
              listadoPrestamos.get(i).getActividades()});
        }
    }
    
    class ProgramaMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel tableModelo;
            tableModelo = (DefaultTableModel) tblDevolucion.getModel();

            if(tblDevolucion.getSelectedRow()==-1){
                if(tblDevolucion.getRowCount()==0){
                    JOptionPane.showMessageDialog(null,"No hay registros");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Seleccione una fila");
                }
            }else {                               
                jTextBusquedad.setText(tableModelo.getValueAt(
                        tblDevolucion.getSelectedRow(), 0).toString());            
                
                
                
            }
        }
    }
    
    private void borrar(){
            String codigo = "";
            codigo  = jTextBusquedad.getText().trim();
            
            if(codigo.isEmpty()){
                 miVista.gestionMensajes(
                         "Por favor seleccione un equipo de la tabla",
                         "Mensaje de Advertencia ", 
                    JOptionPane.ERROR_MESSAGE);
            }else{
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "¿Desea Eliminar el equipo de nombre o codigo : " +
                        codigo + " ?", 
                        "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
                
                if(respuesta == JOptionPane.YES_OPTION){                    

                    if(modelo.borrarPrestamo(codigo) ==  1){
                        JOptionPane.showMessageDialog(null, 
                                "Registro Borrado con éxtio", 
                                "Confirmación de acción", 
                                JOptionPane.INFORMATION_MESSAGE);                    
                       
                        ArrayList<Prestamo> listadop; 
                        listadop = modelo.listadoPrestamo("0");
                        cargarPrestamos(listadop);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, 
                                "Error al borrar",
                                "Confirmación de acción", 
                                JOptionPane.ERROR_MESSAGE);                    
                    }
                }
            }
        }
}
