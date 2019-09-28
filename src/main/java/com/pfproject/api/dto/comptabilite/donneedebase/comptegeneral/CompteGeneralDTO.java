package com.pfproject.api.dto.comptabilite.donneedebase.comptegeneral;

import com.pfproject.api.model.EntityBase;

public class CompteGeneralDTO extends EntityBase {

    private String classe;
    private String niveau;
    private String compte;
    private String designation;
    private boolean utilized;

    private String comptepere;
    private String typecompte;
    private String compteancien;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isUtilized() {
        return utilized;
    }

    public void setUtilized(boolean utilized) {
        this.utilized = utilized;
    }

    public String getComptepere() {
        return comptepere;
    }

    public void setComptepere(String comptepere) {
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
}
