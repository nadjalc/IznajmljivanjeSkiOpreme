/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.modelPrikaz;

import domen.ParSkija;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
import kolekcije.KolekcijaSkija;
import poslovnaLogika.Kontroler;

/**
 *
 * @author Nadja
 */
public class Model extends AbstractTableModel {

    private KolekcijaSkija ks;
    private String[] kolone = new String[]{"ParSkijaID", "DuzinaSkija", "Radijus", "Vezovi", "Marka", "TipSkija"};

    public Model() {
        ks = Kontroler.getInstance().getKs();
    }

    public LinkedList<ParSkija> listaParova() {
        return ks.vratiSkije();
    }

    @Override
    public int getRowCount() {
        if (listaParova() == null) {
            return 0;
        }
        return listaParova().size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ParSkija ps = listaParova().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ps.getParSkijaID();
            case 1:
                return ps.getDuzina();
            case 2:
                return ps.getRadijus();
            case 3:
                return ps.getVezovi();
            case 4:
                return ps.getMarka();
            case 5:
                return ps.getTipSkija();
            default:
                return "n/a";
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public ParSkija getParSkija(int br) {
        return listaParova().get(br);
    }

    public void deleteParSkija(int br) {
        listaParova().remove(br);
    }
}
