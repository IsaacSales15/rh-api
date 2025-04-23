package com.sales.rh.dto;

import com.sales.rh.model.StatusFuncionario;
import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private BigDecimal salario;
    private LocalDate dataAdmissao;
    private StatusFuncionario status;

    public FuncionarioResponseDTO(Long id, String nome, String email, BigDecimal salario, LocalDate dataAdmissao,
            StatusFuncionario status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public StatusFuncionario getStatus() {
        return status;
    }

    public void setStatus(StatusFuncionario status) {
        this.status = status;
    }

    
}
