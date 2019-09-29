package com.pfproject.api.converter.dto.comptabilite.comptabilitegenerale.ecriturecomptable;

import com.pfproject.api.dto.comptabilite.comptabilitegenerale.ecriturecomptable.EcritureComptableDTO;
import com.pfproject.api.dto.comptabilite.comptabilitegenerale.ecriturecomptable.OperationDTO;
import com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable.EcritureComptable;
import com.pfproject.api.model.comptabilite.comptailitegenerale.ecriturecomptable.Operation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;

public class EcritureComptableDTOConverter implements Converter<EcritureComptableDTO, EcritureComptable> {

    @Override
    public EcritureComptable convert(final EcritureComptableDTO dto) {
        EcritureComptable ecritureComptable = new EcritureComptable();
        ecritureComptable.setDateComptable(dto.getDateComptable());
        ecritureComptable.setJournal(dto.getJournal());
        ecritureComptable.setLettrageManuel(dto.getLettrageManuel());
        ecritureComptable.setLibelleOperation(dto.getLibelleOperation());
        ecritureComptable.setReference(dto.getReference());
        ecritureComptable.setCreatedAt(dto.getCreatedAt());
        ecritureComptable.setCreatedBy(dto.getCreatedBy());
        ecritureComptable.setUpdatedBy(dto.getUpdatedBy());

        List<Operation> operations = new ArrayList<Operation>();
        List<OperationDTO> operationDTOS = dto.getDataTable();

        for (OperationDTO operationDTO : operationDTOS) {
            Operation operation = new Operation();
            operation.setComptegeneral(operationDTO.getComptegeneral());
            operation.setDesignation(operationDTO.getDesignation());
            operation.setDebiterCrediter(operationDTO.getDebiterCrediter());
            operation.setMontant(operationDTO.getMontant());
            operation.setDebit(operationDTO.getDebit());
            operation.setCredit(operationDTO.getCredit());
            operations.add(operation);
        }

        ecritureComptable.setDataTable(operations);
        return ecritureComptable;
    }
}
