package com.pfproject.api.dto.comptabiite.donnedebase.comptebancaire;

public class CompteBancaireDTO {

    private String IBAN ;
    private String adresse;
    private String agence;
    private boolean avec_compte_special;
    private String  banque;
    private String cle_RIB;
    private String code;
    private String compte_general_special;
    private String compte_general_standard;
    private String designation;
    private boolean generer_des_comptes_intermidieres;
    private String journal;
    private String pays;
    private String status_compte;
    private String swift;
    private String type_compte;
    private String ville ;

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public boolean isAvec_compte_special() {
        return avec_compte_special;
    }

    public void setAvec_compte_special(boolean avec_compte_special) {
        this.avec_compte_special = avec_compte_special;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getCle_RIB() {
        return cle_RIB;
    }

    public void setCle_RIB(String cle_RIB) {
        this.cle_RIB = cle_RIB;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompte_general_special() {
        return compte_general_special;
    }

    public void setCompte_general_special(String compte_general_special) {
        this.compte_general_special = compte_general_special;
    }

    public String getCompte_general_standard() {
        return compte_general_standard;
    }

    public void setCompte_general_standard(String compte_general_standard) {
        this.compte_general_standard = compte_general_standard;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isGenerer_des_comptes_intermidieres() {
        return generer_des_comptes_intermidieres;
    }

    public void setGenerer_des_comptes_intermidieres(boolean generer_des_comptes_intermidieres) {
        this.generer_des_comptes_intermidieres = generer_des_comptes_intermidieres;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getStatus_compte() {
        return status_compte;
    }

    public void setStatus_compte(String status_compte) {
        this.status_compte = status_compte;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public String getType_compte() {
        return type_compte;
    }

    public void setType_compte(String type_compte) {
        this.type_compte = type_compte;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
