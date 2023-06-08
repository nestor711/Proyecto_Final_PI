/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author daniel
 */
public class VistaHacerPrestamo extends JInternalFrame{
    
    private JLabel lblNombreEquipo;
    private JLabel lblUbicacionEquipo;
    private JLabel lblFechaSalida;
    private JLabel lblFechaRetorno;
    
    
    private JTextField txtNombreEquipo;
    private JTextField txtUbicacionEquipo;
    private JTextField txtFechaSalida;
    private JTextField txtFechaRetorno;
    
    
    private JButton btnIngresar;
    private JButton btnCancelar;
    
    private Container miContenedor;

    public VistaHacerPrestamo() {
        
        inicializadorDeMetodos();
        setVisible(true);
        setSize(950, 400);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("HACER PRESTAMO");
        
        setIconifiable(true);
        setClosable(true);
        
    }
    
    public void inicializadorDeMetodos(){
    
        lblNombreEquipo= new JLabel("Nombre del Equipo :");
        lblNombreEquipo.setBounds(50, 50, 300, 40);
        lblNombreEquipo.setOpaque(true);
        lblNombreEquipo.setBackground(Color.LIGHT_GRAY);
        lblNombreEquipo.setHorizontalAlignment(JLabel.CENTER);
        lblNombreEquipo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNombreEquipo=new JTextField(10);
        txtNombreEquipo.setBounds(500, 50, 300, 40);
        txtNombreEquipo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblUbicacionEquipo= new JLabel("Ubicacion del Equipo :");
        lblUbicacionEquipo.setBounds(50, 110, 300, 40);
        lblUbicacionEquipo.setOpaque(true);
        lblUbicacionEquipo.setBackground(Color.LIGHT_GRAY);
        lblUbicacionEquipo.setHorizontalAlignment(JLabel.CENTER);
        lblUbicacionEquipo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtUbicacionEquipo=new JTextField(10);
        txtUbicacionEquipo.setBounds(500, 110, 300, 40);
        txtUbicacionEquipo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblFechaSalida= new JLabel("Fecha de Salida del Equipo :");
        lblFechaSalida.setBounds(50, 170, 300, 40);
        lblFechaSalida.setOpaque(true);
        lblFechaSalida.setBackground(Color.LIGHT_GRAY);
        lblFechaSalida.setHorizontalAlignment(JLabel.CENTER);
        lblFechaSalida.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtFechaSalida=new JTextField(10);
        txtFechaSalida.setBounds(500, 170, 300, 40);
        txtFechaSalida.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        
        lblFechaRetorno= new JLabel("Fecha de Retorno del Equipo :");
        lblFechaRetorno.setBounds(50, 230, 300, 40);
        lblFechaRetorno.setOpaque(true);
        lblFechaRetorno.setBackground(Color.LIGHT_GRAY);
        lblFechaRetorno.setHorizontalAlignment(JLabel.CENTER);
        lblFechaRetorno.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtFechaRetorno=new JTextField(10);
        txtFechaRetorno.setBounds(500, 230, 300, 40);
        txtFechaRetorno.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(90, 310, 300, 40);
        
        btnIngresar= new JButton("REALIZAR PRESTAMO");
        btnIngresar.setBounds(460, 310, 300, 40);
        
        miContenedor=getContentPane();
        miContenedor.setLayout(null);
        miContenedor.add(lblNombreEquipo);
        miContenedor.add(lblUbicacionEquipo);
        miContenedor.add(lblFechaSalida);
        miContenedor.add(lblFechaRetorno);
        
        miContenedor.add(btnCancelar);
        miContenedor.add(txtNombreEquipo);
        miContenedor.add(txtUbicacionEquipo);
        miContenedor.add(txtFechaSalida);
        miContenedor.add(txtFechaRetorno);
        
        miContenedor.add(btnIngresar);
       
        
        
    }
    
}
