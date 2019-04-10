package com.mycompany.h_kontoverwaltung;


import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class Kontobenutzer extends AbstractListModel{
   private ArrayList liste = new ArrayList();
   
   public void add(String t){
       liste.add(t);
       this.fireIntervalAdded(liste, liste.size()-1, liste.size()-1);
   }
   
    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int index) {
        return liste.get(index);
    }
    
}
