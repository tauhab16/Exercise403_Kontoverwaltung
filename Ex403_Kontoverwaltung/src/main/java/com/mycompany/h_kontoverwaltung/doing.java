package com.mycompany.h_kontoverwaltung;


import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class doing extends Thread{
    
Random rand = new Random();
Konto k;
    int getting;
    int doA;
    KontoGUI g;
    int getUser;
    Kontobenutzer l;
    int [] i;
    ArrayList listTest=new ArrayList();
    
    public doing(KontoGUI g,Kontobenutzer l,Konto k,int [] i){
        this.g=g;
        this.l=l;
        this.k=k;
        this.i=i;
        for(int j=0;j<i.length;j++){
            listTest.add(l.getElementAt(i[j]));       
        }
        
        
    }
    
    public doing(KontoGUI g,Kontobenutzer l,Konto k){
        this.g=g;
        this.l=l;
        this.k=k;
        
    }
    
    @Override
    public void run() {
        synchronized (k) {
            
            getUser = rand.nextInt(listTest.size());
            getting = rand.nextInt(50-10);
            doA = rand.nextInt(10 - 5);

            if (doA % 2 == 0) {
                
                if (getting < k.getBalance()) {
                    
                    k.withdraw(getting);
                    String s=String.format(listTest.get(getUser)+" isst "+getting+"\n");
                    g.jA.append(s);
                    g.Jkonto.setText(""+k.getBalance());
                    
                    
                } else {
                    
                    k.deposit(getting);
                      String s=String.format(listTest.get(getUser)+" gibt "+getting+"\n");
                    g.jA.append(s);
                    g.Jkonto.setText(""+k.getBalance());
                    
                    
                }
            } else {
                
                k.deposit(getting);
                   String s=String.format(listTest.get(getUser)+" gibt "+getting+"\n");
                 g.jA.append(s);
                 g.Jkonto.setText(""+k.getBalance());
                 
            }
           
            g.jA.updateUI();
            
            int sleepy = rand.nextInt(1000-1);
            try {
                this.sleep(sleepy);
            } catch (InterruptedException ex) {
                Logger.getLogger(doing.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
    }
    
}

   
}
