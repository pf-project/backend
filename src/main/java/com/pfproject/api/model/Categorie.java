package com.pfproject.api.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import java.util.List;
import java.util.Map;

public class Categorie {

    private static final long serialVersionUID = 7954225925563724664L;
    @Id
    private long code;

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

    public long getCode() {
        return this.code;
    }

    public void setCode(long code) {
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
