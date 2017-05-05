/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.ParSkija;
import domen.TipSkija;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DBUtil;

/**
 *
 * @author Nadja
 */
public class DBBroker {

    private static DBBroker instanca;
    private Connection connection;

    private DBBroker() {
        try {
            DBUtil dbUtil = new DBUtil();
            String url = dbUtil.vratiURL();
            String username = dbUtil.vratiKorisnika();
            String password = dbUtil.vratiSifru();
            connection = DriverManager.getConnection(url, username, password);
        } catch (IOException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DBBroker vratiBrokera() {
        if (instanca == null) {
            instanca = new DBBroker();
        }
        return instanca;
    }

    public void kreirajParSkija(ParSkija ps) {
        try {
            String sql = "INSERT INTO parskija VALUES (?,?,?,?,?)";
            PreparedStatement p = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            p.setInt(1, ps.getParSkijaID());
            p.setInt(2, ps.getDuzina());
            p.setDouble(3, ps.getRadijus());
            p.setString(4, ps.getVezovi());
            p.setString(5, ps.getTipSkija().getTipSkijaID());
            p.executeUpdate();
            ResultSet rs = p.getGeneratedKeys();
            int newId = -1;
            if (rs != null && rs.next()) {
                newId = rs.getInt(1);
                ps.setParSkijaID(newId);
            }
            p.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public LinkedList<TipSkija> vratiListuTipovaSkija() {
        LinkedList<TipSkija> lts = new LinkedList<>();
        String sql = "SELECT * FROM tipskija";
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String TipSkijaID = rs.getString("TipSkijaID");
                String NazivTipa = rs.getString("NazivTipa");
                TipSkija ts = new TipSkija(TipSkijaID, NazivTipa);
                lts.add(ts);
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lts;

    }
    public LinkedList<ParSkija> vratiParoveIzBaze(){
        LinkedList<ParSkija> parovi = new LinkedList<>();
        LinkedList<TipSkija> ts = vratiListuTipovaSkija();
        String sql = "SELECT * FROM parskija";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {                
                int parSkija = rs.getInt("ParSkijaID");
                int duzina = rs.getInt("Duzina");
                double radijus = rs.getDouble("Radijus");
                String vezovi = rs.getString("Vezovi");
                String tipSkijaID = rs.getString("TipSkijaID");
                TipSkija t = new TipSkija();
                for (TipSkija t1 : ts) {
                    if(tipSkijaID.equals(t1.getTipSkijaID())){
                        t = t1;
                        break;
                    }
                }
                
                ParSkija ps = new ParSkija(parSkija, duzina, radijus, vezovi, t);
                parovi.add(ps);
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parovi;
    }

}
