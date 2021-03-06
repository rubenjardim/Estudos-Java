/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormConversorTemperatura.java
 *
 * Created on 06/06/2011, 21:44:29
 */
package Exercicio1ao5;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author LABCCET
 */
public class FormConversorTemperatura extends javax.swing.JFrame {

    /** Creates new form FormConversorTemperatura */
    public FormConversorTemperatura() {
        initComponents();
    }

    private void ConverterCelsiusParaFahrenheit() throws HeadlessException {
        String strCelsius = txtCelsius.getText();
        try {
            double celsius = Double.valueOf(strCelsius);
            double fahr = ConversorTemperatura.CelsiusToFahrenheit(celsius);
            String strfahr = String.valueOf(fahr);
            txtFahrenheit.setText(strfahr);
            //         txtFahrenheit.setText(
            //                 String.valueOf(
            //                 (ConversorTemperatura.CelciusToFahrenheit(
            //                 Double.valueOf(txtCelcius.getText())))));
            if (celsius < 10) {
                txtFahrenheit.setBackground(Color.CYAN);
            } else if (celsius < 30) {
                txtFahrenheit.setBackground(Color.GREEN);
            } else if (celsius < 40) {
                txtFahrenheit.setBackground(Color.YELLOW);
            } else {
                txtFahrenheit.setBackground(Color.RED);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entre um numero", "Conversor de Temperatura", JOptionPane.ERROR_MESSAGE);
            txtCelsius.requestFocus();                                                         //JOptionPane.INFORMATION_MESSAGE
        }
    }

    private void ConverterFahrenheitParaCelsius() throws HeadlessException {
        String strFahrenheit = txtFahrenheit.getText();
        try {
            double fahrenheit = Double.valueOf(strFahrenheit);
            double cel = ConversorTemperatura.FahrenheitToCelsius(fahrenheit);
            String strcel = String.valueOf(cel);
            txtCelsius.setText(strcel);
//            if (fahrenheit < 10) {
//                txtCelsius.setBackground(Color.CYAN);
//            } else if (fahrenheit < 30) {
//                txtCelsius.setBackground(Color.GREEN);
//            } else if (fahrenheit < 40) {
//                txtCelsius.setBackground(Color.YELLOW);
//            } else {
//                txtCelsius.setBackground(Color.RED);
//            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Entre um numero", "Conversor de Temperatura", JOptionPane.ERROR_MESSAGE);
            txtFahrenheit.requestFocus();                                                                    //JOptionPane.INFORMATIO_MESSAGE

       }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        MpMi = new javax.swing.JRadioButton();
        MipM = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo = new javax.swing.JTextField();
        resposta = new javax.swing.JTextField();
        btnConverte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnFahrenheit = new javax.swing.JButton();
        btnParaCelsius = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCelsius = new javax.swing.JTextField();
        txtFahrenheit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(MpMi);
        MpMi.setText("Metros para Milhas");

        buttonGroup1.add(MipM);
        MipM.setText("Milhas para Metros");

        jLabel3.setText("De:");

        jLabel4.setText("Para:");

        resposta.setEditable(false);

        btnConverte.setText("Converter");
        btnConverte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campo)
                            .addComponent(resposta, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MpMi)
                            .addComponent(MipM)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnConverte, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MpMi))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(MipM)))
                .addGap(34, 34, 34)
                .addComponent(btnConverte)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Conversor de Distância", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFahrenheit.setText("Para Fahrenheit");
        btnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitActionPerformed(evt);
            }
        });

        btnParaCelsius.setText("Para Celsius");
        btnParaCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaCelsiusActionPerformed(evt);
            }
        });

        jLabel1.setText("Celsius");

        jLabel2.setText("Fahrenheit");

        txtCelsius.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelsiusFocusLost(evt);
            }
        });

        txtFahrenheit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFahrenheitFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnParaCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFahrenheit))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParaCelsius)
                    .addComponent(jLabel2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Conversor Temperatura", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitActionPerformed
        ConverterCelsiusParaFahrenheit();

    }//GEN-LAST:event_btnFahrenheitActionPerformed

    private void btnParaCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaCelsiusActionPerformed
        ConverterFahrenheitParaCelsius();
    }//GEN-LAST:event_btnParaCelsiusActionPerformed

    private void txtCelsiusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelsiusFocusLost
        ConverterCelsiusParaFahrenheit();
    }//GEN-LAST:event_txtCelsiusFocusLost

    private void txtFahrenheitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFahrenheitFocusLost
        ConverterFahrenheitParaCelsius();
    }//GEN-LAST:event_txtFahrenheitFocusLost

    private void btnConverteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverteActionPerformed
       String strMedida = campo.getText();
       double medida = Double.valueOf(strMedida);

       double conversao = 0.0;// = ConversorDistancia.converteParaMetro(medida);
       String strConversao = null; //= String.valueOf(conversao);

       if(MpMi.isSelected() == true){
           conversao = ConversorDistancia.converteParaMilha(medida);
           strConversao = String.valueOf(conversao);
           resposta.setText(strConversao);
       }else{
              conversao = ConversorDistancia.converteParaMetro(medida);
              strConversao = String.valueOf(conversao);
              resposta.setText(strConversao);

       }
      

    }//GEN-LAST:event_btnConverteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormConversorTemperatura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MipM;
    private javax.swing.JRadioButton MpMi;
    private javax.swing.JButton btnConverte;
    private javax.swing.JButton btnFahrenheit;
    private javax.swing.JButton btnParaCelsius;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField resposta;
    private javax.swing.JTextField txtCelsius;
    private javax.swing.JTextField txtFahrenheit;
    // End of variables declaration//GEN-END:variables
}
