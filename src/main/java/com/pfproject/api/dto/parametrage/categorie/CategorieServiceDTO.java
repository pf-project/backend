package com.pfproject.api.dto.parametrage.categorie;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.pfproject.api.model.Authority;

public class CategorieServiceDTO implements Serializable {

    private static final long serialVersionUID = 91201774547107674L;
    private String code;
    private String designation;
    private String groupe;
    private String createdAt;
    private List<Map<String, Object>> articlesMetaData;

    public CategorieServiceDTO() {
    }

    public List<Map<String, Object>> getArticlesMetaData() {
        return this.articlesMetaData;
    }

    public void setArticlesMetaData(List<Map<String, Object>> articlesMetaData) {
        this.articlesMetaData = articlesMetaData;
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

    public String getGroupe() {
        return this.groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

}
