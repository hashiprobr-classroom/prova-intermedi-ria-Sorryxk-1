package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data) {
        this.data = data;
        this.hora = 0;
        this.minuto = 0;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public void atualiza(int novaHora, int novoMinuto){
        this.hora = ajusta(novaHora, 0, 23);
        this.minuto = ajusta(novoMinuto,0, 59);
    }
    @Override
    public int minutos(){
        int ateAno = data.getAno() - 1970;
        int dias = ateAno * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        int resto = 0;
        int totHora = 0;
        int totMin = 0;
        if(data.getAno() != 1970) {
            if (data.getMes() == 1) {
                resto = 31 * 24 * 60;
            } else if (data.getMes() == 2) {
                resto = (31 + 28) * 24 * 60;
            } else if (data.getMes() == 3) {
                resto = (31 + 28 + 31) * 24 * 60;
            } else if (data.getMes() == 4) {
                resto = (31 + 28 + 31 + 30) * 24 * 60;
            } else if (data.getMes() == 5) {
                resto = (31 + 28 + 31 + 30 + 31) * 24 * 60;
            } else if (data.getMes() == 6) {
                resto = (31 + 28 + 31 + 30 + 31 + 30) * 24 * 60;
            } else if (data.getMes() == 7) {
                resto = (31 + 28 + 31 + 30 + 31 + 30 + 31) * 24 * 60;
            } else if (data.getMes() == 8) {
                resto = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) * 24 * 60;
            } else if (data.getMes() == 9) {
                resto = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) * 24 * 60;
            } else if (data.getMes() == 10) {
                resto = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) * 24 * 60;
            } else if (data.getMes() == 11) {
                resto = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) * 24 * 60;
            } else if (data.getMes() == 12) {
                resto = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 30) * 24 * 60;
            }
        }

        totHora = (getHora())*60;
        totMin = (getMinuto());

        return (resto + minutos + totHora + totMin) ;
    }
}
