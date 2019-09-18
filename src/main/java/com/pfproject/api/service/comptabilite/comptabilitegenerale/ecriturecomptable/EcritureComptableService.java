package com.pfproject.api.service.comptabilite.comptabilitegenerale.ecriturecomptable;

import com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable.EcritureComptable;

import java.util.List;

public interface EcritureComptableService {

    EcritureComptable create(EcritureComptable object);

    EcritureComptable find(String id);



    List<EcritureComptable> findAll();

    List<EcritureComptable> findByJournal(final String journal);


}
