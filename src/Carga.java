abstract public class Carga {
    private double peso;
    private String prioridadeEntrega;
    private String origem;
    private String destinacao;

    public Carga(double peso, String prioridadeEntrega, String origem, String destinacao) {
        this.peso = peso;
        this.prioridadeEntrega = prioridadeEntrega;
        this.origem = origem;
        this.destinacao = destinacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPrioridadeEntrega() {
        return prioridadeEntrega;
    }

    public void setPrioridadeEntrega(String prioridadeEntrega) {
        this.prioridadeEntrega = prioridadeEntrega;
    }


    public String getOrigem() {
        return origem;
    }


    public void setOrigem(String origem) {
        this.origem = origem;
    }


    public String getDestinacao() {
        return destinacao;
    }


    public void setDestinacao(String destinacao) {
        this.destinacao = destinacao;
    }

    abstract public String toString();

}
