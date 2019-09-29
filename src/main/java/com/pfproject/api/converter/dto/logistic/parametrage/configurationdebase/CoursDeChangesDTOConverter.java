package com.pfproject.api.converter.dto.logistic.parametrage.configurationdebase;

import com.pfproject.api.dto.logistic.parametrage.configurationdebase.CoursDeChangesDTO;
import com.pfproject.api.dto.logistic.parametrage.configurationdebase.coursdechange.CoursDeChangeDTO;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.CoursDeChanges;
import com.pfproject.api.model.logistic.parametrage.configurationdebase.coursdechange.CoursDeChange;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;

public class CoursDeChangesDTOConverter implements Converter<CoursDeChangesDTO, CoursDeChanges> {

    @Override
    public CoursDeChanges convert(final CoursDeChangesDTO dto) {
        final CoursDeChanges coursDeChanges = new CoursDeChanges();
        List<CoursDeChange> new_list_cours_de_change = new ArrayList<CoursDeChange>();
        List<CoursDeChangeDTO> list_cours_de_change = dto.getCoursdechange();
        for (CoursDeChangeDTO cours_de_change : list_cours_de_change) {
            CoursDeChange new_cours_de_change = new CoursDeChange();
            new_cours_de_change.setId(cours_de_change.getId());
            new_cours_de_change.setDateDebut(cours_de_change.getDateDebut());
            new_cours_de_change.setDateFin(cours_de_change.getDateFin());
            new_cours_de_change.setConvertir(cours_de_change.getConvertir());
            new_cours_de_change.setDeviseCible(cours_de_change.getDeviseCible());
            new_cours_de_change.setTaux(cours_de_change.getTaux());
            new_list_cours_de_change.add(new_cours_de_change);
        }

        coursDeChanges.setCoursdechange(new_list_cours_de_change);
        coursDeChanges.setCreatedBy(dto.getCreatedBy());
        coursDeChanges.setUpdatedBy(dto.getUpdatedBy());
        coursDeChanges.setCreatedAt(dto.getCreatedAt());

        return coursDeChanges;
    }
}
