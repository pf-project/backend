package com.pfproject.api.model.comptabilite.donneedebase.comptegeneral;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plancomptable")
public class CompteGeneral {
    private ObjectId id;

    private int classe;
    private int niveau;
    private int compte;
    private String designation;
    private int comptepere;
    private String typecompte;
    private String compteancien;
    private boolean utilized;
    private String createdAt;
    private String updatedAt;
    private  String createdBy;
    private boolean archived;

    public String getId() {
        return id.toString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

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
}
