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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author daniel
 */
public class VistaDevolucionEquipo extends JInternalFrame{
    
    private JLabel lblNombreEquipo;
    private JLabel lblEstadoEquipo;
    private JLabel lblObservacionesEquipo;
    
    private JTextField txtNombreEquipo;
    private JTextArea txtEstadoEquipo;
    private JTextArea txtObservacionesEquipo;
    
    private JButton btnRealizarDevolucion;
    
    private Container miContenedor;

    public VistaDevolucionEquipo() {
        
        inicializadorDeMetodos();
        setVisible(true);
        setSize(850, 350);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("DEVOLUCION DE EQUIPO");
        
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
        
        
        lblEstadoEquipo= new JLabel("Estado del Equipo :");
        lblEstadoEquipo.setBounds(50, 110, 300, 40);
        lblEstadoEquipo.setOpaque(true);
        lblEstadoEquipo.setBackground(Color.LIGHT_GRAY);
        lblEstadoEquipo.setHorizontalAlignment(JLabel.CENTER);
        lblEstadoEquipo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtEstadoEquipo=new JTextArea(10,10);
        txtEstadoEquipo.setBounds(500, 110, 300, 40);
        txtEstadoEquipo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        lblObservacionesEquipo= new JLabel("Observaciones del Equipo :");
        lblObservacionesEquipo.setBounds(50, 170, 300, 40);
        lblObservacionesEquipo.setOpaque(true);
        lblObservacionesEquipo.setBackground(Color.LIGHT_GRAY);
        lblObservacionesEquipo.setHorizontalAlignment(JLabel.CENTER);
        lblObservacionesEquipo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtObservacionesEquipo=new JTextArea(10,10);
        txtObservacionesEquipo.setBounds(500, 170, 300, 40);
        txtObservacionesEquipo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        
        btnRealizarDevolucion = new JButton("REALIZAR DEVOLUCION");
        btnRealizarDevolucion.setBounds(280, 250, 300, 40);
        
        miContenedor=getContentPane();
        miContenedor.setLayout(null);
        miContenedor.add(lblNombreEquipo);
        miContenedor.add(lblEstadoEquipo);
        miContenedor.add(lblObservacionesEquipo);
        
        
        miContenedor.add(txtNombreEquipo);
        miContenedor.add(txtEstadoEquipo);
        miContenedor.add(txtObservacionesEquipo);
        
        miContenedor.add(btnRealizarDevolucion);
    }
    
    
    
    
}
