package com.sales.rh.dto;

import com.sales.rh.model.StatusFuncionario;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioRequestDTO {
    @NotBlank(message = "o nome é obrigatório")
    private String nome;

    @NotBlank(message = "email é obrigatorio")
    @Email(message = "email inválido")
    private String email;

    @NotNull(message = "salario é obrigatorio")
    @DecimalMin(value = "1000", message = "salario minimo é 1000")
    private BigDecimal salario;

    @NotNull(message = "data de admissao é obrigatorio")
    private LocalDate dataAdmissao;

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

    @NotNull(message = "status é obrigatorio")    
    private StatusFuncionario status;
}
