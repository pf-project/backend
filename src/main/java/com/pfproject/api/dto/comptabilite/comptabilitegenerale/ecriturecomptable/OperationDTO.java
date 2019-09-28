package com.pfproject.api.dto.comptabilite.comptabilitegenerale.ecriturecomptable;

public class OperationDTO {

    private String comptegeneral;
    private String designation;
    private String debiterCrediter;
    private String montant;
    private String debit;
    private String credit;

    public String getComptegeneral() {
        return comptegeneral;
    }

    public void setComptegeneral(String comptegeneral) {
        this.comptegeneral = comptegeneral;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDebiterCrediter() {
        return debiterCrediter;
    }

    public void setDebiterCrediter(String debiterCrediter) {
        this.debiterCrediter = debiterCrediter;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
