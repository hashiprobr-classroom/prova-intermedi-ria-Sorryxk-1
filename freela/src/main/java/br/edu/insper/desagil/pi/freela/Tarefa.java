package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    //id, descricao, inicio, fim
    //metodos: atualiza
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public Momento getInicio() {
        return inicio;
    }
    public Momento getFim() {
        return fim;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //atualiza
    public void atualiza(Momento novoInicio, Momento novoFim){
        if(novoInicio.minutos()> novoFim.minutos()){
            throw new IllegalArgumentException("Vixi");
        }
        this.inicio = novoInicio;
        this.fim = novoFim;

    }
}
