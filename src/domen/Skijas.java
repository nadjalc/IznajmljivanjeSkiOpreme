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
public class Skijas {
    private String skijasID;
    private String imePrezime;
    private String mail;

    public Skijas(String skijasID, String imePrezime, String mail) {
        this.skijasID = skijasID;
        this.imePrezime = imePrezime;
        this.mail = mail;
    }

    public String getSkijasID() {
        return skijasID;
    }

    public void setSkijasID(String skijasID) {
        this.skijasID = skijasID;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    
    
}
