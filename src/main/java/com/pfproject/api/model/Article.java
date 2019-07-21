package com.pfproject.api.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Article {

    private static final long serialVersionUID = 7954225915563724664L;

    private String code;
    private String designation;
    private String categorie;
    private String utilite;
    private String findvalidite;
    private String ancienCode;
    private String fabriquant;
    private String note;
    private String num_piece_fabriquuant;
    private List<Map<String, String>> caracteristiques;
    private String unite_de_quantite_de_base;
    private String emplacement;
    private String poids;
    private String unite1;
    private String dimension_L;
    private String dimension_I;
    private String dimension_H;
    private String unite2;
    private boolean gestion_par_lot;
    private boolean controle_qualite_exige;
    private String prix_standar_achat;
    private String unite_de_quantite_achat;
    private String prix_moyen_pendere;
    private String prix_de_vente_de_base_HT;
    private String taux_tva;
    private String prix_de_vente_de_base_TTC;
    private String unite_de_vente;
    private String createdAt;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getUtilite() {
        return this.utilite;
    }

    public void setUtilite(String utilite) {
        this.utilite = utilite;
    }

    public String getFindvalidite() {
        return this.findvalidite;
    }

    public void setFindvalidite(String findvalidite) {
        this.findvalidite = findvalidite;
    }

    public String getAncienCode() {
        return this.ancienCode;
    }

    public void setAncienCode(String ancienCode) {
        this.ancienCode = ancienCode;
    }

    public String getFabriquant() {
        return this.fabriquant;
    }

    public void setFabriquant(String fabriquant) {
        this.fabriquant = fabriquant;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNum_piece_fabriquuant() {
        return this.num_piece_fabriquuant;
    }

    public void setNum_piece_fabriquuant(String num_piece_fabriquuant) {
        this.num_piece_fabriquuant = num_piece_fabriquuant;
    }

    public List<Map<String, String>> getCaracteristiques() {
        return this.caracteristiques;
    }

    public void setCaracteristiques(List<Map<String, String>> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public String getUnite_de_quantite_de_base() {
        return this.unite_de_quantite_de_base;
    }

    public void setUnite_de_quantite_de_base(String unite_de_quantite_de_base) {
        this.unite_de_quantite_de_base = unite_de_quantite_de_base;
    }

    public String getEmplacement() {
        return this.emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getPoids() {
        return this.poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getUnite1() {
        return this.unite1;
    }

    public void setUnite1(String unite1) {
        this.unite1 = unite1;
    }

    public String getDimension_L() {
        return this.dimension_L;
    }

    public void setDimension_L(String dimension_L) {
        this.dimension_L = dimension_L;
    }

    public String getDimension_I() {
        return this.dimension_I;
    }

    public void setDimension_I(String dimension_I) {
        this.dimension_I = dimension_I;
    }

    public String getDimension_H() {
        return this.dimension_H;
    }

    public void setDimension_H(String dimension_H) {
        this.dimension_H = dimension_H;
    }

    public String getUnite2() {
        return this.unite2;
    }

    public void setUnite2(String unite2) {
        this.unite2 = unite2;
    }

    public boolean getGestion_par_lot() {
        return this.gestion_par_lot;
    }

    public void setGestion_par_lot(boolean gestion_par_lot) {
        this.gestion_par_lot = gestion_par_lot;
    }

    public boolean getControle_qualite_exige() {
        return this.controle_qualite_exige;
    }

    public void setControle_qualite_exige(boolean controle_qualite_exige) {
        this.controle_qualite_exige = controle_qualite_exige;
    }

    public String getPrix_standar_achat() {
        return this.prix_standar_achat;
    }

    public void setPrix_standar_achat(String prix_standar_achat) {
        this.prix_standar_achat = prix_standar_achat;
    }

    public String getUnite_de_quantite_achat() {
        return this.unite_de_quantite_achat;
    }

    public void setUnite_de_quantite_achat(String unite_de_quantite_achat) {
        this.unite_de_quantite_achat = unite_de_quantite_achat;
    }

    public String getPrix_moyen_pendere() {
        return this.prix_moyen_pendere;
    }

    public void setPrix_moyen_pendere(String prix_moyen_pendere) {
        this.prix_moyen_pendere = prix_moyen_pendere;
    }

    public String getPrix_de_vente_de_base_HT() {
        return this.prix_de_vente_de_base_HT;
    }

    public void setPrix_de_vente_de_base_HT(String prix_de_vente_de_base_HT) {
        this.prix_de_vente_de_base_HT = prix_de_vente_de_base_HT;
    }

    public String getTaux_tva() {
        return this.taux_tva;
    }

    public void setTaux_tva(String taux_tva) {
        this.taux_tva = taux_tva;
    }

    public String getPrix_de_vente_de_base_TTC() {
        return this.prix_de_vente_de_base_TTC;
    }

    public void setPrix_de_vente_de_base_TTC(String prix_de_vente_de_base_TTC) {
        this.prix_de_vente_de_base_TTC = prix_de_vente_de_base_TTC;
    }

    public String getUnite_de_vente() {
        return this.unite_de_vente;
    }

    public void setUnite_de_vente(String unite_de_vente) {
        this.unite_de_vente = unite_de_vente;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
