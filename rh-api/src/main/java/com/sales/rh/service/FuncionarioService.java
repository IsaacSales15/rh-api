package com.sales.rh.service;

import com.sales.rh.dto.FuncionarioRequestDTO;  
import com.sales.rh.dto.FuncionarioResponseDTO;
import com.sales.rh.model.Funcionario;
import com.sales.rh.repository.FuncionarioRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public FuncionarioResponseDTO cadastrar(FuncionarioRequestDTO dto) {
        Funcionario funcionario = fromDTO(dto);
        Funcionario salvo = funcionarioRepository.save(funcionario);
        return toDTO(salvo);
    }

    public List<FuncionarioResponseDTO> listar() {
        return funcionarioRepository.findAll().stream().map(funcionario -> toDTO(funcionario)).collect(Collectors.toList());
    }

    public FuncionarioResponseDTO buscarPorId(Long id){
        return funcionarioRepository.findById(id)
                .map(funcionario -> toDTO(funcionario))
                .orElse(null);
    }

    public FuncionarioResponseDTO atualizar(Long id, FuncionarioRequestDTO dto) {
        if (!funcionarioRepository.existsById(id)) {
            return null;
        }
        Funcionario funcionario = fromDTO(dto);
        funcionario.setId(id);
        Funcionario salvo = funcionarioRepository.save(funcionario);
        return toDTO(salvo);
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

    private FuncionarioResponseDTO toDTO(Funcionario funcionario) {
        return new FuncionarioResponseDTO(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getEmail(),
                funcionario.getSalario(),
                funcionario.getDataAdmissao(),
                funcionario.getStatus()
        );
    }

}
