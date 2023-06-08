/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Eider
 */
public class VistaIngresoDeUsuario extends JFrame {
    
    public void botonIngresar(ActionListener miAction){
        btnIngresar.addActionListener(miAction);
    }
    
    public void botonRegistrar(ActionListener miAction){
        btnRegistrarse.addActionListener(miAction);
    }
    

    
    private JLabel lblUsuario;
    private JLabel lblContrasena;
    
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    
    private JButton btnIngresar;
    private JButton btnRegistrarse;
    
    
    
    private Container miContenedor;
    


public VistaIngresoDeUsuario() {
    
    setTitle("INFORMACION Y DISTRIBUCION DE EQUIPOS");
    setVisible(true);
    inicializadorDeMetodos();
    setSize(460,420);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Toolkit miPantalla= Toolkit.getDefaultToolkit();
    Image miIcono= miPantalla.getImage("Univalle.png");
    setIconImage(miIcono);
    
}
    

public void inicializadorDeMetodos(){

    
    
    lblUsuario = new JLabel("USUARIO:");
    lblUsuario.setOpaque(true);
    lblUsuario.setBackground(Color.LIGHT_GRAY);
    lblUsuario.setHorizontalAlignment(JLabel.CENTER);
    lblUsuario.setBounds(20, 150, 120, 30);
    
    
    lblContrasena = new JLabel("CONTRASEÑA:");
    lblContrasena.setOpaque(true);
    lblContrasena.setBackground(Color.LIGHT_GRAY);
    lblContrasena.setHorizontalAlignment(JLabel.CENTER);
    lblContrasena.setBounds(20, 200, 120, 30);
    
    
    txtUsuario= new JTextField(10);
    txtUsuario.setBounds(180, 150, 240, 30);
    
    
    txtContrasena= new JPasswordField(10);
    txtContrasena.setBounds(180, 200, 240, 30);
    
    btnIngresar= new JButton("INGRESAR");
    btnIngresar.setBounds(120, 270, 200, 30);
    
    
    btnRegistrarse= new JButton("REGISTRARSE");
    btnRegistrarse.setBounds(120, 310, 200, 30);
    
    miContenedor=getContentPane();
    miContenedor.setLayout(null);
    miContenedor.setBackground(Color.CYAN);
    

    miContenedor.add(lblUsuario);
    miContenedor.add(lblContrasena);
    miContenedor.add(txtContrasena);
    miContenedor.add(txtUsuario);
    miContenedor.add(btnIngresar);
    miContenedor.add(btnRegistrarse);
    
   

}


}