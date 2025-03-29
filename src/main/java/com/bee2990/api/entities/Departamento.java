package com.bee2990.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "departamentos")
@Entity
public class Departamento {

    @Id
    private Long dnumero;
    private String dnome;

    public Departamento() {
    }

    public Departamento(Long dnumero, String dnome) {
        this.dnumero = dnumero;
        this.dnome = dnome;
    }

    public Long getDnumero() {
        return dnumero;
    }

    public void setDnumero(Long dnumero) {
        this.dnumero = dnumero;
    }

    public String getDnome() {
        return dnome;
    }

    public void setDnome(String dnome) {
        this.dnome = dnome;
    }
}
