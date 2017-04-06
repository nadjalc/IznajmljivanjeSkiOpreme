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
import util.DBUtil;

/**
 *
 * @author Nadja
 */
public class DBBroker {

    private static DBBroker instanca;
    private Connection connection;

    public DBBroker(){
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
    
       public static DBBroker vratiBrokera(){
        if(instanca == null){

            instanca = new DBBroker();
        }
        return instanca;
    }
       
       public void kreirajParSkija(ParSkija ps) throws SQLException{
           String sql = "INSERT INTO parskija VALUES (?,?,?,?,?)";
           PreparedStatement p  =  connection.prepareStatement(sql);
           p.setString(1, ps.getParSkijaID());
           p.setInt(2, ps.getDuzina());
           p.setDouble(3, ps.getRadijus());
           p.setString(4, ps.getVezovi());
           p.setString(5, ps.getTipSkija().getTipSkijaID());
           p.executeUpdate();
           p.close();
       }

    public LinkedList<TipSkija> vratiListuTipovaSkija() throws SQLException {
        LinkedList<TipSkija> lts = new LinkedList<>();
        String sql = "SELECT * FROM tipskija";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String TipSkijaID = rs.getString("TipSkijaID");
            String NazivTipa = rs.getString("NazivTipa");
            TipSkija ts = new TipSkija(TipSkijaID, NazivTipa);
            lts.add(ts);
        }
        st.close();
        return lts;
        
    }
  

}
