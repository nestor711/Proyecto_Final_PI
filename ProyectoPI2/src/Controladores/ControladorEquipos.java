/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.*;
import Vistas.VistaIngresoDeEquipo;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eider
 */
public class ControladorEquipos {

    
    private EquipoDAO modelo;
    private VistaIngresoDeEquipo miVista;

    private JTextField txtNombre;
    private JTextField txtResponsable;
    private JTextField txtFreMantenimiento;
    private JTextField txtUltMantenimiento;
    private JTextField txtProxMantenimiento;
    private JTextField txtUbiActual;
    private JTextField txtFecCompra;
    private JTextArea txtEstado;

    private JButton btnNuevo;
    private JButton btnLimpiar;
    private JButton btnBorrar;
    private JButton btnModificar;
    private JButton btnSalir;

    private JTable tblEquipo;

    public ControladorEquipos(EquipoDAO modelo, VistaIngresoDeEquipo miVista) {
        this.modelo = modelo;
        this.miVista = miVista;
        
        
        ArrayList<Equipo> listadoeqipos;
        listadoeqipos = this.modelo.listadoEquipos("0");
        
        txtNombre = this.miVista.nombre();
        txtResponsable = this.miVista.responsable();
        txtFreMantenimiento = this.miVista.frecuenciaMantenimiento();
        txtUltMantenimiento = this.miVista.ultimoMantenimiento();
        txtProxMantenimiento = this.miVista.ProxMantenimiento();
        txtUbiActual = this.miVista.UbiActual();
        txtFecCompra = this.miVista.FecCompra();
        txtEstado = this.miVista.estado();

        btnNuevo = this.miVista.botonNuevo();
        btnLimpiar = this.miVista.botonLimpiar();
        btnBorrar = this.miVista.botonBorrar();
        btnSalir = this.miVista.botonSalir();
        btnModificar = this.miVista.botonModificar();
        
        
        tblEquipo = this.miVista.modelTblEquipo();

        btnLimpiar.addActionListener(new EquipoListener());
        btnNuevo.addActionListener(new EquipoListener());
        btnBorrar.addActionListener(new EquipoListener());
        btnSalir.addActionListener(new EquipoListener());
        btnModificar.addActionListener(new EquipoListener());
        
        
        tblEquipo.addMouseListener(new ProgramaMouseListener());
        cargarProgramas(listadoeqipos);

    }


    public class EquipoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equalsIgnoreCase("NUEVO")) {
                registrar();     
                tblEquipo.updateUI();
            }
            if (e.getActionCommand().equalsIgnoreCase("BORRAR")) {
                borrar();
            }
            if (e.getActionCommand().equalsIgnoreCase("MODIFICAR")) {
                actualizar();
            }
            if (e.getActionCommand().equalsIgnoreCase("LIMPIAR")) {
                limpiar();
            }
            if (e.getActionCommand().equalsIgnoreCase("SALIR")) {
                cerrarAction();
            }
        }

    }
    
    private void actualizar(){
            
            Equipo equipo = new Equipo();
             
            
            equipo.setCodigoEquipo(txtNombre.getText().trim());
            equipo.setResponsable(txtResponsable.getText());
            equipo.setFrecuenciaMantenimiento(txtFreMantenimiento.getText());
            equipo.setUltimoMantenimiento(txtUltMantenimiento.getText());
            equipo.setProximoMantenimiento(txtProxMantenimiento.getText());
            equipo.setUbicacionActual(txtUbiActual.getText());
            equipo.setFechaCompra(txtFecCompra.getText());
            equipo.setEstado(txtEstado.getText());     
                         
            if(modelo.modificarEquipo(equipo) == 1){
                miVista.gestionMensajes(
                        "Actualización exitosa",
                        "Confirmación ", 
                        JOptionPane.INFORMATION_MESSAGE);
                                        
                
                ArrayList<Equipo> listadoequipos; 
                listadoequipos = modelo.listadoEquipos("0");
                cargarProgramas(listadoequipos);           
            } else {
                miVista.gestionMensajes(
                        "Actualización Falida",
                        "Confirmación ", 
                        JOptionPane.ERROR_MESSAGE);                 
            }              
        } 
    
    public void cerrarAction(){
        miVista.dispose();
    } 
    
    private void limpiar(){
        
        txtEstado.setText("");
        txtFecCompra.setText("");
        txtFreMantenimiento.setText("");
        txtNombre.setText("");
        txtProxMantenimiento.setText("");
        txtResponsable.setText("");
        txtUbiActual.setText("");
        txtUltMantenimiento.setText("");
        
        
    }

    
    private void registrar() {

        if (txtNombre.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el identificador del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtResponsable.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el nombre del responsable del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtFreMantenimiento.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese la frecuencia de mantenimiento del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtUltMantenimiento.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el ultimo mantenimiendo del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtProxMantenimiento.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el proximo mantenimiento del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtUbiActual.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese la ubicacion actual del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtFecCompra.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese la fecha de compra del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);

        } else if (txtEstado.getText().trim().equals("")) {
            miVista.gestionMensajes("Ingrese el estado  del equipo",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } else {

            Equipo equipo = new Equipo();
            equipo.setCodigoEquipo(txtNombre.getText());
            equipo.setResponsable(txtResponsable.getText());
            equipo.setFrecuenciaMantenimiento(txtFreMantenimiento.getText());
            equipo.setUltimoMantenimiento(txtUltMantenimiento.getText());
            equipo.setProximoMantenimiento(txtProxMantenimiento.getText());
            equipo.setUbicacionActual(txtUbiActual.getText());
            equipo.setFechaCompra(txtFecCompra.getText());
            equipo.setEstado(txtEstado.getText());

            

            int tamaño;
            tamaño = modelo.listadoEquipos(equipo.getCodigoEquipo()).size();

            if (tamaño == 0) {
                int resultado = 0;
                resultado = modelo.grabarEquipo(equipo);
                if (resultado == 1) {
                    miVista.gestionMensajes("Registro Grabado con éxito",
                            "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                    ArrayList<Equipo> listadoEquipo;
                    listadoEquipo = modelo.listadoEquipos("0");

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
    
    private void limpiarListadoTabla(){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblEquipo.getModel();
        tableModelo.getDataVector().removeAllElements();
    }
    
    
    public void cargarProgramas(ArrayList<Equipo> listadoEquipos){
        DefaultTableModel tableModelo;
        tableModelo = (DefaultTableModel) tblEquipo.getModel();        
        limpiarListadoTabla();
        for(int i= 0; i < listadoEquipos.size(); i++){
              tableModelo.addRow(new Object[]{
              listadoEquipos.get(i).getCodigoEquipo(),
              listadoEquipos.get(i).getResponsable(),
              listadoEquipos.get(i).getFrecuenciaMantenimiento(),
              listadoEquipos.get(i).getUltimoMantenimiento(),
              listadoEquipos.get(i).getProximoMantenimiento(),
              listadoEquipos.get(i).getUbicacionActual(),
              listadoEquipos.get(i).getFechaCompra(),
              listadoEquipos.get(i).getEstado()});
        }
    }
    
    class ProgramaMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            DefaultTableModel tableModelo;
            tableModelo = (DefaultTableModel) tblEquipo.getModel();

            if(tblEquipo.getSelectedRow()==-1){
                if(tblEquipo.getRowCount()==0){
                    JOptionPane.showMessageDialog(null,"No hay registros");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Seleccione una fila");
                }
            }else {                               
                txtNombre.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 0).toString());            
                txtResponsable.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 1).toString());
                txtFreMantenimiento.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 2).toString());
                txtUltMantenimiento.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 3).toString());
                txtProxMantenimiento.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 4).toString());
                txtUbiActual.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 5).toString());
                txtFecCompra.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 6).toString());
                txtEstado.setText(tableModelo.getValueAt(
                        tblEquipo.getSelectedRow(), 7).toString());
                
            }
        }
    }
    
    private void borrar(){
            String codigo = "";
            codigo  = txtNombre.getText().trim();
            
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

                    if(modelo.borrarEquipo(codigo) ==  1){
                        JOptionPane.showMessageDialog(null, 
                                "Registro Borrado con éxtio", 
                                "Confirmación de acción", 
                                JOptionPane.INFORMATION_MESSAGE);                    
                       
                        ArrayList<Equipo> listadoequipo; 
                        listadoequipo = modelo.listadoEquipos("0");
                        cargarProgramas(listadoequipo);
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
