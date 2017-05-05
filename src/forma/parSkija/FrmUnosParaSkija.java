/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.parSkija;

import db.DBBroker;
import domen.ParSkija;
import domen.TipSkija;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import poslovnaLogika.Kontroler;

/**
 *
 * @author Nadja
 */
public class FrmUnosParaSkija extends javax.swing.JDialog {

    public FrmUnosParaSkija(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediFormu();
    }

    public FrmUnosParaSkija(JDialog parent, boolean modal, ParSkija ps) {
        super(parent, modal);
        initComponents();
        srediFormu();
        popuniPolja(ps);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDuzina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRadijus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldVezovi = new javax.swing.JTextField();
        jButtonUnos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Par skija ID");

        jTextFieldID.setEditable(false);
        jTextFieldID.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Dužina skija");

        jLabel3.setText("Radijus");

        jLabel4.setText("Vezovi");

        jButtonUnos.setText("Unesi par skija");
        jButtonUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnosActionPerformed(evt);
            }
        });

        jLabel5.setText("Tip skija");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jButtonUnos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldID)
                    .addComponent(jTextFieldDuzina)
                    .addComponent(jTextFieldRadijus)
                    .addComponent(jTextFieldVezovi, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDuzina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldRadijus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldVezovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButtonUnos)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnosActionPerformed
        try {
//            int parSkijaID = Integer.parseInt(jTextFieldID.getText().trim());
            int duzina = Integer.parseInt(jTextFieldDuzina.getText().trim());
            double radijus = Double.parseDouble(jTextFieldRadijus.getText().trim());
            String vezovi = jTextFieldVezovi.getText().trim();
            TipSkija tipSkija = (TipSkija) jComboBox1.getSelectedItem();

            ParSkija ps = new ParSkija(0, duzina, radijus, vezovi, tipSkija);
            Kontroler.getInstance().sacuvajParSkija(ps);
            JOptionPane.showMessageDialog(this, "Par skija je sacuvan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Par skija nije sacuvan " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonUnosActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUnos;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDuzina;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldRadijus;
    private javax.swing.JTextField jTextFieldVezovi;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        jComboBox1.removeAllItems();
        try {
            System.out.println("Dobacanje kontrolera");
            Kontroler kon = Kontroler.getInstance();
            System.out.println("Ocitavanje liste skija");
            LinkedList<TipSkija> lts = Kontroler.getInstance().vratiListuTipovaSkija();
            System.out.println("Proslo ucitavanje liste skija");
            for (TipSkija lt : lts) {
                jComboBox1.addItem(lt);
            }
                    System.out.println(lts.size());

        } catch (SQLException ex) {
            Logger.getLogger(FrmUnosParaSkija.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void popuniPolja(ParSkija ps) {
        jTextFieldID.setText(Integer.toString(ps.getParSkijaID()));
        jTextFieldDuzina.setText(Integer.toString(ps.getDuzina()));
        jTextFieldRadijus.setText(Double.toString(ps.getRadijus()));
        jTextFieldVezovi.setText(ps.getVezovi());
        jComboBox1.setSelectedItem(ps.getTipSkija());

    }
}
