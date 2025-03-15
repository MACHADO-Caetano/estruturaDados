package tde2;

import java.util.Scanner;

class Vetor{
    private String [] elementos;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];

    }

    public void adicionarItemPosicao(int posicao, String elemento){
        elementos[posicao] = elemento;
    }

    public String obterElemento(int posicao){
        return elementos[posicao];
    }

    public int tamanhoAtual(){
        return elementos.length;
    }

}

public class SistemaVetor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de posições do array: ");

        int capacidade = scanner.nextInt();

        Vetor vetor = new Vetor(capacidade);

    //     vetor.adicionarItemPosicao(0, "teste");

    //     System.out.println("Elemento: " + vetor.obterElemento(0));

    //     System.out.println("Elemento: " + vetor.tamanhoAtual());

    while(true){
       
        System.out.println("Menu");
        System.out.println("1: Adicionar elemento na posição");
        System.out.println("2: Obter elemento");
        
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe a posição");
                int posicao = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Informe o elemento");
                String elemento = scanner.nextLine();
                vetor.adicionarItemPosicao(posicao,elemento);                
                break;
            
            case 2:
                System.out.println("Informe a posição");
                int posicaoG = scanner.nextInt();
                scanner.nextLine();
                    
                System.out.println("Valor: " + vetor.obterElemento(posicaoG));
            default:
                break;
        }
    }
}



}