/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Objects;

/**
 *
 * @author Nadja
 */
public class TipSkija {
    private String tipSkijaID;
    private String nazivTipa;

    public TipSkija() {
    }
    

    public TipSkija(String tipSkijaID, String nazivTipa) {
        this.tipSkijaID = tipSkijaID;
        this.nazivTipa = nazivTipa;
    }

    public String getTipSkijaID() {
        return tipSkijaID;
    }

    public void setTipSkijaID(String tipSkijaID) {
        this.tipSkijaID = tipSkijaID;
    }

    public String getNazivTipa() {
        return nazivTipa;
    }

    public void setNazivTipa(String nazivTipa) {
        this.nazivTipa = nazivTipa;
    }

    @Override
    public String toString() {
        return nazivTipa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.tipSkijaID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipSkija other = (TipSkija) obj;
        if (!Objects.equals(this.tipSkijaID, other.tipSkijaID)) {
            return false;
        }
        return true;
    }
    
    
}
