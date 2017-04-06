/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Nadja
 */
public class DBUtil {

    private Properties properties;

    public DBUtil() throws FileNotFoundException, IOException {
        properties = new Properties();
        properties.load(new FileInputStream("db.config"));
    }

    public String vratiURL() {
        return properties.getProperty(Constants.URL);
    }

    public String vratiKorisnika() {
        return properties.getProperty(Constants.USERNAME);
    }

    public String vratiSifru() {
        return properties.getProperty(Constants.PASSWORD);
    }

}
