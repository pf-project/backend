package com.pfproject.api.dto.comptabilite.comptabilitegenerale.ecriturecomptable;

import com.pfproject.api.model.EntityBase;
import java.util.List;

public class EcritureComptableDTO extends EntityBase {

    private int num;
    private String journal;
    private String reference;
    private String dateComptable;
    private String lettrageManuel;
    private String libelleOperation;

    private List<OperationDTO> dataTable;

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

    public List<OperationDTO> getDataTable() {
        return dataTable;
    }

    public void setDataTable(List<OperationDTO> dataTable) {
        this.dataTable = dataTable;
    }

}
