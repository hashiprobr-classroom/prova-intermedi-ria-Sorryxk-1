package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListaTest {
    private List<Tarefa>tarefas;
    private Lista lista;
    @BeforeEach
    void setUp(){
        tarefas =  new ArrayList<>();
        lista = new Lista();

    }
    @Test
    void constroi(){
        setUp();
        assertEquals(0, lista.getTarefas().size());

    }
    @Test
    void adicionaIguais(){
        setUp();

        Tarefa t;
        t = mock(Tarefa.class);
        when(t.getId()).thenReturn(1);
        lista.adiciona(t);

        Tarefa t2;
        t2 = mock(Tarefa.class);
        when(t2.getId()).thenReturn(1);
        lista.adiciona(t2);

        assertEquals(2, lista.getTarefas().size());
    }
    @Test
    void adicionaDiferentes(){
        setUp();

        Tarefa t;
        t = mock(Tarefa.class);
        when(t.getId()).thenReturn(1);
        lista.adiciona(t);

        Tarefa t2;
        t2 = mock(Tarefa.class);
        when(t2.getId()).thenReturn(2);
        lista.adiciona(t2);

        assertEquals(2, lista.getTarefas().size());

    }

}
