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

    static void printCargasAereas(ArrayList<CargaAerea> cargaAerea){
        for (CargaAerea carga : cargaAerea){
            System.out.println("\n");
            System.out.println("Indice: " + cargaAerea.indexOf(carga));
            System.out.println(carga.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<CargaRodoviaria> cargaRodoviarias = new ArrayList<>();
        ArrayList<CargaAerea> cargaAereas = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        leia.useDelimiter("\\R");
        String escolha = null;
        int indice;
        double peso;
        String prioridadeEntrega, origem, destinacao, pais;

        do {
            System.out.println("""
                    
                    Transportadora
                    
                    1 - Adicionar Carga Rodoviaria
                    2 - Exibir Cargas Rodoviarias
                    3 - Editar Carga Rodoviaria
                    4 - Remover Carga Rodoviaria
                    
                    5 - Adicionar Carga Aerea
                    6 - Exibir Cargas Aereas
                    7 - Editar Carga Aerea
                    8 - Remover Carga Aerea
                    
                    Digite a letra "s" para sair.
                    
                    """);

            System.out.print("\n" + "Sua escolha: ");
            escolha = leia.next().toLowerCase();

            switch (escolha){
                //Adicionar Carga Rodoviaria
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
                    //exibir carga rodoviaria
                case "2":
                    printCargasRodoviarias(cargaRodoviarias);

                    break;
                    //editar carga rodoviaria
                case "3":
                    System.out.println("Editar Carga Rodoviária");
                    printCargasRodoviarias(cargaRodoviarias);

                    System.out.print("Entre com o indice para a edição: ");
                    indice = leia.nextInt();

                    System.out.print("Confirmar Edição? S/N: ");
                    escolha = leia.next().toLowerCase();

                    if(escolha.equals("s")) {
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

                    }else{
                        System.out.println("Cancelado!");
                    }

                    break;
                    //remover carga rodoviaria
                case "4":
                    System.out.println("Remover Carga Rodoviária");
                    printCargasRodoviarias(cargaRodoviarias);

                    System.out.print("Entre com o indice para a edição: ");
                    indice = leia.nextInt();

                    System.out.print("Confirmar Remoção? S/N: ");
                    escolha = leia.next().toLowerCase();

                    if(escolha.equals("s")) {
                        cargaRodoviarias.remove(indice);
                        System.out.println("Removido!");
                    }else{
                        System.out.println("Cancelado!");
                    }

                    break;
                    //cadastrar carga aerea
                case "5":
                    System.out.print("Peso: ");
                    peso = leia.nextDouble();
                    System.out.print("Prioridade entrega: ");
                    prioridadeEntrega = leia.next();
                    System.out.print("Origem: ");
                    origem = leia.next();
                    System.out.print("Destinação: ");
                    destinacao = leia.next();
                    System.out.print("País: ");
                    pais = leia.next();

                    CargaAerea cargaAerea = new CargaAerea(
                            peso,
                            prioridadeEntrega,
                            origem,
                            destinacao,
                            pais
                    );

                    cargaAereas.add(cargaAerea);

                    break;
                    //exibir carga aerea
                case "6":
                    printCargasAereas(cargaAereas);

                    break;
                    //editar carga aerea
                case "7":
                    System.out.println("Editar Carga Aerea");
                    printCargasAereas(cargaAereas);

                    System.out.print("Entre com o indice para a edição: ");
                    indice = leia.nextInt();

                    System.out.print("Confirmar Edição? S/N: ");
                    escolha = leia.next().toLowerCase();

                    if(escolha.equals("s")) {
                        System.out.print("Peso: ");
                        peso = leia.nextDouble();
                        System.out.print("Prioridade entrega: ");
                        prioridadeEntrega = leia.next();
                        System.out.print("Origem: ");
                        origem = leia.next();
                        System.out.print("Destinação: ");
                        destinacao = leia.next();
                        System.out.print("País: ");
                        pais = leia.next();

                        cargaAereas.get(indice).setPeso(peso);
                        cargaAereas.get(indice).setPrioridadeEntrega(prioridadeEntrega);
                        cargaAereas.get(indice).setOrigem(origem);
                        cargaAereas.get(indice).setDestinacao(destinacao);
                        cargaAereas.get(indice).setPais(pais);

                    }else{
                        System.out.println("Cancelado!");
                    }

                    break;
                    //remover carga aerea
                case "8":
                    System.out.println("Remover Carga Aerea");
                    printCargasAereas(cargaAereas);

                    System.out.print("Entre com o indice para a edição: ");
                    indice = leia.nextInt();

                    System.out.print("Confirmar Remoção? S/N: ");
                    escolha = leia.next().toLowerCase();

                    if(escolha.equals("s")) {
                        cargaAereas.remove(indice);
                        System.out.println("Removido!");
                    }else{
                        System.out.println("Cancelado!");
                    }

                    break;

            }
        }while (!escolha.equals("s"));
    }
}
