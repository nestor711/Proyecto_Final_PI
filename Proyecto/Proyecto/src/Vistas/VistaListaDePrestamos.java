/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;


import javax.swing.*;

/**
 *
 * @author Eider
 */
public class VistaListaDePrestamos extends JInternalFrame {
    private JTextArea txtListaDePrestamos;
    private JScrollPane jsPanel;
    private JScrollPane jsPanel2;
   

    public VistaListaDePrestamos() {
        inicializador();
        setVisible(true);
        setSize(984, 638);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("LISTADO DE PRESTAMOS REALIZADOS");
        setIconifiable(true);
        setClosable(true);
    }
    
    
    public void inicializador(){
        
        
        jsPanel2 = new JScrollPane();
        jsPanel = new JScrollPane();
        txtListaDePrestamos = new JTextArea();
        
        txtListaDePrestamos.setColumns(20);
        txtListaDePrestamos.setRows(5);
        jsPanel.setViewportView(txtListaDePrestamos);

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
