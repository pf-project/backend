package com.pfproject.api.dto.comptabilite.donneedebase.comptegeneral;

import org.bson.types.ObjectId;

public class CompteGeneralDTO {
    private ObjectId id;

    private String classe;
    private String niveau;
    private String compte;
    private String designation;
    private boolean utilized;

    private String comptepere;
    private String typecompte;
    private String compteancien;
    private String createdAt;
    private String updatedAt;
    private  String createdBy;
    private boolean archived;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
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
