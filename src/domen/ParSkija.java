/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author Nadja
 */
public class ParSkija {
    private int parSkijaID;
    private int duzina;
    private double radijus;
    private String vezovi;
    private TipSkija tipSkija;

    public TipSkija getTipSkija() {
        return tipSkija;
    }

    public void setTipSkija(TipSkija tipSkija) {
        this.tipSkija = tipSkija;
    }

    public ParSkija() {
    }
    

    public ParSkija(int parSkijaID, int duzina, double radijus, String vezovi, TipSkija tipSkija) {
        this.parSkijaID = parSkijaID;
        this.duzina = duzina;
        this.radijus = radijus;
        this.vezovi = vezovi;
        this.tipSkija = tipSkija;
    }

    public int getParSkijaID() {
        return parSkijaID;
    }

    public void setParSkijaID(int parSkijaID) {
        this.parSkijaID = parSkijaID;
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public double getRadijus() {
        return radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;
    }

    public String getVezovi() {
        return vezovi;
    }

    public void setVezovi(String vezovi) {
        this.vezovi = vezovi;
    }
    
    
    
}
