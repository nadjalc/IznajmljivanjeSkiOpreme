/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poslovnaLogika;

import db.DBBroker;
import domen.ParSkija;
import domen.TipSkija;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Set;
import kolekcije.KolekcijaSkija;

/**
 *
 * @author Nadja
 */
public class Kontroler {

    private DBBroker dbBroker;
    private KolekcijaSkija ks;
    private static Kontroler instance;

    private Kontroler() {
        System.out.println("Kontroler konstruktor");
        dbBroker = DBBroker.vratiBrokera();
        ks = new KolekcijaSkija();
        ks.setLs(this.vratiParoveIzBaze());
        System.out.println("Kraj kontruktora kontrolera");
    }

    public static Kontroler getInstance() {
        if (instance == null) {
            System.out.println("Pravim kontrolera prvi put");
            instance = new Kontroler();
        }
        return instance;
    }

    public void sacuvajParSkija(ParSkija ps) throws SQLException {
        dbBroker.kreirajParSkija(ps);
    }

    public LinkedList<ParSkija> vratiSkije() {
        return ks.vratiSkije();
    }

    public LinkedList<TipSkija> vratiListuTipovaSkija() throws SQLException {
        return dbBroker.vratiListuTipovaSkija();
    }

    public LinkedList<ParSkija> vratiParoveIzBaze() {
        return dbBroker.vratiParoveIzBaze();
    }

    public KolekcijaSkija getKs() {
        return ks;
    }

}
