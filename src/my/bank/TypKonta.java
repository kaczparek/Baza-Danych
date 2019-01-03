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
public class TypKonta {
    int osobiste = 1;
    int oszczednosciowe = 2;
    int mlodziezowe = 3;
    int studenckie = 4;
    int firmowe = 5;
    int typKonta;
    
    public TypKonta(int typKonta) {
        this.typKonta = typKonta;
    }
    
    public int wezTypKonta() {
        return this.typKonta;
    }
    
    
}
