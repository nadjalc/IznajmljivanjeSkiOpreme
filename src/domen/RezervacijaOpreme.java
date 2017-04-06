/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Date;

/**
 *
 * @author Nadja
 */
public class RezervacijaOpreme {
    private String rezervacijaID;
    private Date datumRezervacije;
    private boolean uplataUnapred;

    public RezervacijaOpreme(String rezervacijaID, Date datumRezervacije, boolean uplataUnapred) {
        this.rezervacijaID = rezervacijaID;
        this.datumRezervacije = datumRezervacije;
        this.uplataUnapred = uplataUnapred;
    }

    public String getRezervacijaID() {
        return rezervacijaID;
    }

    public void setRezervacijaID(String rezervacijaID) {
        this.rezervacijaID = rezervacijaID;
    }

    public Date getDatumRezervacije() {
        return datumRezervacije;
    }

    public void setDatumRezervacije(Date datumRezervacije) {
        this.datumRezervacije = datumRezervacije;
    }

    public boolean isUplataUnapred() {
        return uplataUnapred;
    }

    public void setUplataUnapred(boolean uplataUnapred) {
        this.uplataUnapred = uplataUnapred;
    }

    
    
    
    
}
