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
public class StavkaRezervacijeOpreme {
    private String rezervacijaID;
    private int redniBrojStavke;

    public StavkaRezervacijeOpreme(String rezervacijaID, int redniBrojStavke) {
        this.rezervacijaID = rezervacijaID;
        this.redniBrojStavke = redniBrojStavke;
    }

    public String getRezervacijaID() {
        return rezervacijaID;
    }

    public void setRezervacijaID(String rezervacijaID) {
        this.rezervacijaID = rezervacijaID;
    }

    public int getRedniBrojStavke() {
        return redniBrojStavke;
    }

    public void setRedniBrojStavke(int redniBrojStavke) {
        this.redniBrojStavke = redniBrojStavke;
    }
    
    
}
