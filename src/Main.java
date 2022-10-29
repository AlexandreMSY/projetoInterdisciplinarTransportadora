import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void printCargasRodoviarias(ArrayList<CargaRodoviaria> cargaRodoviarias){
        for (CargaRodoviaria carga : cargaRodoviarias){
            System.out.println("\n");
            System.out.println("Indice: " + cargaRodoviarias.indexOf(carga));
            System.out.println(carga.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<CargaRodoviaria> cargaRodoviarias = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        leia.useDelimiter("\\R");
        String escolha = null;
        int indice;
        double peso;
        String prioridadeEntrega, origem, destinacao;

        do {
            System.out.println("""
                    \n
                    
                    Transportadora
                    
                    1 - Adicionar Carga Rodoviaria
                    2 - Exibir Cargas Rodoviarias
                    3 - Editar Carga Rodoviaria
                    
                    """);

            System.out.print("\n" + "Sua escolha: ");
            escolha = leia.next().toLowerCase();

            switch (escolha){
                case "1":
                    System.out.print("Peso: ");
                    peso = leia.nextDouble();
                    System.out.print("Prioridade entrega: ");
                    prioridadeEntrega = leia.next();
                    System.out.print("Origem: ");
                    origem = leia.next();
                    System.out.print("Destinação: ");
                    destinacao = leia.next();

                    CargaRodoviaria cargaRodoviaria = new CargaRodoviaria(
                            peso,
                            prioridadeEntrega,
                            origem,
                            destinacao
                    );

                    cargaRodoviarias.add(cargaRodoviaria);

                    break;

                case "2":
                    printCargasRodoviarias(cargaRodoviarias);

                    break;

                case "3":
                    System.out.println("Editar Carga Rodoviária");
                    printCargasRodoviarias(cargaRodoviarias);

                    System.out.print("Entre com o indice para a edição: ");
                    indice = leia.nextInt();

                    System.out.print("Peso: ");
                    peso = leia.nextDouble();
                    System.out.print("Prioridade entrega: ");
                    prioridadeEntrega = leia.next();
                    System.out.print("Origem: ");
                    origem = leia.next();
                    System.out.print("Destinação: ");
                    destinacao = leia.next();

                    cargaRodoviarias.get(indice).setPeso(peso);
                    cargaRodoviarias.get(indice).setPrioridadeEntrega(prioridadeEntrega);
                    cargaRodoviarias.get(indice).setOrigem(origem);
                    cargaRodoviarias.get(indice).setDestinacao(destinacao);

                    break;
            }
        }while (!escolha.equals("sair"));
    }
}
