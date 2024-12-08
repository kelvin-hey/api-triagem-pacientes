package br.com.zeroes.triagem_pacientes.service;

import br.com.zeroes.triagem_pacientes.model.Paciente;
import br.com.zeroes.triagem_pacientes.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente salvarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    public List<Paciente> buscarPorNome(String nome) {
        return pacienteRepository.findByNome(nome);
    }

    public Optional<Paciente> buscarPacientePorId(Long id) {
        return pacienteRepository.findById(id);
    }

    public void excluirPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

    public Paciente atualizarPaciente(Long id, Paciente pacienteAtualizado) {
        if (pacienteRepository.existsById(id)) {
            pacienteAtualizado.setId(id);  // Garante que o ID não será alterado
            return pacienteRepository.save(pacienteAtualizado);
        } else {
            return null;
        }
    }
}
