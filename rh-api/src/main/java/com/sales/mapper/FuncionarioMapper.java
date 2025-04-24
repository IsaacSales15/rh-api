package com.sales.mapper;

import com.sales.rh.model.Funcionario;
import com.sales.rh.dto.FuncionarioRequestDTO;
import com.sales.rh.dto.FuncionarioResponseDTO;

public class FuncionarioMapper {
    public static FuncionarioResponseDTO toDTO(Funcionario f) {
        return new FuncionarioResponseDTO(
                f.getId(),
                f.getNome(),
                f.getEmail(),
                f.getSalario(),
                f.getDataAdmissao(),
                f.getStatus());
    }

    private Funcionario fromDTO(FuncionarioRequestDTO dto) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(dto.getNome());
        funcionario.setEmail(dto.getEmail());        
        funcionario.setSalario(dto.getSalario());
        funcionario.setDataAdmissao(dto.getDataAdmissao());
        funcionario.setStatus(dto.getStatus());
        return funcionario;
    }
}
