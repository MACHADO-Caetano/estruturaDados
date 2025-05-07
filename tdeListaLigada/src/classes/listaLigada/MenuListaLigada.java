package classes.listaLigada;

import java.util.Scanner;

public class MenuListaLigada {
    public void menu() {
        ListaLigada lista = new ListaLigada();
        Scanner scanner = new Scanner(System.in);
        Boolean executar = true;
        try{
            while(executar){
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Criar uma lista ligada / Inserir um valor (se já tiver criado uma lista);");
                System.out.println("2 - Remover um valor da lista ligada;");
                System.out.println("3 - Mostrar lista ligada;");
                System.out.println("4 - Reatribuir um valor ao início da lista");
                System.out.println("5 - Verificar um valor na lista;");
                System.out.println("0 - Encerrar o programa;");
                int opcao = scanner.nextInt();
    
                if(opcao == 0){
                    System.out.println("Obrigado por utilizar nosso programa!");
                    executar = false;
                }
    
                switch(opcao){
                    case 1:
                        System.out.println("Insira um valor na lista:");
                        int valorInserir = scanner.nextInt();
                        lista.inserir(valorInserir);
                        System.out.println("Valor " + valorInserir + " foi devidamente inserido");
                        break;
                    case 2:
                        System.out.println("Informe o valor para remoção da lista:");
                        int valorDeletar = scanner.nextInt();
                        lista.remover(valorDeletar);
                        break;
                    case 3:
                        lista.exibir();
                        break;
                    case 4:
                        System.out.println("Informe o valor para inserir ao início da lista:");
                        int valorInserirInicio = scanner.nextInt();
                        lista.inserirNoInicio(valorInserirInicio);
                        System.out.println("Valor inserido devidamente");
                        break;
                    case 5:
                        System.out.println("Informe o valor para buscar na lista:");
                        int valorBuscar = scanner.nextInt();
                        if(lista.buscarElemento(valorBuscar)){
                            System.out.println("O valor selecionado existe na lista");
                            break;
                        }
                        System.out.println("O valor não existe na lista");
                        break;
                    default:
                        break;
                }
            }
        }
        catch(Exception InputMismatchException){
            System.out.println("Erro: Entrada inválida. Tente novamente.");
        }
    }
}
