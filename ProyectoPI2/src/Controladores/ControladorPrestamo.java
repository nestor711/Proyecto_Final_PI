/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Modelos.Equipo;
import Modelos.EquipoDAO;
import Modelos.Prestamo;
import Modelos.PrestamoDAO;
import Vistas.VistaIngresoDeEquipo;
import Vistas.VistasPrestamos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eider
 */
public class ControladorPrestamo {
    
    private PrestamoDAO modelo;
    private EquipoDAO modeloEquipo;
    private VistasPrestamos miVista;
    private VistaIngresoDeEquipo vistaEquipo;
    
    
    
    private JTable tblEquipoDispo;
    private JTable tblPrestamo;
    
    private JTextField txtNombre;
    private JTextField txtUbiActual;
    
 
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextArea jTextEstado;
    private javax.swing.JTextArea jTextActividad;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextSalida;
    private javax.swing.JTextField jTextRetorno;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextPrestamo;

    public ControladorPrestamo(EquipoDAO modeloEquipo,PrestamoDAO modelo, VistasPrestamos miVista, VistaIngresoDeEquipo vistaEquipo) {
        this.modeloEquipo = modeloEquipo;
        this.modelo = modelo;
        this.miVista = miVista;
        this.vistaEquipo = vistaEquipo;
        
        
        
        ArrayList<Equipo> listadoeqipos;
        listadoeqipos = this.modeloEquipo.listadoEquiposDisponible("0");
        
        txtNombre = this.vistaEquipo.nombre();
        txtUbiActual = this.vistaEquipo.UbiActual();
        
        tblEquipoDispo = this.miVista.tblEquipos();
        tblEquipoDispo.addMouseListener(new ProgramaMouseListener());
        cargarProgramas(listadoeqipos);
        
        
        
        ArrayList<Prestamo> listadoprestamos;
        listadoprestamos = this.modelo.listadoPrestamo("0");
        
        tblPrestamo= this.miVista.tblPrestamos();
        tblPrestamo.addMouseListener(new ProgramaMouseListenerPrestamo());
        cargarPrestamos(listadoprestamos);
        
        
        
     
        
        jButton1= this.miVista.btnCanc();
        jButton2= this.miVista.btnPrestamo();
        jTextEstado= this.miVista.txtEstado();
        jTextActividad= this.miVista.txtActividades();
        jTextNombre= this.miVista.txtResponsable();
        jTextSalida= this.miVista.txtfechaSalida();
        jTextRetorno= this.miVista.txtfechaRetorno();
        jTextDestino= this.miVista.txtLugarDestino();
        jTextPrestamo= this.miVista.txtEquipo();
        
        
        jButton1.addActionListener(new PrestamoListener());
        jButton2.addActionListener(new PrestamoListener());
        
    }

   public class PrestamoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equalsIgnoreCase("REALIZAR PRESTAMO")) {
                
                registrar();               
                tblPrestamo.updateUI();               
                
                
                
            }
            if (e.getActionCommand().equalsIgnoreCase("CANCELAR")) {
                limpiar();
            }
        }

    }
   

   
   
  
    
   private void limpiar(){
        
        jTextEstado.setText("");
        jTextActividad.setText("");
        jTextNombre.setText("");
        jTextSalida.setText("");
        jTextRetorno.setText("");
        jTextDestino.setText("");
        
   }
    
    private void limpiarListadoTabla(){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblEquipoDispo.getModel();
        tableModelo.getDataVector().removeAllElements();
    }
    
    
    public void cargarProgramas(ArrayList<Equipo> listadoEquipos){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblEquipoDispo.getModel();        
        limpiarListadoTabla();
        for(int i= 0; i < listadoEquipos.size(); i++){
              tableModelo.addRow(new Object[]{
              listadoEquipos.get(i).getCodigoEquipo(),
              listadoEquipos.get(i).getUbicacionActual()});
        }
    }
    
    
    class ProgramaMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel tableModelo;
            tableModelo = (DefaultTableModel) tblEquipoDispo.getModel();

            if(tblEquipoDispo.getSelectedRow()==-1){
                if(tblEquipoDispo.getRowCount()==0){
                    JOptionPane.showMessageDialog(null,"No hay registros");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Seleccione una fila");
                }
            }else {                               
                jTextPrestamo.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 0).toString());                       
            }
        }
        
    }
    
    
    private void registrar() {

        if (jTextNombre.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el nombre del responable",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (jTextSalida.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese la fecha de salida",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (jTextRetorno.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese la fecha de retorno",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (jTextDestino.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el lugar de destino",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (jTextEstado.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el estado del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (jTextActividad.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese las actividades a realizar",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (jTextPrestamo.getText().trim().equals("")) {
            miVista.gestionMensajes("Seleccione un equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }else {
            

            Prestamo prestamo = new Prestamo();
            prestamo.setUnEquipo(jTextPrestamo.getText());
            prestamo.setNombreResponsable(jTextNombre.getText());
            prestamo.setFechaSalida(jTextSalida.getText());
            prestamo.setFechaRetorno(jTextRetorno.getText());
            prestamo.setLugarDestion(jTextDestino.getText());
            prestamo.setEstadoEquipo(jTextEstado.getText());
            prestamo.setActividades(jTextActividad.getText());

            int tamaño;
            tamaño = modelo.listadoPrestamo(prestamo.getNombreResponsable()).size();

            if (tamaño == 0) {
                int resultado = 0;
                resultado = modelo.grabarPrestamo(prestamo);
                if (resultado == 1) {
                    miVista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Prestamo> listadop;
                    listadop = modelo.listadoPrestamo("0");

                } else {
                    miVista.gestionMensajes("Error al grabar",
                            "Confirmación", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                miVista.gestionMensajes("Codigo ya está registrado",
                        "Confirmación",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }
        
    
    private void limpiarListadoPrestamo(){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblPrestamo.getModel();
        tableModelo.getDataVector().removeAllElements();
    }
    
    public void cargarPrestamos(ArrayList<Prestamo> listadoPrestamos) {
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblPrestamo.getModel();
        limpiarListadoPrestamo();
        for (int i = 0; i < listadoPrestamos.size(); i++) {
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
        
    class ProgramaMouseListenerPrestamo extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel tableModelo;
            tableModelo = (DefaultTableModel) tblPrestamo.getModel();

            if(tblPrestamo.getSelectedRow()==-1){
                if(tblPrestamo.getRowCount()==0){
                    JOptionPane.showMessageDialog(null,"No hay registros");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Seleccione una fila");
                }
            }else {                               
                jTextPrestamo.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 0).toString());            
                jTextNombre.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 1).toString());
                jTextSalida.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 2).toString());
                jTextRetorno.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 3).toString());
                jTextDestino.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 4).toString());
                jTextEstado.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 5).toString());
                jTextActividad.setText(tableModelo.getValueAt(
                        tblEquipoDispo.getSelectedRow(), 6).toString());
            }
        }
        
    }
    
}
