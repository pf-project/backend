package com.pfproject.api.dto.logistic.parametrage.configurationdebase;

import com.pfproject.api.dto.logistic.parametrage.configurationdebase.coursdechange.*;
import com.pfproject.api.model.EntityBase;
import java.util.List;

public class CoursDeChangesDTO extends EntityBase {

    private List<CoursDeChangeDTO> coursdechange;

    public List<CoursDeChangeDTO> getCoursdechange() {
        return this.coursdechange;
    }

    public void setCoursdechange(List<CoursDeChangeDTO> coursdechange) {
        this.coursdechange = coursdechange;
    }

}
