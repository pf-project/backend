package com.pfproject.api.model.logistic.parametrage.configurationdebase;

import com.pfproject.api.model.EntityBase;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.coursdechange.*;
import java.util.List;

public class CoursDeChanges extends EntityBase {

    private List<CoursDeChange> coursdechange;

    public List<CoursDeChange> getCoursdechange() {
        return this.coursdechange;
    }

    public void setCoursdechange(List<CoursDeChange> coursdechange) {
        this.coursdechange = coursdechange;
    }

}
