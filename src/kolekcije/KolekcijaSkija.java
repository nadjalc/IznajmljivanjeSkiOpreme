/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcije;

import domen.ParSkija;
import java.util.LinkedList;

/**
 *
 * @author Nadja
 */
public class KolekcijaSkija {
    
    private LinkedList<ParSkija> ls;
    
    public KolekcijaSkija() {
        ls = new LinkedList<>();
    }
    public void sacuvajParSkija(ParSkija ps){
        ls.add(ps);
    }
    public LinkedList<ParSkija> vratiSkije(){
        return ls;
    }
}
