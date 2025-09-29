package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    //tarefas
    //metodos: adiciona
    private List<Tarefa>tarefas;

    public Lista() {
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void adiciona(Tarefa tarefa){
        if(tarefas.size()>1){
            for(Tarefa tarefa1 : tarefas){
                if(tarefa1.getId() != tarefa.getId()){
                    tarefas.add(tarefa);
                }
            }
        }
        tarefas.add(tarefa);


    }
}
