package classes.livros;

import java.util.Scanner;

public class MenuLivro {
    public void menuLivro() {
        Scanner scanner = new Scanner(System.in);
        
        ListaDuplamenteLigadaLivros listaDuplamenteLigadaLivros = new ListaDuplamenteLigadaLivros<>();
        boolean executar = true;
        

        while(executar){
            System.out.println("Selecione a execução do programa:");
            System.out.println("1 - Adicionar livro;");
            System.out.println("2 - Adicionar livro no início;");
            System.out.println("3 - Remover livro;");
            System.out.println("4 - Remover livro inicio;");
            System.out.println("5 - Pesquisar livro;");
            System.out.println("6 - Listar livros(Ordem original);");
            System.out.println("7 - Listar livros(Ordem inversa);");
            System.out.println("0 - Sair;");
            int opcao = scanner.nextInt();
            if(opcao == 0){
                System.out.println("Obrigado por utilizar nosso programa!");
                executar = false;
            }
            switch(opcao){
                case 1:
                    System.out.println("ID do livro:");
                    int id = scanner.nextInt();
                    System.out.println("Título do livro:");
                    String titulo = scanner.next();
                    System.out.println("Autor do livro:");
                    String autor = scanner.next();
                    Livro livro = new Livro(id, titulo, autor);
                    listaDuplamenteLigadaLivros.adicionarLivro(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("ID do livro:");
                    int idInicio = scanner.nextInt();
                    System.out.println("Título do livro:");
                    String tituloInicio = scanner.next();
                    System.out.println("Autor do livro:");
                    String autorInicio = scanner.next();
                    Livro livroInicio = new Livro(idInicio, tituloInicio, autorInicio);
                    listaDuplamenteLigadaLivros.adicionarLivroInicio(livroInicio);
                    System.out.println("Livro adicionado no início com sucesso!");
                    break;
                case 3:
                    System.out.println("ID do livro:");
                    int idRemover = scanner.nextInt();
                    if(!listaDuplamenteLigadaLivros.existeLivro(idRemover)){
                        System.out.println("Livro não encontrado!");
                        break;
                    }
                    listaDuplamenteLigadaLivros.removerLivro(idRemover);
                    System.out.println("Livro removido com sucesso!");
                    break;
                case 4:
                    System.out.println("ID do livro:");
                    int idRemoverInicio = scanner.nextInt();
                    if(!listaDuplamenteLigadaLivros.existeLivro(idRemoverInicio)){
                        System.out.println("Livro não encontrado!");
                        break;
                    }
                    listaDuplamenteLigadaLivros.removerLivro(idRemoverInicio);
                    System.out.println("Livro removido com sucesso!");
                    break;
                case 5:
                    System.out.println("ID do livro:");
                    int idPesquisar = scanner.nextInt();
                    if(!listaDuplamenteLigadaLivros.existeLivro(idPesquisar)){
                        System.out.println("Livro não encontrado!");
                        break;
                    }
                    System.out.println("Livro encontrado!");
                    break;
                case 6:
                    System.out.println("Livros na ordem original:");
                    listaDuplamenteLigadaLivros.imprimirLista();
                    break;
                case 7:
                    System.out.println("Livros na ordem inversa:");
                    listaDuplamenteLigadaLivros.imprimirListaInversa();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
