package com.pfproject.api.dto.parametrage.configurationdebase;

import java.util.List;

import com.pfproject.api.dto.parametrage.configurationdebase.coursdechange.*;
import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.*;

public class CoursDeChangesDTO {

    private List<CoursDeChangeDTO> coursdechange;

    public List<CoursDeChangeDTO> getCoursdechange() {
        return this.coursdechange;
    }

    public void setCoursdechange(List<CoursDeChangeDTO> coursdechange) {
        this.coursdechange = coursdechange;
    }

}
