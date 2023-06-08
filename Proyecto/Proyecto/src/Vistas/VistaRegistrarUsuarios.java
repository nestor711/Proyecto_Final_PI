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
public class VistaRegistrarUsuarios extends JFrame {

    private JLabel lblNombreUsuario;
    private JLabel lblApellidoUsuario;
    private JLabel lblNickUsuario;
    private JLabel lblDomicilioUsuario;
    private JLabel lblPasswordUsuario;
    private JLabel lblTelefonoUsuario;
    private JLabel lblCorreoUsuario;
    private JLabel lblTipoUsuario;

    private JTextField txtNombreUsuario;
    private JTextField txtApellidoUsuario;
    private JTextField txtNickUsuario;
    private JTextField txtDomicilioUsuario;
    private JTextField txtPasswordUsuario;
    private JTextField txtTelefonoUsuario;
    private JTextField txtCorreoUsuario;
    private JTextField txtTipoUsuario;

    private JButton btnRegistrar;
    private JButton btnCancelar;

    private Container miContenedor;

    public VistaRegistrarUsuarios() {
        inicializadorDeMetodos();
        setTitle("REGISTRO DE USUARIOS");
        setVisible(true);
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBackground(Color.CYAN);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("Univalle.png");
        setIconImage(miIcono);

        setLocationRelativeTo(null);

    }

    public void inicializadorDeMetodos() {

        lblNombreUsuario = new JLabel("NOMBRE DEL USUARIO:");
        lblNombreUsuario.setBounds(50, 50, 300, 40);
        lblNombreUsuario.setOpaque(true);
        lblNombreUsuario.setBackground(Color.LIGHT_GRAY);
        lblNombreUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNombreUsuario = new JTextField(10);
        txtNombreUsuario.setBounds(500, 50, 300, 40);
        txtNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblApellidoUsuario = new JLabel("APELLIDO DEL USUARIO:");
        lblApellidoUsuario.setBounds(50, 110, 300, 40);
        lblApellidoUsuario.setOpaque(true);
        lblApellidoUsuario.setBackground(Color.LIGHT_GRAY);
        lblApellidoUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblApellidoUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtApellidoUsuario = new JTextField(10);
        txtApellidoUsuario.setBounds(500, 110, 300, 40);
        txtApellidoUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblNickUsuario = new JLabel("NICK DEL USUARIO:");
        lblNickUsuario.setBounds(50, 170, 300, 40);
        lblNickUsuario.setOpaque(true);
        lblNickUsuario.setBackground(Color.LIGHT_GRAY);
        lblNickUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblNickUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtNickUsuario = new JTextField(10);
        txtNickUsuario.setBounds(500, 170, 300, 40);
        txtNickUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblDomicilioUsuario = new JLabel("DOMICILIO DEL USUARIO:");
        lblDomicilioUsuario.setBounds(50, 230, 300, 40);
        lblDomicilioUsuario.setOpaque(true);
        lblDomicilioUsuario.setBackground(Color.LIGHT_GRAY);
        lblDomicilioUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblDomicilioUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtDomicilioUsuario = new JTextField(10);
        txtDomicilioUsuario.setBounds(500, 230, 300, 40);
        txtDomicilioUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblPasswordUsuario = new JLabel("CONTRASEÑA DEL USUARIO:");
        lblPasswordUsuario.setBounds(50, 290, 300, 40);
        lblPasswordUsuario.setOpaque(true);
        lblPasswordUsuario.setBackground(Color.LIGHT_GRAY);
        lblPasswordUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblPasswordUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtPasswordUsuario = new JTextField(10);
        txtPasswordUsuario.setBounds(500, 290, 300, 40);
        txtPasswordUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblTelefonoUsuario = new JLabel("TELEFONO DEL USUARIO:");
        lblTelefonoUsuario.setBounds(50, 350, 300, 40);
        lblTelefonoUsuario.setOpaque(true);
        lblTelefonoUsuario.setBackground(Color.LIGHT_GRAY);
        lblTelefonoUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblTelefonoUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtTelefonoUsuario = new JTextField(10);
        txtTelefonoUsuario.setBounds(500, 350, 300, 40);
        txtTelefonoUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblCorreoUsuario = new JLabel("CORREO DEL USUARIO:");
        lblCorreoUsuario.setBounds(50, 410, 300, 40);
        lblCorreoUsuario.setOpaque(true);
        lblCorreoUsuario.setBackground(Color.LIGHT_GRAY);
        lblCorreoUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblCorreoUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtCorreoUsuario = new JTextField(10);
        txtCorreoUsuario.setBounds(500, 410, 300, 40);
        txtCorreoUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        lblTipoUsuario = new JLabel("TIPO DE USUARIO:");
        lblTipoUsuario.setBounds(50, 470, 300, 40);
        lblTipoUsuario.setOpaque(true);
        lblTipoUsuario.setBackground(Color.LIGHT_GRAY);
        lblTipoUsuario.setHorizontalAlignment(JLabel.CENTER);
        lblTipoUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtTipoUsuario = new JTextField(10);
        txtTipoUsuario.setBounds(500, 470, 300, 40);
        txtTipoUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(50, 530, 300, 40);

        btnRegistrar = new JButton("REGISTRAR USUARIO");
        btnRegistrar.setBounds(500, 530, 300, 40);

        miContenedor = getContentPane();
        miContenedor.setLayout(null);
        miContenedor.add(lblNombreUsuario);
        miContenedor.add(lblApellidoUsuario);
        miContenedor.add(lblNickUsuario);
        miContenedor.add(lblDomicilioUsuario);
        miContenedor.add(lblPasswordUsuario);
        miContenedor.add(lblTelefonoUsuario);
        miContenedor.add(lblCorreoUsuario);
        miContenedor.add(lblTipoUsuario);
        miContenedor.add(btnCancelar);
        
        miContenedor.add(txtNombreUsuario);
        miContenedor.add(txtApellidoUsuario);
        miContenedor.add(txtNickUsuario);
        miContenedor.add(txtDomicilioUsuario);
        miContenedor.add(txtPasswordUsuario);
        miContenedor.add(txtTelefonoUsuario);
        miContenedor.add(txtCorreoUsuario);
        miContenedor.add(txtTipoUsuario);
        miContenedor.add(btnRegistrar);

    }

}
