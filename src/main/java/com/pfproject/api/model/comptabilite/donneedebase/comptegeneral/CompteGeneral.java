package com.pfproject.api.model.comptabilite.donneedebase.comptegeneral;

import com.pfproject.api.model.EntityBase;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plancomptable")
public class CompteGeneral extends EntityBase {

    private int classe;
    private int niveau;
    private int compte;
    private String designation;
    private int comptepere;
    private String typecompte;
    private String compteancien;
    private boolean utilized;

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getCompte() {
        return compte;
    }

    public void setCompte(int compte) {
        this.compte = compte;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getComptepere() {
        return comptepere;
    }

    public void setComptepere(int comptepere) {
        this.comptepere = comptepere;
    }

    public String getTypecompte() {
        return typecompte;
    }

    public void setTypecompte(String typecompte) {
        this.typecompte = typecompte;
    }

    public String getCompteancien() {
        return compteancien;
    }

    public void setCompteancien(String compteancien) {
        this.compteancien = compteancien;
    }

    public boolean isUtilized() {
        return utilized;
    }

    public void setUtilized(boolean utilized) {
        this.utilized = utilized;
    }

}
