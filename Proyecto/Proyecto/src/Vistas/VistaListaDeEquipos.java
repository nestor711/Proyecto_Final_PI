/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Eider
 */
public class VistaListaDeEquipos extends JInternalFrame{
    
    private JTextArea txtListaDeEquipos;
    private JScrollPane jsPanel;
    private JScrollPane jsPanel2;
   

    public VistaListaDeEquipos() {
        inicializador();
        setVisible(true);
        setSize(984, 638);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("LISTADO DE EQUIPOS REGISTRADOS");
        setIconifiable(true);
        setClosable(true);
    }
    
    
    public void inicializador(){
        
        
        jsPanel2 = new JScrollPane();
        jsPanel = new JScrollPane();
        txtListaDeEquipos = new JTextArea();
        
        txtListaDeEquipos.setColumns(20);
        txtListaDeEquipos.setRows(5);
        jsPanel.setViewportView(txtListaDeEquipos);

        jsPanel2.setViewportView(jsPanel);
        
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }
    
    
    
}


  

        

        

        
        