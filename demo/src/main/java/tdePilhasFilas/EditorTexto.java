package tdePilhasFilas;

import java.util.ArrayList;
import java.util.Scanner;

class ExecutarTexto {

    private ArrayList<String> historico = new ArrayList<>();
    
    public void digitar(String texto){
        historico.add(texto);
    }

    public void desfazer(){
        if(!historico.isEmpty()){
            historico.remove(historico.size() -1);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public void mostrarTextoAtual(){
        for(String texto : historico){
            System.out.println(texto);
        }
    }
}

public class EditorTexto{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ExecutarTexto editorTexto = new ExecutarTexto();
        while (true){
            System.out.println("Editor de texto!");
            System.out.println("Digite 1 para inserir um texto");
            System.out.println("Digite 2 para apagar o último texto inserido");
            System.out.println("Digite 3 para mostrar o texto inserido");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Inserir: \n");
                    String textoParaInserir = scanner.nextLine();
                    editorTexto.digitar(textoParaInserir);
                    editorTexto.mostrarTextoAtual();
                    break;
            
                default:
                    System.out.println("Final do programa");
                    break;
            }
        }
    }
}
