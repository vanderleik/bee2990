package com.bee2990.api.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "departamentos")
@Entity
public class Departamento {

    @Id
    private Long dnumero;
    private String dnome;

    @OneToMany(mappedBy = "departamento")
    private List<Empregado> empregados = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cpf_gerente")
    private Empregado gerente;

    public Departamento() {
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

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }
}
