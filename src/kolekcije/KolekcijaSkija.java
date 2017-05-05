/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcije;

import domen.ParSkija;
import java.util.LinkedList;
import poslovnaLogika.Kontroler;

/**
 *
 * @author Nadja
 */
public class KolekcijaSkija {

    private LinkedList<ParSkija> ls;

    public KolekcijaSkija(LinkedList<ParSkija> ls) {
        this.ls = ls;
    }
    

    public KolekcijaSkija() {
        ls = Kontroler.getInstance().vratiParoveIzBaze();
    }

    
    public LinkedList<ParSkija> vratiSkije() {
        return ls;

    }

}
