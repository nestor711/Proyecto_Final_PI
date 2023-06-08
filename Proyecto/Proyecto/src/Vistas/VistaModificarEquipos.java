/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class VistaModificarEquipos extends JInternalFrame {

    private JLabel lblNuevoNombreEquipo;
    private JLabel lblNuevoNombreResponsable;
    private JLabel lblNuevaFrecuenciaMantenimiento;
    private JLabel lblNuevoUltimoMantenimiento;
    private JLabel lblNuevoProximoMantenimiento;
    private JLabel lblNuevaUbicacionActual;

    private JTextField txtNuevoNombreEquipo;
    private JTextField txtNuevoNombreResponsable;
    private JTextField txtNuevaFrecuenciaMantenimiento;
    private JTextField txtNuevoUltimoMantenimiento;
    private JTextField txtNuevoProximoMantenimiento;
    private JTextField txtNuevaUbicacionActual;

    private JButton btnModidicar;
    private JButton btnCancelar;

    private Container miContenedor;

    public VistaModificarEquipos() {

        inicializadorDeMetodos();
        setVisible(true);
        setSize(984, 638);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("MODIFICAR EQUIPO");

        setIconifiable(true);
        setClosable(true);

    }

    public void inicializadorDeMetodos() {

        lblNuevoNombreEquipo = new JLabel("NUEVO NOMBRE O REFERENCIA DEL EQUIPO:");
        lblNuevoNombreEquipo.setBounds(50, 50, 300, 40);
        lblNuevoNombreEquipo.setOpaque(true);
        lblNuevoNombreEquipo.setBackground(Color.cyan);
        lblNuevoNombreEquipo.setHorizontalAlignment(JLabel.CENTER);
        lblNuevoNombreEquipo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNuevoNombreEquipo = new JTextField(10);
        txtNuevoNombreEquipo.setBounds(500, 50, 300, 40);
        txtNuevoNombreEquipo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblNuevoNombreResponsable = new JLabel("NUEVO NOMBRE DEL RESPONSABLE:");
        lblNuevoNombreResponsable.setBounds(50, 110, 300, 40);
        lblNuevoNombreResponsable.setOpaque(true);
        lblNuevoNombreResponsable.setBackground(Color.cyan);
        lblNuevoNombreResponsable.setHorizontalAlignment(JLabel.CENTER);
        lblNuevoNombreResponsable.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNuevoNombreResponsable = new JTextField(10);
        txtNuevoNombreResponsable.setBounds(500, 110, 300, 40);
        txtNuevoNombreResponsable.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblNuevaFrecuenciaMantenimiento = new JLabel("NUEVA FRECUENCIA DE MANTENIMIENTO:");
        lblNuevaFrecuenciaMantenimiento.setBounds(50, 170, 300, 40);
        lblNuevaFrecuenciaMantenimiento.setOpaque(true);
        lblNuevaFrecuenciaMantenimiento.setBackground(Color.cyan);
        lblNuevaFrecuenciaMantenimiento.setHorizontalAlignment(JLabel.CENTER);
        lblNuevaFrecuenciaMantenimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNuevaFrecuenciaMantenimiento = new JTextField(10);
        txtNuevaFrecuenciaMantenimiento.setBounds(500, 170, 300, 40);
        txtNuevaFrecuenciaMantenimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblNuevoProximoMantenimiento = new JLabel("NUEVO PROXIMO MANTENIMIENTO:");
        lblNuevoProximoMantenimiento.setBounds(50, 230, 300, 40);
        lblNuevoProximoMantenimiento.setOpaque(true);
        lblNuevoProximoMantenimiento.setBackground(Color.cyan);
        lblNuevoProximoMantenimiento.setHorizontalAlignment(JLabel.CENTER);
        lblNuevoProximoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNuevoProximoMantenimiento = new JTextField(10);
        txtNuevoProximoMantenimiento.setBounds(500, 230, 300, 40);
        txtNuevoProximoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblNuevoUltimoMantenimiento = new JLabel("NUEVO ULTIMO MANTENIMIENTO:");
        lblNuevoUltimoMantenimiento.setBounds(50, 290, 300, 40);
        lblNuevoUltimoMantenimiento.setOpaque(true);
        lblNuevoUltimoMantenimiento.setBackground(Color.cyan);
        lblNuevoUltimoMantenimiento.setHorizontalAlignment(JLabel.CENTER);
        lblNuevoUltimoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNuevoUltimoMantenimiento = new JTextField(10);
        txtNuevoUltimoMantenimiento.setBounds(500, 290, 300, 40);
        txtNuevoUltimoMantenimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblNuevaUbicacionActual = new JLabel("NUEVA UBICACION ACTUAL:");
        lblNuevaUbicacionActual.setBounds(50, 350, 300, 40);
        lblNuevaUbicacionActual.setOpaque(true);
        lblNuevaUbicacionActual.setBackground(Color.cyan);
        lblNuevaUbicacionActual.setHorizontalAlignment(JLabel.CENTER);
        lblNuevaUbicacionActual.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNuevaUbicacionActual = new JTextField(10);
        txtNuevaUbicacionActual.setBounds(500, 350, 300, 40);
        txtNuevaUbicacionActual.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(50, 410, 300, 40);
        
        btnModidicar= new JButton("MODIFICAR");
        btnModidicar.setBounds(500, 410, 300, 40);
        
        miContenedor=getContentPane();
        miContenedor.setLayout(null);
        miContenedor.add(lblNuevoNombreEquipo);
        miContenedor.add(lblNuevoNombreResponsable);
        miContenedor.add(lblNuevaFrecuenciaMantenimiento);
        miContenedor.add(lblNuevoProximoMantenimiento);
        miContenedor.add(lblNuevoUltimoMantenimiento);
        miContenedor.add(lblNuevaUbicacionActual);
        miContenedor.add(btnCancelar);
        
        miContenedor.add(txtNuevoNombreEquipo);
        miContenedor.add(txtNuevaFrecuenciaMantenimiento);
        miContenedor.add(txtNuevoNombreResponsable);
        miContenedor.add(txtNuevoProximoMantenimiento);
        miContenedor.add(txtNuevaUbicacionActual);
        miContenedor.add(txtNuevoUltimoMantenimiento);
        miContenedor.add(btnModidicar);
    }

}
