package com.pfproject.api.model.donneedebase;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

public class Article {

    private static final long serialVersionUID = 7954225915563724664L;

    private ObjectId id;

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
    private String unite_poid;
    private String dimension_L;
    private String dimension_I;
    private String dimension_H;
    private String unite_dim;
    private boolean gestion_par_lot;
    private String lot_standard;

    private boolean controle_qualite_exige;

    private String prix_achat_HT;
    private String devise_achat;
    private String unite_achat;
    private String taux_tva_achat;
    private String prix_achat_TTC;
    private String prix_moyen_pendere;
    private boolean marge;
    private String taux_marge;
    private String montant_marge;
    private String prix_vente_HT;
    private String devise_vente;
    private String unite_vente;
    private String taux_tva_vente;
    private String prix_vente_TTC;

    private boolean archived;

    private String createdAt;
    private String updatedAt;

    public Article() {

    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getUtilite() {
        return utilite;
    }

    public void setUtilite(String utilite) {
        this.utilite = utilite;
    }

    public String getFindvalidite() {
        return findvalidite;
    }

    public void setFindvalidite(String findvalidite) {
        this.findvalidite = findvalidite;
    }

    public String getAncienCode() {
        return ancienCode;
    }

    public void setAncienCode(String ancienCode) {
        this.ancienCode = ancienCode;
    }

    public String getFabriquant() {
        return fabriquant;
    }

    public void setFabriquant(String fabriquant) {
        this.fabriquant = fabriquant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNum_piece_fabriquuant() {
        return num_piece_fabriquuant;
    }

    public void setNum_piece_fabriquuant(String num_piece_fabriquuant) {
        this.num_piece_fabriquuant = num_piece_fabriquuant;
    }

    public List<Map<String, String>> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(List<Map<String, String>> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public String getUnite_de_quantite_de_base() {
        return unite_de_quantite_de_base;
    }

    public void setUnite_de_quantite_de_base(String unite_de_quantite_de_base) {
        this.unite_de_quantite_de_base = unite_de_quantite_de_base;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getUnite_poid() {
        return unite_poid;
    }

    public void setUnite_poid(String unite_poid) {
        this.unite_poid = unite_poid;
    }

    public String getDimension_L() {
        return dimension_L;
    }

    public void setDimension_L(String dimension_L) {
        this.dimension_L = dimension_L;
    }

    public String getDimension_I() {
        return dimension_I;
    }

    public void setDimension_I(String dimension_I) {
        this.dimension_I = dimension_I;
    }

    public String getDimension_H() {
        return dimension_H;
    }

    public void setDimension_H(String dimension_H) {
        this.dimension_H = dimension_H;
    }

    public String getUnite_dim() {
        return unite_dim;
    }

    public void setUnite_dim(String unite_dim) {
        this.unite_dim = unite_dim;
    }

    public boolean isGestion_par_lot() {
        return gestion_par_lot;
    }

    public void setGestion_par_lot(boolean gestion_par_lot) {
        this.gestion_par_lot = gestion_par_lot;
    }

    public String getLot_standard() {
        return lot_standard;
    }

    public void setLot_standard(String lot_standard) {
        this.lot_standard = lot_standard;
    }

    public boolean isControle_qualite_exige() {
        return controle_qualite_exige;
    }

    public void setControle_qualite_exige(boolean controle_qualite_exige) {
        this.controle_qualite_exige = controle_qualite_exige;
    }

    public String getPrix_achat_HT() {
        return prix_achat_HT;
    }

    public void setPrix_achat_HT(String prix_achat_HT) {
        this.prix_achat_HT = prix_achat_HT;
    }

    public String getDevise_achat() {
        return devise_achat;
    }

    public void setDevise_achat(String devise_achat) {
        this.devise_achat = devise_achat;
    }

    public String getUnite_achat() {
        return unite_achat;
    }

    public void setUnite_achat(String unite_achat) {
        this.unite_achat = unite_achat;
    }

    public String getTaux_tva_achat() {
        return taux_tva_achat;
    }

    public void setTaux_tva_achat(String taux_tva_achat) {
        this.taux_tva_achat = taux_tva_achat;
    }

    public String getPrix_achat_TTC() {
        return prix_achat_TTC;
    }

    public void setPrix_achat_TTC(String prix_achat_TTC) {
        this.prix_achat_TTC = prix_achat_TTC;
    }

    public String getPrix_moyen_pendere() {
        return prix_moyen_pendere;
    }

    public void setPrix_moyen_pendere(String prix_moyen_pendere) {
        this.prix_moyen_pendere = prix_moyen_pendere;
    }

    public boolean isMarge() {
        return marge;
    }

    public void setMarge(boolean marge) {
        this.marge = marge;
    }

    public String getTaux_marge() {
        return taux_marge;
    }

    public void setTaux_marge(String taux_marge) {
        this.taux_marge = taux_marge;
    }

    public String getMontant_marge() {
        return montant_marge;
    }

    public void setMontant_marge(String montant_marge) {
        this.montant_marge = montant_marge;
    }

    public String getPrix_vente_HT() {
        return prix_vente_HT;
    }

    public void setPrix_vente_HT(String prix_vente_HT) {
        this.prix_vente_HT = prix_vente_HT;
    }

    public String getDevise_vente() {
        return devise_vente;
    }

    public void setDevise_vente(String devise_vente) {
        this.devise_vente = devise_vente;
    }

    public String getUnite_vente() {
        return unite_vente;
    }

    public void setUnite_vente(String unite_vente) {
        this.unite_vente = unite_vente;
    }

    public String getTaux_tva_vente() {
        return taux_tva_vente;
    }

    public void setTaux_tva_vente(String taux_tva_vente) {
        this.taux_tva_vente = taux_tva_vente;
    }

    public String getPrix_vente_TTC() {
        return prix_vente_TTC;
    }

    public void setPrix_vente_TTC(String prix_vente_TTC) {
        this.prix_vente_TTC = prix_vente_TTC;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
