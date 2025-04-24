package com.sales.rh.controller;

import com.sales.rh.dto.FuncionarioRequestDTO;
import com.sales.rh.dto.FuncionarioResponseDTO;
import com.sales.rh.service.FuncionarioService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FuncionarioResponseDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{funcionarioId}")
    public ResponseEntity<FuncionarioResponseDTO> buscar(@PathVariable Long id) {
        FuncionarioResponseDTO dto = service.buscarPorId(id);
        return (dto != null) ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<FuncionarioResponseDTO> cadastrar(@RequestBody FuncionarioRequestDTO dto) {
        FuncionarioResponseDTO response = service.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{funcionarioId}")
      public ResponseEntity<FuncionarioResponseDTO> atualizar(@PathVariable Long id, @Valid @RequestBody FuncionarioRequestDTO dto) {
        FuncionarioResponseDTO atualizado = service.atualizar(id, dto);
        return (atualizado != null) ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    }

}
