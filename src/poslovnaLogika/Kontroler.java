/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poslovnaLogika;
import domen.ParSkija;
import java.util.LinkedList;
import kolekcije.KolekcijaSkija;

/**
 *
 * @author Nadja
 */
public class Kontroler {
    private KolekcijaSkija ks;
    private static Kontroler instance;
    
    private Kontroler(){
        ks = new KolekcijaSkija();
    }
    
     public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public void sacuvajParSkija(ParSkija ps) {
        ks.sacuvajParSkija(ps);
    }
    
    public LinkedList<ParSkija> vratiSkije() {
        return ks.vratiSkije();
    }
    
}
