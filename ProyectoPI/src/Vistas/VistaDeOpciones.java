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
public class VistaDeOpciones extends JFrame {

    public void jmenuItemSalir(ActionListener miAction) {
        jMenuItemExit.addActionListener(miAction);
    }

    public void jmenuItemIngresarEquipos(ActionListener miAction) {
        jMenuItemEquipos1.addActionListener(miAction);
    }
    
    public void jmenuItemModificarEquipos(ActionListener miAction){
        jMenuItemEquipos2.addActionListener(miAction);
    }


    public void jmenuItemVerPrestamos(ActionListener miAction) {
        jMenuItemPrestamos1.addActionListener(miAction);
    }

    public void addJDesktopPane(Component view) {
        jDesktopPane.add(view);
    }

    private JDesktopPane jDesktopPane;

    private JMenu jMenuEquipos;
    private JMenu jMenuPrestamos;
    private JMenu jMenuFile;

    private JMenuBar jMenuBar;
    private JMenuItem jMenuItemExit;
    private JMenuItem jMenuItemEquipos1;
    private JMenuItem jMenuItemEquipos2;

    private JMenuItem jMenuItemPrestamos1;
    
    

    public VistaDeOpciones() {

        inicializador();
        setTitle("INFORMACION Y DISTRIBUCION DE EQUIPOS");
        setVisible(true);
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBackground(Color.CYAN);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("Univalle.png");
        setIconImage(miIcono);

        setLocationRelativeTo(null);
    }

    public void inicializador() {

        jDesktopPane = new JDesktopPane();

        jMenuBar = new JMenuBar();

        jMenuFile = new JMenu();
        jMenuFile.setText("FILE");
        jMenuItemExit = new JMenuItem();
        jMenuItemExit.setText("EXIT");
        jMenuFile.add(jMenuItemExit);

        jMenuEquipos = new JMenu();
        jMenuEquipos.setText("EQUIPOS");
        jMenuItemEquipos1 = new JMenuItem();
        jMenuItemEquipos1.setText("INGRESAR EQUIPO");
        jMenuItemEquipos2 = new JMenuItem();
        jMenuItemEquipos2.setText("MODIFICAR EQUIPO");
        jMenuEquipos.add(jMenuItemEquipos1);
        jMenuEquipos.add(jMenuItemEquipos2);
   

        jMenuPrestamos = new JMenu();
        jMenuPrestamos.setText("PRESTAMOS");
        jMenuItemPrestamos1 = new JMenuItem();
        jMenuItemPrestamos1.setText("REALIZAR PRESTAMO");
        
        jMenuPrestamos.add(jMenuItemPrestamos1);
        
        
    
        jMenuBar.add(jMenuEquipos);
        jMenuBar.add(jMenuPrestamos);
      
       
        jMenuBar.add(jMenuFile);

        setJMenuBar(jMenuBar);

        add(jDesktopPane);

    }

}
