package com.barbershop.service;

import com.barbershop.model.Agendamento;
import com.barbershop.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgendamentoService {
    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    public List<Agendamento> listar() {
        return repository.findAll();
    }

    public Agendamento salvar(Agendamento agendamento) {
        return repository.save(agendamento);
    }
}
