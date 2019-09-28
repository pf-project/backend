package com.pfproject.api.model.logistic.parametrage.categorie;

import com.pfproject.api.model.EntityBase;
import java.util.List;
import java.util.Map;
import org.springframework.data.mongodb.core.index.Indexed;

public class CategorieArticle extends EntityBase {

    private static final long serialVersionUID = 7954225925563724664L;

    @Indexed(unique = true)
    private String code;

    @Indexed(unique = true)
    private String designation;
    private String groupe;
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

}
