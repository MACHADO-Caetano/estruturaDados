package classes.pedidos;

import java.util.Scanner;

public class menuPedidos {
    public void menuPedidos() {
        Scanner scanner = new Scanner(System.in);
        
        FilaPedidosPendentes filaPedidosPendentes = new FilaPedidosPendentes(10);
        PilhaPedidosCancelados pilhaPedidosCancelados = new PilhaPedidosCancelados(10);

        boolean executar = true;
        
        try{
        while(executar){
            System.out.println("Selecione a execução do programa:");
            System.out.println("1 - Fazer pedido;");
            System.out.println("2 - Visualizar pedidos pendentes;");
            System.out.println("3 - Cancelar pedido;");
            System.out.println("4 - Visualizar pedidos cancelados;");
            System.out.println("5 - Desfazer cancelamento;");
            System.out.println("0 - Sair;");
            int opcao = scanner.nextInt();
            if(opcao == 0){
                System.out.println("Obrigado por utilizar nosso programa!");
                executar = false;
            }
            switch(opcao){
                case 1:
                    System.out.println("Nome do cliente:");
                    String nomeCliente = scanner.next();
                    System.out.println("Valor total do pedido:");
                    double valorTotal = scanner.nextDouble();
                    Pedidos pedido = new Pedidos(filaPedidosPendentes.tamanhoFilaPendentes() + 1, nomeCliente, valorTotal, "Pendente");
                    if(filaPedidosPendentes.enfileirar(pedido)){
                        System.out.println("Pedido feito com sucesso!");
                    } else {
                        System.out.println("Fila cheia! Não foi possível fazer o pedido.");
                    }
                    break;
                case 2:
                    System.out.println("Pedidos pendentes:");
                    if(filaPedidosPendentes.estaVazia()){
                        System.out.println("Nenhum pedido pendente.");
                    } else {
                        for(int i = 0; i < filaPedidosPendentes.tamanhoFilaPendentes(); i++){
                            Pedidos p = filaPedidosPendentes.pedidosPendentes[i];
                            System.out.println("ID: " + p.idPedido + ", Nome: " + p.nomeCliente + ", Valor: " + p.valorTotal + ", Status: " + p.status);
                        }
                    }
                    break;
                case 3:
                    if(filaPedidosPendentes.estaVazia()){
                        System.out.println("Nenhum pedido pendente para cancelar.");
                    } else {
                        Pedidos pedidoCancelado = filaPedidosPendentes.desenfileirar();
                        pedidoCancelado.status = "Cancelado";
                        if(pilhaPedidosCancelados.empilhar(pedidoCancelado)){
                            System.out.println("Pedido cancelado com sucesso!");
                        } else {
                            System.out.println("Pilha cheia! Não foi possível cancelar o pedido.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Pedidos cancelados:");
                    if(pilhaPedidosCancelados.estaVazia()){
                        System.out.println("Nenhum pedido cancelado.");
                    } else {
                        for(int i = 0; i < pilhaPedidosCancelados.tamanhoPilhaCancelados(); i++){
                            Pedidos p = pilhaPedidosCancelados.pedidosCancelados[i];
                            System.out.println("ID: " + p.idPedido + ", Nome: " + p.nomeCliente + ", Valor: " + p.valorTotal + ", Status: " + p.status);
                        }
                    }
                    break;
                case 5:
                    if(pilhaPedidosCancelados.estaVazia()){
                        System.out.println("Nenhum pedido cancelado para desfazer.");
                    } else {
                        Pedidos pedidoDesfeito = pilhaPedidosCancelados.desempilhar();
                        pedidoDesfeito.status = "Pendente";
                        if(filaPedidosPendentes.enfileirar(pedidoDesfeito)){
                            System.out.println("Cancelamento desfeito com sucesso!");
                        } else {
                            System.out.println("Fila cheia! Não foi possível desfazer o cancelamento.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            }
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
