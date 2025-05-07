import java.util.Scanner;

import classes.listaLigada.MenuListaLigada;
import classes.pedidos.MenuPedidos;
import classes.livros.MenuLivro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione a execução do programa:");
        System.out.println("1 - Lista Ligada;");
        System.out.println("2 - Fila de Pedidos;");
        System.out.println("3 - Lista de Livros;");
        System.out.println("0 - Sair;");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                MenuListaLigada menuLista = new MenuListaLigada();
                menuLista.menu();
                break;
            case 2:
                MenuPedidos menuPedidos = new MenuPedidos();
                menuPedidos.menuPedidos();
                break;
            case 3:
                MenuLivro menuLivro = new classes.livros.MenuLivro();
                menuLivro.menuLivro();
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
