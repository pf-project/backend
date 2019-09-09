package com.pfproject.api.dto.parametrage.configurationdebase;

import java.util.List;

import com.pfproject.api.dto.parametrage.configurationdebase.listesdebase.*;

public class ListesDeBaseDTO {

    private List<PaysDTO> pays;
    private List<VilleDTO> villes;
    private List<TVADTO> tva;
    private List<LangueDTO> langues;
    private List<ModeDePayementDTO> mode_payment;
    private List<HonoraireDTO> honoraires;
    private List<BanqueDTO> banques;

    public List<PaysDTO> getPays() {
        return this.pays;
    }

    public void setPays(List<PaysDTO> pays) {
        this.pays = pays;
    }

    public List<VilleDTO> getVilles() {
        return this.villes;
    }

    public void setVilles(List<VilleDTO> villes) {
        this.villes = villes;
    }

    public List<TVADTO> getTva() {
        return this.tva;
    }

    public void setTva(List<TVADTO> tva) {
        this.tva = tva;
    }

    public List<LangueDTO> getLangues() {
        return this.langues;
    }

    public void setLangues(List<LangueDTO> langues) {
        this.langues = langues;
    }

    public List<ModeDePayementDTO> getMode_payment() {
        return this.mode_payment;
    }

    public void setMode_payment(List<ModeDePayementDTO> mode_payment) {
        this.mode_payment = mode_payment;
    }

    public List<HonoraireDTO> getHonoraires() {
        return this.honoraires;
    }

    public void setHonoraires(List<HonoraireDTO> honoraires) {
        this.honoraires = honoraires;
    }

    public List<BanqueDTO> getBanques() {
        return this.banques;
    }

    public void setBanques(List<BanqueDTO> banques) {
        this.banques = banques;
    }

}
