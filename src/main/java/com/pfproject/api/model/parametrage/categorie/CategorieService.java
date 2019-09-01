package com.pfproject.api.model.parametrage.categorie;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import java.util.List;
import java.util.Map;

public class CategorieService {

    private static final long serialVersionUID = 7954225925563724664L;

    @Indexed(unique = true)
    private String code;

    @Indexed(unique = true)
    private String designation;
    private String groupe;
    private String createdAt;
    private List<Map<String, Object>> articlesMetaData;

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
