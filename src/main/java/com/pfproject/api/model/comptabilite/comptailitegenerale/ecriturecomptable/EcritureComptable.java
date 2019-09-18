package com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable;

import com.pfproject.api.model.EntityBase;
import org.bson.types.ObjectId;

import java.util.List;

public class EcritureComptable extends EntityBase {

    private String journal;
    private String reference;
    private  String dateComptable;
    private String lettrageManuel;
    private String libelleOperation;
    private List<Operation> dataTable;

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDateComptable() {
        return dateComptable;
    }

    public void setDateComptable(String dateComptable) {
        this.dateComptable = dateComptable;
    }

    public String getLettrageManuel() {
        return lettrageManuel;
    }

    public void setLettrageManuel(String lettrageManuel) {
        this.lettrageManuel = lettrageManuel;
    }

    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }

    public List<Operation> getDataTable() {
        return dataTable;
    }

    public void setDataTable(List<Operation> dataTable) {
        this.dataTable = dataTable;
    }
}
