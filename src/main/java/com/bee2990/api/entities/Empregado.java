package com.bee2990.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empregados")
public class Empregado {

    @Id
    private String cpf;
    private String enome;
    private Double salary;
    private String cpf_supervisor;

    public Empregado() {
    }

    public Empregado(String cpf, String enome, Double salary, String cpf_supervisor) {
        this.cpf = cpf;
        this.enome = enome;
        this.salary = salary;
        this.cpf_supervisor = cpf_supervisor;
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
}
