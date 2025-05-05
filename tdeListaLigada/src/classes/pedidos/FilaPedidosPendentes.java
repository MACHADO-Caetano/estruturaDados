package classes.pedidos;

public class FilaPedidosPendentes {
    Pedidos [] pedidosPendentes;

    private int tamanhoFilaPendentes;

    public FilaPedidosPendentes(int capacidade){
	    this.pedidosPendentes = new Pedidos[capacidade];
	    this.tamanhoFilaPendentes = 0;
    }

    public int tamanhoFilaPendentes(){
        return tamanhoFilaPendentes;
    }
    
    public boolean estaVazia(){
        return tamanhoFilaPendentes == 0;
    }
    
    public boolean estaCheia(){
        return tamanhoFilaPendentes == this.pedidosPendentes.length;
    }

    public boolean enfileirar(Pedidos e){

        if(!estaCheia()){
            this.pedidosPendentes[tamanhoFilaPendentes] = e;
            tamanhoFilaPendentes ++;
    
            return true;
        }
        return false;
    
    }

    public Pedidos desenfileirar(){

        if(!estaVazia()){
    
            Pedidos elementoRemovido = this.pedidosPendentes[0];
            for(int i = 1; i < tamanhoFilaPendentes; i++){
                pedidosPendentes[i - 1] = pedidosPendentes[i];
            }
    
            tamanhoFilaPendentes--;
            return elementoRemovido;
        }
    
        return null;
    };

    public Pedidos visualizarLista(){

        if(!estaVazia()){
            return this.pedidosPendentes[0];
        }
        
        return null;
    };
}
