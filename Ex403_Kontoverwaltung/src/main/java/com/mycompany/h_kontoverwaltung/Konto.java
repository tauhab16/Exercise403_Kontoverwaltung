package com.mycompany.h_kontoverwaltung;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Konto {
    int balance;

    public Konto(int balance) {
        this.balance = balance;
    }
    

    public int getBalance() {
        return balance;
    }
    public void deposit(int getting){
        balance+=getting;
    }
    public void withdraw(int getting){
        balance-=getting;
    }
}
