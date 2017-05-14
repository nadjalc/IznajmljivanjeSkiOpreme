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
import javax.jws.WebParam;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import poslovnaLogika.Kontroler;

/**
 *
 * @author Nadja
 */
public class FrmUnosParaSkija extends javax.swing.JDialog {

    public FrmUnosParaSkija(Frame parent, boolean modal, String mode) {
        super(parent, modal);
        initComponents();
        srediFormu(mode);
    }
    FrmPrikazParaSkija pf;

    public FrmUnosParaSkija(JDialog parent, boolean modal, ParSkija ps, String mode) {
        super(parent, modal);
        initComponents();
        srediFormu(mode);
        popuniPolja(ps);
        pf = (FrmPrikazParaSkija) parent;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDuzna = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRadijus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVezovi = new javax.swing.JTextField();
        btnUnos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbTipSkija = new javax.swing.JComboBox();
        btnIzmeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        lblMarka = new javax.swing.JLabel();
        txtMarka = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Podešavanje podataka o parovima skija");

        jLabel1.setText("Par skija ID");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel2.setText("Dužina skija");

        jLabel3.setText("Radijus");

        jLabel4.setText("Vezovi");

        btnUnos.setText("Unesi par skija");
        btnUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosActionPerformed(evt);
            }
        });

        jLabel5.setText("Tip skija");

        cmbTipSkija.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTipSkija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipSkijaActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni par skija");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši par skija");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lblMarka.setText("Marka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lblMarka))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRadijus)
                            .addComponent(txtDuzna)
                            .addComponent(txtID)
                            .addComponent(txtVezovi)
                            .addComponent(cmbTipSkija, 0, 378, Short.MAX_VALUE)
                            .addComponent(txtMarka)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnIzmeni)
                        .addGap(58, 58, 58)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnUnos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDuzna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRadijus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVezovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarka))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipSkija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addComponent(btnUnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeni)
                    .addComponent(btnObrisi))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da sacuvate par skija?", "Potvrda", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                int duzina = Integer.parseInt(txtDuzna.getText().trim());
                double radijus = Double.parseDouble(txtRadijus.getText().trim());
                String vezovi = txtVezovi.getText().trim();
                String marka = txtMarka.getText().trim();
                TipSkija tipSkija = (TipSkija) cmbTipSkija.getSelectedItem();

                ParSkija ps = new ParSkija(0, duzina, radijus, vezovi, marka, tipSkija);
                Kontroler.getInstance().obrisiSveIzBaze();
                Kontroler.getInstance().sacuvajParSkija(ps);
                LinkedList<ParSkija> sveSkije = Kontroler.getInstance().vratiSkije();
                Kontroler.getInstance().sacuvajSveSkije(sveSkije);
                JOptionPane.showMessageDialog(this, "Par skija je sacuvan");
                this.dispose();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Par skija nije sacuvan morate uneti broj za duzinu skija"
                        + " i broj koji moze biti u decimalnom formatu za radijus");
            } catch (SQLException ex) {
                Logger.getLogger(FrmUnosParaSkija.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnUnosActionPerformed

    private void cmbTipSkijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipSkijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipSkijaActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        // TODO add your handling code here:
        LinkedList<ParSkija> sveSkije = Kontroler.getInstance().vratiSkije();
        int result = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da obrisete par skija?", "Potvrda", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                int parSkijaID = Integer.parseInt(txtID.getText().trim());

                for (ParSkija parSkija : sveSkije) {
                    if (parSkija.getParSkijaID() == parSkijaID) {
                        pf.obrisi(parSkija);
                        //Kontroler.getInstance().obrisiIzListe(parSkija);
                        break;
                    }

                }
                Kontroler.getInstance().obrisiSveIzBaze();
                LinkedList<ParSkija> izmenjenSkije = Kontroler.getInstance().vratiSkije();
                Kontroler.getInstance().sacuvajSveSkije(izmenjenSkije);
                JOptionPane.showMessageDialog(this, "Par skija je uspesno obrisan");
                this.dispose();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Par skija nije sacuvan morate uneti broj za duzinu skija"
                        + " i broj koji moze biti u decimalnom formatu za radijus");
            }
        }


    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        // TODO add your handling code here:
        LinkedList<ParSkija> sveSkije = Kontroler.getInstance().vratiSkije();
        int result = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da napravite izmene?", "Potvrda", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            try {
                int parSkijaID = Integer.parseInt(txtID.getText().trim());
                int duzina = Integer.parseInt(txtDuzna.getText().trim());
                double radijus = Double.parseDouble(txtRadijus.getText().trim());
                String vezovi = txtVezovi.getText().trim();
                String marka = txtMarka.getText().trim();
                TipSkija tipSkija = (TipSkija) cmbTipSkija.getSelectedItem();

                ParSkija parS = new ParSkija(parSkijaID, duzina, radijus, vezovi, marka, tipSkija);
                for (ParSkija ps : sveSkije) {
                    if (ps.getParSkijaID() == parSkijaID) {
                        Kontroler.getInstance().obrisiIzListe(ps);
                        break;
                    }
                }
                Kontroler.getInstance().obrisiSveIzBaze();
                pf.sacuvaj(parS);
                //Kontroler.getInstance().sacuvajParSkija(parS);
                LinkedList<ParSkija> izmenjenSkije = Kontroler.getInstance().vratiSkije();
                Kontroler.getInstance().sacuvajSveSkije(izmenjenSkije);
                JOptionPane.showMessageDialog(this, "Par skija je uspesno izmenjen");
                this.dispose();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Par skija nije sacuvan morate uneti broj za duzinu skija"
                        + " i broj koji moze biti u decimalnom formatu za radijus");
            } catch (SQLException ex) {
                Logger.getLogger(FrmUnosParaSkija.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnUnos;
    private javax.swing.JComboBox cmbTipSkija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMarka;
    private javax.swing.JTextField txtDuzna;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarka;
    private javax.swing.JTextField txtRadijus;
    private javax.swing.JTextField txtVezovi;
    // End of variables declaration//GEN-END:variables

    private void srediFormu(String mode) {
        cmbTipSkija.removeAllItems();
        try {
            System.out.println("Dobacanje kontrolera");
            Kontroler kon = Kontroler.getInstance();
            System.out.println("Ocitavanje liste skija");
            LinkedList<TipSkija> lts = Kontroler.getInstance().vratiListuTipovaSkija();
            System.out.println("Proslo ucitavanje liste skija");
            for (TipSkija lt : lts) {
                cmbTipSkija.addItem(lt);
            }

            String status = mode;
            if (status.equals("unos")) {
                btnUnos.setVisible(true);
                btnIzmeni.setVisible(false);
                btnObrisi.setVisible(false);
            } else if (status.equals("izmene")) {
                btnUnos.setVisible(false);
                btnIzmeni.setVisible(true);
                btnObrisi.setVisible(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FrmUnosParaSkija.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void popuniPolja(ParSkija ps) {
        txtID.setText(Integer.toString(ps.getParSkijaID()));
        txtDuzna.setText(Integer.toString(ps.getDuzina()));
        txtRadijus.setText(Double.toString(ps.getRadijus()));
        txtVezovi.setText(ps.getVezovi());
        txtMarka.setText(ps.getMarka());
        cmbTipSkija.setSelectedItem(ps.getTipSkija());

    }
}
