package com.pfproject.api.dto.logistic.parametrage.configurationdebase;

import java.util.List;

import com.pfproject.api.dto.logistic.parametrage.configurationdebase.coursdechange.*;

public class CoursDeChangesDTO {

    private List<CoursDeChangeDTO> coursdechange;

    public List<CoursDeChangeDTO> getCoursdechange() {
        return this.coursdechange;
    }

    public void setCoursdechange(List<CoursDeChangeDTO> coursdechange) {
        this.coursdechange = coursdechange;
    }

}
