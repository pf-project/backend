package com.pfproject.api.model.logistic.parametrage.configurationdebase;

import com.pfproject.api.model.EntityBase;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.listesdebase.*;
import java.util.List;

public class ListesDeBase extends EntityBase {

    private List<Pays> pays;
    private List<Ville> villes;
    private List<TVA> tva;
    private List<Langue> langues;
    private List<ModeDePayement> mode_payment;
    private List<Honoraire> honoraires;
    private List<Banque> banques;

    public List<Pays> getPays() {
        return this.pays;
    }

    public void setPays(List<Pays> pays) {
        this.pays = pays;
    }

    public List<Ville> getVilles() {
        return this.villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    public List<TVA> getTva() {
        return this.tva;
    }

    public void setTva(List<TVA> tva) {
        this.tva = tva;
    }

    public List<Langue> getLangues() {
        return this.langues;
    }

    public void setLangues(List<Langue> langues) {
        this.langues = langues;
    }

    public List<ModeDePayement> getMode_payment() {
        return this.mode_payment;
    }

    public void setMode_payment(List<ModeDePayement> mode_payment) {
        this.mode_payment = mode_payment;
    }

    public List<Honoraire> getHonoraires() {
        return this.honoraires;
    }

    public void setHonoraires(List<Honoraire> honoraires) {
        this.honoraires = honoraires;
    }

    public List<Banque> getBanques() {
        return this.banques;
    }

    public void setBanques(List<Banque> banques) {
        this.banques = banques;
    }

}
