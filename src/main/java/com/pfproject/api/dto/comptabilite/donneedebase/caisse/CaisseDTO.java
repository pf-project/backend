package com.pfproject.api.dto.comptabilite.donneedebase.caisse;

import org.bson.types.ObjectId;

public class CaisseDTO {
    public String code;
    public String designation;
    public  String pays;
    public String statu;
    public String devise;
    public String compte;
    public String codeJournal;
    public int niveau;

    public CaisseDTO() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getCodeJournal() {
        return codeJournal;
    }

    public void setCodeJournal(String codeJournal) {
        this.codeJournal = codeJournal;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
