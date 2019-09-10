package com.pfproject.api.dto.parametrage.configurationdebase.unites;

public class DeviseDTO {
    private int id;
    private String code;
    private String designation;
    private int facteur_conversion;
    private String unite_conversion;

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

    public int getFacteur_conversion() {
        return this.facteur_conversion;
    }

    public void setFacteur_conversion(int facteur_conversion) {
        this.facteur_conversion = facteur_conversion;
    }

    public String getUnite_conversion() {
        return this.unite_conversion;
    }

    public void setUnite_conversion(String unite_conversion) {
        this.unite_conversion = unite_conversion;
    }

}
