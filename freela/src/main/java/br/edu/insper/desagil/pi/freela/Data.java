package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer>limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
    

    public void atualiza(int novoAno, int novoMes, int novoDia){
        if(novoAno>=1970 && novoAno<2070){
            this.ano = novoAno;
        } else if (novoAno<1970) {
            this.ano = 1970;
        } else if (novoAno >2070) {
            this.ano = 2070;
        }
        if(novoMes>= 1 && novoMes< 12){
            this.mes = novoMes;
        } else if (novoMes<1) {
            this.mes = 1;
        } else if (novoMes>12) {
            this.mes = 12;
        }
        if(novoDia>=1 && novoDia< limite.get(mes)){
            this.dia = novoDia;
        } else if (novoDia< 1) {
            this.dia = 1;
        } else if (novoDia> limite.get(mes)) {
            this.dia = limite.get(mes);
        }

    }
    @Override
    public int minutos(){
        int ateAno = getAno() - 1970;
        int dias = ateAno * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        int resto = 0;
        if(getAno() != 1970){
            if(getMes() == 1){
                resto = 31*24*60;
            } else if (getMes() == 2) {
                resto = (31+28)*24*60;
            } else if (getMes() == 3) {
                resto = (31+28+31)*24*60;
            } else if (getMes() == 4) {
                resto = (31+28+31+30)*24*60;
            } else if (getMes() == 5) {
                resto = (31+28+31+30+31)*24*60;
            } else if (getMes() == 6) {
                resto = (31+28+31+30+31+30)*24*60;
            } else if (getMes() == 7) {
                resto = (31+28+31+30+31+30+31)*24*60;
            } else if (getMes() == 8) {
                resto = (31+28+31+30+31+30+31+31)*24*60;
            } else if (getMes() == 9) {
                resto = (31+28+31+30+31+30+31+31+30)*24*60;
            } else if (getMes() == 10) {
                resto = (31+28+31+30+31+30+31+31+30+31)*24*60;
            } else if (getMes() == 11) {
                resto = (31+28+31+30+31+30+31+31+30+31+30)*24*60;
            } else if (getMes() == 12) {
                resto = (31+28+31+30+31+30+31+31+30+31+30+30)*24*60;
            }

        }

        return resto + minutos;
    }
}
