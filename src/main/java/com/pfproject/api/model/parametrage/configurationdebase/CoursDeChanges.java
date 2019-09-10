package com.pfproject.api.model.parametrage.configurationdebase;

import java.util.List;

import com.pfproject.api.model.parametrage.configurationdebase.coursdechange.*;

import org.bson.types.ObjectId;

public class CoursDeChanges {

    private ObjectId id;

    private List<CoursDeChange> coursdechange;

    public List<CoursDeChange> getCoursdechange() {
        return this.coursdechange;
    }

    public void setCoursdechange(List<CoursDeChange> coursdechange) {
        this.coursdechange = coursdechange;
    }

    public String getId() {
        return this.id.toString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

}
