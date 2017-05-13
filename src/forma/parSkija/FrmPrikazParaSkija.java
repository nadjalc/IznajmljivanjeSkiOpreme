/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forma.parSkija;

import domen.ParSkija;
import forme.modelPrikaz.Model;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import kolekcije.KolekcijaSkija;
import poslovnaLogika.Kontroler;

/**
 *
 * @author Nadja
 */
public class FrmPrikazParaSkija extends javax.swing.JDialog {

    /** Creates new form FrmPrikazParaSkija */
    public FrmPrikazParaSkija(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediFormu();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrikaz = new javax.swing.JTable();
        btnDetalji = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prikaz svih parova skija");

        jTablePrikaz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePrikaz);

        btnDetalji.setText("Detalji");
        btnDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaljiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetalji)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetalji)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaljiActionPerformed
        // TODO add your handling code here:
        try{
        int selected = jTablePrikaz.getSelectedRow();
        Model model = (Model) jTablePrikaz.getModel();
        ParSkija ps = model.getParSkija(selected);
        FrmUnosParaSkija f = new FrmUnosParaSkija(this, true, ps, "izmene");
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Niste izabrali par skija", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDetaljiActionPerformed

    /**
     * @param args the command line arguments
     */
    private void srediFormu() {
       Model m = new Model();
       jTablePrikaz.setModel(m);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalji;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrikaz;
    // End of variables declaration//GEN-END:variables

    void obrisi(ParSkija parSkija) {
        Kontroler.getInstance().obrisiIzListe(parSkija);
        Model m = (Model) jTablePrikaz.getModel();
        m.fireTableDataChanged();
    }

    void sacuvaj(ParSkija parS) throws SQLException {
        Kontroler.getInstance().sacuvajParSkija(parS);
        Model m = (Model) jTablePrikaz.getModel();
        m.fireTableDataChanged();
    }

   

}
