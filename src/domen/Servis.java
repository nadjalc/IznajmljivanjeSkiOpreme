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
public class Servis {
    private String servisID;
    private Date datumServisa;
    private boolean ostrenje;
    private boolean voskiranje;

    public Servis(String servisID, Date datumServisa, boolean ostrenje, boolean voskiranje) {
        this.servisID = servisID;
        this.datumServisa = datumServisa;
        this.ostrenje = ostrenje;
        this.voskiranje = voskiranje;
    }

    public String getServisID() {
        return servisID;
    }

    public void setServisID(String servisID) {
        this.servisID = servisID;
    }

    public Date getDatumServisa() {
        return datumServisa;
    }

    public void setDatumServisa(Date datumServisa) {
        this.datumServisa = datumServisa;
    }

    public boolean isOstrenje() {
        return ostrenje;
    }

    public void setOstrenje(boolean ostrenje) {
        this.ostrenje = ostrenje;
    }

    public boolean isVoskiranje() {
        return voskiranje;
    }

    public void setVoskiranje(boolean voskiranje) {
        this.voskiranje = voskiranje;
    }
  
    
    
    
}
