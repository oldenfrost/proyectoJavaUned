/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc
 */
public class Historial extends javax.swing.JPanel {

    /**
     * Creates new form historial
     */
    public Historial() {

        initComponents();
        modeloHistorial = new DefaultTableModel();
        modeloHistorial.addColumn("Id");
        modeloHistorial.addColumn("Nombre Completo");
        modeloHistorial.addColumn("Puesto");
        modeloHistorial.addColumn("Salario Bruto");
        modeloHistorial.addColumn("Salario Neto");
        modeloHistorial.addColumn("Deducciones");

        tablaHistorial.setModel(modeloHistorial);
        actualizarTabla(historialCalculados);
        salarios.SalarioMayor();
        salarios.SalarioMenor();
        salarios.Promedio();
        salarios.sumaSalarios();
        salarios.sumaReducciones();
        llenadoDeDatos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPs = new javax.swing.JLabel();
        textSM = new javax.swing.JLabel();
        textSm = new javax.swing.JLabel();
        textSTS = new javax.swing.JLabel();
        textSTD = new javax.swing.JLabel();
        pS = new javax.swing.JLabel();
        sMa = new javax.swing.JLabel();
        sMe = new javax.swing.JLabel();
        sS = new javax.swing.JLabel();
        sD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();

        setBackground(new java.awt.Color(231, 236, 239));
        setMaximumSize(new java.awt.Dimension(750, 461));
        setMinimumSize(new java.awt.Dimension(750, 461));
        setPreferredSize(new java.awt.Dimension(750, 461));

        textPs.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textPs.setForeground(new java.awt.Color(39, 76, 119));
        textPs.setText("Promedio de los Salarios");

        textSM.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textSM.setForeground(new java.awt.Color(39, 76, 119));
        textSM.setText("Salario Mayor");

        textSm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textSm.setForeground(new java.awt.Color(39, 76, 119));
        textSm.setText("Salario Menor");

        textSTS.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textSTS.setForeground(new java.awt.Color(39, 76, 119));
        textSTS.setText("Suma de todos los Salarios");

        textSTD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textSTD.setForeground(new java.awt.Color(39, 76, 119));
        textSTD.setText("Suma de todas las Deducciones");

        pS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pS.setForeground(new java.awt.Color(139, 140, 137));
        pS.setText("₡0");
        pS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 76, 119)));

        sMa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sMa.setForeground(new java.awt.Color(139, 140, 137));
        sMa.setText("₡0");
        sMa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 76, 119)));

        sMe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sMe.setForeground(new java.awt.Color(139, 140, 137));
        sMe.setText("₡0");
        sMe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 76, 119)));

        sS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sS.setForeground(new java.awt.Color(139, 140, 137));
        sS.setText("₡0");
        sS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 76, 119)));

        sD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sD.setForeground(new java.awt.Color(139, 140, 137));
        sD.setText("₡0");
        sD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 76, 119)));

        tablaHistorial.setBackground(new java.awt.Color(231, 236, 239));
        tablaHistorial.setForeground(new java.awt.Color(39, 76, 119));
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablaHistorial.setCellSelectionEnabled(true);
        tablaHistorial.setEnabled(false);
        tablaHistorial.setGridColor(new java.awt.Color(39, 76, 119));
        tablaHistorial.setShowGrid(true);
        jScrollPane1.setViewportView(tablaHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textSTD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sD, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sMe, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textPs)
                                .addComponent(textSM)
                                .addComponent(textSm)
                                .addComponent(textSTS))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sMa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(sS, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPs)
                    .addComponent(pS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSM)
                    .addComponent(sMa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSm)
                    .addComponent(sMe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSTS)
                    .addComponent(sS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSTD)
                    .addComponent(sD))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents
// metodos
// ACTUALIZA LA TABLA
    public void actualizarTabla(ArrayList<CSalarioDeduccionesVoluntarias> historialCalculados) {
        modeloHistorial.setRowCount(0);
        for (int i = 0; i < historialCalculados.size(); i++) {
            modeloHistorial.addRow(new Object[]{historialCalculados.get(i).getId(), historialCalculados.get(i).getNombre(), historialCalculados.get(i).getPuesto(), "₡ " + objDF.format(historialCalculados.get(i).getSalarioBruto()), "₡ " + objDF.format(historialCalculados.get(i).getSalarioNeto()), "₡ " + objDF.format(historialCalculados.get(i).getRebajos())});

        }
    }
// LLENA LOS VALORES DE MAYOR MENOR,ETC
    private void llenadoDeDatos() {

        pS.setText("₡ " + objDF.format(salarios.getPromedio()));
        pS.setForeground(azulOscuro);

        sMa.setText("₡ " + objDF.format(salarios.getSalarioMayor()));
        sMa.setForeground(azulOscuro);

        sMe.setText("₡ " + objDF.format(salarios.getSalarioMenor()));
        sMe.setForeground(azulOscuro);

        sS.setText("₡ " + objDF.format(salarios.getSumaSalario()));
        sS.setForeground(azulOscuro);

        sD.setText("₡ " + objDF.format(salarios.getSumaReducciones()));
        sD.setForeground(azulOscuro);
    }

//atributos
    static ArrayList<CSalarioDeduccionesVoluntarias> historialCalculados = new ArrayList<CSalarioDeduccionesVoluntarias>();
    private DefaultTableModel modeloHistorial;
    private CSalarios salarios = new CSalarios();
    private Color azulOscuro = new Color(39, 76, 119);
    private String patron = "###,###.##";
    private DecimalFormat objDF = new DecimalFormat(patron);


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pS;
    private javax.swing.JLabel sD;
    private javax.swing.JLabel sMa;
    private javax.swing.JLabel sMe;
    private javax.swing.JLabel sS;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JLabel textPs;
    private javax.swing.JLabel textSM;
    private javax.swing.JLabel textSTD;
    private javax.swing.JLabel textSTS;
    private javax.swing.JLabel textSm;
    // End of variables declaration//GEN-END:variables
}
