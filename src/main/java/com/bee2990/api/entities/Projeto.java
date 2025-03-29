package com.bee2990.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "projetos")
@Entity
public class Projeto {

    @Id
    private Long pnumero;
    private String pnome;

    public Projeto() {
    }

    public Projeto(Long pnumero, String pnome) {
        this.pnumero = pnumero;
        this.pnome = pnome;
    }

    public Long getPnumero() {
        return pnumero;
    }

    public void setPnumero(Long pnumero) {
        this.pnumero = pnumero;
    }

    public String getPnome() {
        return pnome;
    }

    public void setPnome(String pnome) {
        this.pnome = pnome;
    }
}
