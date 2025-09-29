package br.edu.insper.desagil.pi.freela;

public class Momento {
    public int ajusta(int valor, int min, int max){
        if(valor<min){
            return min;
        } else if (valor> max) {
            return max;

        }
        return valor;
    }
    public int minutos(){
        int b = 0;
        return b;
    }
}
