package br.com.zeroes.triagem_pacientes.controller;

import br.com.zeroes.triagem_pacientes.model.Paciente;
import br.com.zeroes.triagem_pacientes.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/cadastrar")
    public Paciente cadastrar(@RequestBody Paciente paciente) {
        return paciente = pacienteService.salvarPaciente(paciente);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizar(@PathVariable("id") Long id, @RequestBody Paciente paciente) {
        paciente.setId(id);
        pacienteService.atualizarPaciente(id, paciente);
    }

    @DeleteMapping("/deletar/{id}")
    public void excluir(@PathVariable("id") Long id) {
        pacienteService.excluirPaciente(id);
    }

    @GetMapping("/listar")
    public List<Paciente> listar() {
        return pacienteService.listarPacientes();
    }

    @GetMapping("/buscar/{id}")
    public Paciente buscarPorId(@PathVariable("id") Long id) {
        return pacienteService.buscarPacientePorId(id).orElse(null);
    }

    @GetMapping("/buscar")
    public List<Paciente> buscarPorNome(@RequestParam("nome") String nome) {
        return pacienteService.buscarPorNome(nome);
    }
}
