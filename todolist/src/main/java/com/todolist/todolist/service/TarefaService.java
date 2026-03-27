package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TarefaRepository;
import model.Tarefa;
import model.Status;
import java.util.List;


@Service
public class TarefaService {
    @Autowired
    private TarefaRepository repository;

    public Tarefa adicionar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public List<Tarefa> listarPorStatus(Status status) {
        return repository.findByStatus(status);
    }

    public void remover (Long id) {
        repository.deleteById(id);
    }

    public Tarefa alterar(Long id, Tarefa tarefaAtualizada) {
        Tarefa tarefa = repository.findById(id).orElse(null);

        if (tarefa == null) {
            throw new RuntimeException("Tarefa não encontrada");
        }
        return repository.save(tarefa);
    }
}
