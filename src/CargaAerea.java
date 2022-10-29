public class CargaAerea extends Carga{
    private String pais;

    public CargaAerea(double peso, String prioridadeEntrega, String origem, String destinacao, String pais) {
        super(peso, prioridadeEntrega, origem, destinacao);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        String detalhes = "Peso: " + this.getPeso() + "\n" +
                "Prioridade Entrega: " + this.getPrioridadeEntrega() + "\n" +
                "Origem: " + this.getOrigem() + "\n" +
                "Destinação: " + this.getDestinacao() + "\n" +
                "País: " + this.pais;

        return detalhes;
    }
}
