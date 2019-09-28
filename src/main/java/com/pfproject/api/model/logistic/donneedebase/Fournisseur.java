package com.pfproject.api.model.logistic.donneedebase;

import com.pfproject.api.model.EntityBase;
import java.util.List;
import java.util.Map;

public class Fournisseur extends EntityBase {

    private static final long serialVersionUID = 7954225915563724664L;

    private String compte;
    private Boolean retenu_a_la_source;
    private String adresse;
    private String civilite;
    private String cnss;
    private String code;
    private String code_postal;
    private String condition_paiement;
    private List<Map<String, String>> contacts;
    private List<Map<String, String>> coord_bancaire;
    private String designation;
    private String devise;
    private String group;
    private Boolean honoraire;
    private String ice;
    private String identifiant_fiscale;
    private String langue;
    private String libelle_additionnel;
    private String mode_paiement;
    private String nombre_jours;
    private String patente;
    private String pays;
    private String regestre_commerce;
    private String status_honoraire;
    private String taux_tva;
    private String ville;

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Fournisseur() {
    }

    public Boolean getRetenu_a_la_source() {
        return retenu_a_la_source;
    }

    public void setRetenu_a_la_source(Boolean retenu_a_la_source) {
        this.retenu_a_la_source = retenu_a_la_source;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getCondition_paiement() {
        return condition_paiement;
    }

    public void setCondition_paiement(String condition_paiement) {
        this.condition_paiement = condition_paiement;
    }

    public List<Map<String, String>> getContacts() {
        return contacts;
    }

    public void setContacts(List<Map<String, String>> contacts) {
        this.contacts = contacts;
    }

    public List<Map<String, String>> getCoord_bancaire() {
        return coord_bancaire;
    }

    public void setCoord_bancaire(List<Map<String, String>> coord_bancaire) {
        this.coord_bancaire = coord_bancaire;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Boolean getHonoraire() {
        return honoraire;
    }

    public void setHonoraire(Boolean honoraire) {
        this.honoraire = honoraire;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getIdentifiant_fiscale() {
        return identifiant_fiscale;
    }

    public void setIdentifiant_fiscale(String identifiant_fiscale) {
        this.identifiant_fiscale = identifiant_fiscale;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getLibelle_additionnel() {
        return libelle_additionnel;
    }

    public void setLibelle_additionnel(String libelle_additionnel) {
        this.libelle_additionnel = libelle_additionnel;
    }

    public String getMode_paiement() {
        return mode_paiement;
    }

    public void setMode_paiement(String mode_paiement) {
        this.mode_paiement = mode_paiement;
    }

    public String getNombre_jours() {
        return nombre_jours;
    }

    public void setNombre_jours(String nombre_jours) {
        this.nombre_jours = nombre_jours;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRegestre_commerce() {
        return regestre_commerce;
    }

    public void setRegestre_commerce(String regestre_commerce) {
        this.regestre_commerce = regestre_commerce;
    }

    public String getStatus_honoraire() {
        return status_honoraire;
    }

    public void setStatus_honoraire(String status_honoraire) {
        this.status_honoraire = status_honoraire;
    }

    public String getTaux_tva() {
        return taux_tva;
    }

    public void setTaux_tva(String taux_tva) {
        this.taux_tva = taux_tva;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
