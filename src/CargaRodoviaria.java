public class CargaRodoviaria extends Carga{

    public CargaRodoviaria(double peso, String prioridadeEntrega, String origem, String destinacao) {
        super(peso, prioridadeEntrega, origem, destinacao);
    }

    @Override
    public String toString(){
        String detalhes = "Peso: " + this.getPeso() + "\n" +
                "Prioridade Entrega: " + this.getPrioridadeEntrega() + "\n" +
                "Origem: " + this.getOrigem() + "\n" +
                "Destinação: " + this.getDestinacao();

        return detalhes;
    }
}
