package com.pfproject.api.model.logistic.parametrage.configurationdebase.coursdechange;

public class CoursDeChange {
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String dateDebut;
    private String dateFin;
    private String convertir;
    private String taux;
    private String deviseCible;

    public String getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getConvertir() {
        return this.convertir;
    }

    public void setConvertir(String convertir) {
        this.convertir = convertir;
    }

    public String getTaux() {
        return this.taux;
    }

    public void setTaux(String taux) {
        this.taux = taux;
    }

    public String getDeviseCible() {
        return this.deviseCible;
    }

    public void setDeviseCible(String deviseCible) {
        this.deviseCible = deviseCible;
    }

}
