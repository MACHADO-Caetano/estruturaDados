package tdePilhasFilas;

import java.util.ArrayList;

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
        ExecutarTexto editorTexto = new ExecutarTexto();
        editorTexto.digitar("Teste de mensagem de texto");
        System.out.println("Teste execução");
    }
}
