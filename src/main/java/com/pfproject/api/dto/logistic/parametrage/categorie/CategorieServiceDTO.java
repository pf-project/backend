package com.pfproject.api.dto.logistic.parametrage.categorie;

import com.pfproject.api.model.EntityBase;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CategorieServiceDTO extends EntityBase implements Serializable {

    private static final long serialVersionUID = 91201774547107674L;
    private String code;
    private String designation;
    private String groupe;
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

}
