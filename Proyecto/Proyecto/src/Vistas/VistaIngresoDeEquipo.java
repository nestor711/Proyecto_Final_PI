/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Eider
 */
public class VistaIngresoDeEquipo extends JInternalFrame{
    
    private JLabel lblNombreEquipo;
    private JLabel lblNombreResponsable;
    private JLabel lblFrecuenciaMantenimiento;
    private JLabel lblUltimoMantenimiento;
    private JLabel lblProximoMantenimiento;
    private JLabel lblUbicacionActual;
    private JLabel lblFechaDeCompra;
    
    private JTextField txtNombreEquipo;
    private JTextField txtNombreResponsable;
    private JTextField txtFrecuenciaMantenimiento;
    private JTextField txtUltimoMantenimiento;
    private JTextField txtProximoMantenimiento;
    private JTextField txtUbicacionActual;
    private JTextField txtFechaDeCompra;
    
    private JButton btnIngresar;
    private JButton btnCancelar;
    
    private Container miContenedor;

    public VistaIngresoDeEquipo() {
        inicializadorDeMetodos();
        setVisible(true);
        setSize(984, 638);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("INGRESO DE EQUIPO");
        
        setIconifiable(true);
        setClosable(true);
    }
    
    public void inicializadorDeMetodos(){
        
        
        
        
        lblNombreEquipo= new JLabel("NOMBRE O REFERENCIA DEL EQUIPO:");
        lblNombreEquipo.setBounds(50, 50, 300, 40);
        lblNombreEquipo.setOpaque(true);
        lblNombreEquipo.setBackground(Color.LIGHT_GRAY);
        lblNombreEquipo.setHorizontalAlignment(JLabel.CENTER);
        lblNombreEquipo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNombreEquipo=new JTextField(10);
        txtNombreEquipo.setBounds(500, 50, 300, 40);
        txtNombreEquipo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblNombreResponsable= new JLabel("NOMBRE DEL RESPONSABLE:");
        lblNombreResponsable.setBounds(50, 110, 300, 40);
        lblNombreResponsable.setOpaque(true);
        lblNombreResponsable.setBackground(Color.LIGHT_GRAY);
        lblNombreResponsable.setHorizontalAlignment(JLabel.CENTER);
        lblNombreResponsable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNombreResponsable=new JTextField(10);
        txtNombreResponsable.setBounds(500, 110, 300, 40);
        txtNombreResponsable.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        
        lblFrecuenciaMantenimiento= new JLabel("FRECUENCIA DE MANTENIMIENTO:");
        lblFrecuenciaMantenimiento.setBounds(50, 170, 300, 40);
        lblFrecuenciaMantenimiento.setOpaque(true);
        lblFrecuenciaMantenimiento.setBackground(Color.LIGHT_GRAY);
        lblFrecuenciaMantenimiento.setHorizontalAlignment(JLabel.CENTER);
        lblFrecuenciaMantenimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtFrecuenciaMantenimiento=new JTextField(10);
        txtFrecuenciaMantenimiento.setBounds(500, 170, 300, 40);
        txtFrecuenciaMantenimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblProximoMantenimiento= new JLabel("PROXIMO MANTENIMIENTO:");
        lblProximoMantenimiento.setBounds(50, 230, 300, 40);
        lblProximoMantenimiento.setOpaque(true);
        lblProximoMantenimiento.setBackground(Color.LIGHT_GRAY);
        lblProximoMantenimiento.setHorizontalAlignment(JLabel.CENTER);
        lblProximoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtProximoMantenimiento=new JTextField(10);
        txtProximoMantenimiento.setBounds(500, 230, 300, 40);
        txtProximoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblUltimoMantenimiento= new JLabel("ULTIMO MANTENIMIENTO:");
        lblUltimoMantenimiento.setBounds(50, 290, 300, 40);
        lblUltimoMantenimiento.setOpaque(true);
        lblUltimoMantenimiento.setBackground(Color.LIGHT_GRAY);
        lblUltimoMantenimiento.setHorizontalAlignment(JLabel.CENTER);
        lblUltimoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtUltimoMantenimiento=new JTextField(10);
        txtUltimoMantenimiento.setBounds(500, 290, 300, 40);
        txtUltimoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblUbicacionActual= new JLabel("UBICACION ACTUAL:");
        lblUbicacionActual.setBounds(50, 350, 300, 40);
        lblUbicacionActual.setOpaque(true);
        lblUbicacionActual.setBackground(Color.LIGHT_GRAY);
        lblUbicacionActual.setHorizontalAlignment(JLabel.CENTER);
        lblUbicacionActual.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtUbicacionActual=new JTextField(10);
        txtUbicacionActual.setBounds(500, 350, 300, 40);
        txtUbicacionActual.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblFechaDeCompra= new JLabel("FECHA DE COMPRA:");
        lblFechaDeCompra.setBounds(50, 410, 300, 40);
        lblFechaDeCompra.setOpaque(true);
        lblFechaDeCompra.setBackground(Color.LIGHT_GRAY);
        lblFechaDeCompra.setHorizontalAlignment(JLabel.CENTER);
        lblFechaDeCompra.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtFechaDeCompra=new JTextField(10);
        txtFechaDeCompra.setBounds(500, 410, 300, 40);
        txtFechaDeCompra.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(50, 470, 300, 40);
        
        btnIngresar= new JButton("INGRESAR EQUIPO");
        btnIngresar.setBounds(500, 470, 300, 40);
        
        miContenedor=getContentPane();
        miContenedor.setLayout(null);
        miContenedor.add(lblNombreEquipo);
        miContenedor.add(lblNombreResponsable);
        miContenedor.add(lblFrecuenciaMantenimiento);
        miContenedor.add(lblProximoMantenimiento);
        miContenedor.add(lblUltimoMantenimiento);
        miContenedor.add(lblUbicacionActual);
        miContenedor.add(lblFechaDeCompra);
        miContenedor.add(btnCancelar);
        miContenedor.add(txtNombreEquipo);
        miContenedor.add(txtFechaDeCompra);
        miContenedor.add(txtFrecuenciaMantenimiento);
        miContenedor.add(txtNombreResponsable);
        miContenedor.add(txtProximoMantenimiento);
        miContenedor.add(txtUbicacionActual);
        miContenedor.add(txtUltimoMantenimiento);
        miContenedor.add(btnIngresar);
        
        
        
    }
    
    
}
