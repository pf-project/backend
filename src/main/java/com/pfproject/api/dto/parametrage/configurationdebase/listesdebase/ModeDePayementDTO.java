package com.pfproject.api.dto.parametrage.configurationdebase.listesdebase;

public class ModeDePayementDTO {
    private int id;
    private String code;
    private String designation;

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
