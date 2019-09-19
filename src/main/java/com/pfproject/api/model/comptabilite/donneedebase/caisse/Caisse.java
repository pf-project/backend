package com.pfproject.api.model.comptabilite.donneedebase.caisse;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plancomptable")
public class Caisse  {
    public ObjectId id;
    public String code;
    public String designation;
    public  String pays;
    public String statu;
    public String devise;
    public String compte;
    public String codeJournal;
    public  int niveau;
    public int   classe;

    public  String createdAt;
    public String updatedBy;
    public String updatedAt;
    public  boolean archived;


    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    public Caisse() {
    }

    public String getId() {
        return id.toString();
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



    public String getCodeJournal() {
        return codeJournal;
    }

    public void setCodeJournal(String codeJournal) {
        this.codeJournal = codeJournal;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
}
