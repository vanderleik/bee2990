package com.bee2990.api.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "empregados")
public class Empregado {

    @Id
    private String cpf;
    private String enome;
    private Double salary;
    private String cpf_supervisor;

    @ManyToOne
    @JoinColumn(name = "cpf_supervisor")
    private Empregado supervisor;

    @OneToMany(mappedBy = "supervisor")
    private List<Empregado> supervisionados = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "dnumero")
    private Departamento departamento;

    @ManyToMany
    @JoinTable(name = "trabalha",
            joinColumns = @JoinColumn(name = "cpf_emp"),
            inverseJoinColumns = @JoinColumn(name = "pnumero"))
    private Set<Projeto> projetosOndeTrabalha = new HashSet<>();


    public Empregado() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnome() {
        return enome;
    }

    public void setEnome(String enome) {
        this.enome = enome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCpf_supervisor() {
        return cpf_supervisor;
    }

    public void setCpf_supervisor(String cpf_supervisor) {
        this.cpf_supervisor = cpf_supervisor;
    }

    public Empregado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empregado supervisor) {
        this.supervisor = supervisor;
    }

    public List<Empregado> getSupervisionados() {
        return supervisionados;
    }

    public void setSupervisionados(List<Empregado> supervisionados) {
        this.supervisionados = supervisionados;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Projeto> getProjetosOndeTrabalha() {
        return projetosOndeTrabalha;
    }

    public void setProjetosOndeTrabalha(Set<Projeto> projetosOndeTrabalha) {
        this.projetosOndeTrabalha = projetosOndeTrabalha;
    }
}
