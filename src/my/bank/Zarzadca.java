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
public class Zarzadca {
    int id;
    String imie, nazwisko;
    String pozycja;
    int wiek;
    
    public Zarzadca( int id,String imie, String nazwisko, String pozycja, int wiek) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pozycja = pozycja;
        this.wiek = wiek;
    }
}
