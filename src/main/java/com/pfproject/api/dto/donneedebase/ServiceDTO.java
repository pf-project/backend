package com.pfproject.api.dto.donneedebase;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.pfproject.api.model.Authority;

import org.bson.types.ObjectId;

public class ServiceDTO implements Serializable {

    private static final long serialVersionUID = 91201774547107674L;
    private ObjectId id;

    private String code;
    private String designation;
    private String categorie;
    private String utilite;
    private String ancienCode;
    private String note;
    private List<Map<String, String>> caracteristiques;
    private String prix_achat_HT;
    private String devise_achat;
    private String unite_achat;
    private String taux_tva_achat;
    private String prix_achat_TTC;
    private String prix_moyen_pendere;
    private Boolean marge;
    private String taux_marge;
    private String montant_marge;
    private String prix_vente_HT;
    private String devise_vente;
    private String unite_vente;
    private String taux_tva_vente;
    private String prix_vente_TTC;
    private String createdAt;

    private boolean archived;
    private String updatedAt;

    public ServiceDTO() {
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

    public String getAncienCode() {
        return ancienCode;
    }

    public void setAncienCode(String ancienCode) {
        this.ancienCode = ancienCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Map<String, String>> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(List<Map<String, String>> caracteristiques) {
        this.caracteristiques = caracteristiques;
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

    public Boolean getMarge() {
        return marge;
    }

    public void setMarge(Boolean marge) {
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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
