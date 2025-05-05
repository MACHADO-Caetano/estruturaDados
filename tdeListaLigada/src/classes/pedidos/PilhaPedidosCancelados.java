package classes.pedidos;

public class PilhaPedidosCancelados {
    Pedidos[] pedidosCancelados;

    private int tamanhoPilhaCancelados;

    public PilhaPedidosCancelados(int capacidade){
        this.pedidosCancelados = new Pedidos[capacidade];
        this.tamanhoPilhaCancelados = 0;
    }

    public int tamanhoPilhaCancelados() {
        return tamanhoPilhaCancelados;
    }

    public boolean estaVazia() {
        return tamanhoPilhaCancelados == 0;
    }

    public boolean estaCheia() {
        return tamanhoPilhaCancelados == pedidosCancelados.length;
    }

    public boolean empilhar(Pedidos e){

        if(!estaCheia()){
        
            this.pedidosCancelados[tamanhoPilhaCancelados] = e;
            
            tamanhoPilhaCancelados ++;
            return true;
        }
        return false;
    }

    public Pedidos desempilhar(){

        if(!estaVazia()){
        
            tamanhoPilhaCancelados--;
            return this.pedidosCancelados[tamanhoPilhaCancelados];
        }
        
        return null;
    };

    public Pedidos visualizarTopo(){

        if(!estaVazia()){
            return this.pedidosCancelados[tamanhoPilhaCancelados - 1];
        }
        return null;
    };
}