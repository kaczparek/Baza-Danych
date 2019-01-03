/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bank;

/**
 *
 * @author mateu
 */
public class Klient {
    int id;
    String imie, nazwisko;
    long numerKonta;
    TypKonta typKonta;
    float kredyt;
    float stanKonta;
    
    public Klient(int id, String imie, String nazwisko, long numerKonta, TypKonta typKonta, float kredyt, float stanKonta) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKonta = numerKonta;
        this.typKonta = typKonta;
        this.kredyt = kredyt;
        this.stanKonta = stanKonta;
    }
}
