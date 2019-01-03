
package my.bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Bank  {
    private ArrayList<Klient> klienci = new ArrayList<>();
    private String bazaKlienci = "klienci.txt";
    private String bazaZarzadcy = "zarzad.txt";
    private String login = "root";
    private String haslo = "123";
    private ArrayList<Zarzadca> zarzad = new ArrayList<>();
    
    public String wczytajKlientow() throws FileNotFoundException, IOException {
        File file = new File(this.bazaKlienci);
        if (!file.exists() || file.length() == 0) {
            return null; // pliku nie ma albo jest pusty (wiec nie ma bazy)
        }
        this.klienci = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(this.bazaKlienci))) {
            for (String line; ((line = br.readLine()) != null);) {
                String[] k = line.split("\\|");
                int id = Integer.parseInt(k[0]);
                String imie = k[1];
                String nazwisko = k[2];
                System.out.println(line);
                long numerKonta = Long.parseLong(k[3]);
                int typKonta = Integer.parseInt(k[4]);
                
                float kredyt = Float.parseFloat(k[5].replace(',', '.'));
                float stanKonta = Float.parseFloat(k[6].replace(',', '.'));
                TypKonta tk = new TypKonta(typKonta);
                Klient nowyKlient = new Klient(id, imie, nazwisko, numerKonta, tk, kredyt, stanKonta);
                this.dodajKlienta(nowyKlient);
                
            }
        }
        System.out.print("3");
        return null;
    }
    
    public void wczytajZarzadcow() throws FileNotFoundException, IOException {
        File file = new File(this.bazaZarzadcy);
        if (!file.exists() || file.length() == 0) {
            return; // pliku nie ma albo jest pusty (wiec nie ma bazy)
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(this.bazaZarzadcy))) {
            for (String line; ((line = br.readLine()) != null);) {
                String[] k = line.split("|");
                System.out.println(line);
                
            }
        }
    }
    
    public boolean zaloguj(String login, String haslo) {
        if (this.login.equals(login) && this.haslo.equals(haslo)) {
            return true;
        }
        return false;
    }
    
    public void dodajKlienta(Klient klient) {
        this.klienci.add(klient);
    }
    
    public void usunKlienta(int id) {
        for (Klient klient : this.klienci) {
            if (klient.id == id) {
                this.klienci.remove(klient);
                return;
            }
        }
    }
    
    public Klient wezKlienta(int id) {
        return this.klienci.get(id);
    }
    
    public ArrayList<Klient> wezKlientow() {
        return this.klienci;
    }
    
    public void dodajZarzadce(Zarzadca zarzadca) {
        this.zarzad.add(zarzadca);
    }
    
    public void usunZarzadce(Zarzadca zarzadca) {
        this.zarzad.remove(zarzadca);
    }
    
}
