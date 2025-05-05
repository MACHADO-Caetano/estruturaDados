import java.util.Scanner;

import classes.listaLigada.menuListaLigada;
import classes.pedidos.menuPedidos;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione a execução do programa:");
        System.out.println("1 - Lista Ligada;");
        System.out.println("2 - Fila de Pedidos;");
        System.out.println("0 - Sair;");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                menuListaLigada menuLista = new menuListaLigada();
                menuLista.menu();
                break;
            case 2:
                menuPedidos menuPedidos = new menuPedidos();
                menuPedidos.menuPedidos();
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
