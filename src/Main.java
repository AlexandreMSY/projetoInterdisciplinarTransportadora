import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CargaRodoviaria> cargaRodoviarias = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        leia.useDelimiter("\\R");
        String escolha = null;
        double peso;
        String prioridadeEntrega, origem, destinacao;

        do {
            System.out.println("""
                    \n
                    
                    Transportadora
                    
                    1 - Adicionar Carga Rodoviaria
                    2 - Exibir Cargas Rodoviarias
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
                    for (CargaRodoviaria carga : cargaRodoviarias){
                        System.out.println("\n");
                        System.out.println("Indice: " + cargaRodoviarias.indexOf(carga));
                        System.out.println(carga.toString());
                    }

                    break;
            }
        }while (!escolha.equals("sair"));
    }
}
