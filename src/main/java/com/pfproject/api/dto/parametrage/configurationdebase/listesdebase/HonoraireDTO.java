package com.pfproject.api.dto.parametrage.configurationdebase.listesdebase;

public class HonoraireDTO {
    private int id;
    private String code;
    private String designation;
    private String tva;

    public String getTva() {
        return this.tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
