package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {
    private DataHorario data;
    @BeforeEach
    void setUp(){
        data =  new DataHorario(new Data());


    }
    @Test
    void constroi(){
        setUp();
        assertEquals(0, data.getHora());
        assertEquals(0, data.getMinuto());
        assertEquals(0, data.minutos());
    }
    @Test
    void horarioBaixo(){
        setUp();
        data.atualiza(-1,-1);
        assertEquals(0, data.getHora());
        assertEquals(0, data.getMinuto());
        assertEquals(0, data.minutos());
    }
    @Test
    void horarioAlto(){
        setUp();
        data.atualiza(24, 60);
        assertEquals(23, data.getHora());
        assertEquals(59, data.getMinuto());
        assertEquals(1439, data.minutos());
    }
}
