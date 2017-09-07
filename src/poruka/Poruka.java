/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poruka;

import java.util.LinkedList;
import util.TipPoruke;

/**
 *
 * @author DusanT
 */
public class Poruka {
    private String posiljalac;
    private LinkedList<String> primaoci;
    private TipPoruke tipPoruke;
    
    public Poruka(){        
    }

    public Poruka(String posiljalac, LinkedList<String> primaoci, TipPoruke tipPoruke) {
        this.posiljalac = posiljalac;
        this.primaoci = primaoci;
        this.tipPoruke = tipPoruke;
    }
        
    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    public LinkedList<String> getPrimaoci() {
        return primaoci;
    }

    public void setPrimaoci(LinkedList<String> primaoci) {
        this.primaoci = primaoci;
    }

    public TipPoruke getTipPoruke() {
        return tipPoruke;
    }

    public void setTipPoruke(TipPoruke tipPoruke) {
        this.tipPoruke = tipPoruke;
    }
    
    
}
