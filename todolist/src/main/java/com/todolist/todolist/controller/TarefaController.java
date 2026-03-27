package controller;

import model.Status;
import model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.TarefaService;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/status/{status}")
    public List<Tarefa> listarPorStatus(@PathVariable Status status) {
        return service.listarPorStatus(status);
    }

    @PostMapping
    public Tarefa adicionar(@RequestBody Tarefa tarefa) {
        return service.adicionar(tarefa);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        service.remover(id);
    }

    @PutMapping("/{id}")
    public Tarefa alterar(@RequestBody Tarefa tarefa, @PathVariable Long id) {
        return service.alterar(id,tarefa);
    }

}
