package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TarefaTest {
    private Tarefa tarefa;
    @BeforeEach
    void setUp(){
        tarefa =  new Tarefa(2);

    }
    @Test
    void  constroi(){
        setUp();
        assertEquals(2, tarefa.getId());
        assertEquals("", tarefa.getDescricao());
        assertNull(tarefa.getInicio());
        assertNull(tarefa.getFim());
    }
    @Test
    void mudaDescricao(){
        setUp();
        tarefa.setDescricao("oi");
        assertEquals("oi", tarefa.getDescricao());
    }
    @Test
    void momentosValidos(){
        setUp();
        Momento momentoini;
        momentoini = mock(Momento.class);
        when(momentoini.minutos()).thenReturn(100);

        Momento momentofim;
        momentofim =  mock(Momento.class);
        when(momentofim.minutos()).thenReturn(500);


        tarefa.atualiza(momentoini, momentofim);
        assertEquals(100, tarefa.getInicio().minutos());
        assertEquals(500, tarefa.getFim().minutos());

    }
    @Test
    void momentosInvalidos(){
        setUp();
        Momento momentoini;
        momentoini = mock(Momento.class);
        when(momentoini.minutos()).thenReturn(1000);

        Momento momentofim;
        momentofim =  mock(Momento.class);
        when(momentofim.minutos()).thenReturn(500);



        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class
                ,() -> tarefa.atualiza(momentoini,momentofim));
        assertEquals("Vixi", exception.getMessage());
    }

}
