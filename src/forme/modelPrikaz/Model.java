/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.modelPrikaz;

import domen.ParSkija;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nadja
 */
public class Model extends AbstractTableModel{
    
    private LinkedList<ParSkija> ls;
    private String[] kolone  = new String[]{"ParSkijaID","DuzinaSkija", "Radijus", "Vezovi", "TipSkija"};

    public Model(LinkedList<ParSkija> ls) {
        this.ls = ls;
    }

    @Override
    public int getRowCount() {
        if(ls == null){
            return 0;
        }
        return ls.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ParSkija ps = ls.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ps.getParSkijaID();
            case 1:
                return ps.getDuzina();
            case 2:
                return ps.getRadijus();
            case 3:
                return ps.getVezovi();
            case 4:
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
    
    public ParSkija getParSkija(int br){
        return ls.get(br);
    }
    public void deleteParSkija(int br){
        ls.remove(br);
    }
}
