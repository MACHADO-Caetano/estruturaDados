public class ListaLigada {
    public class No {
        public int elemento;
        public No proximo;
    
        public No(int elemento){
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private No inicio;

    public ListaLigada() {
        this.inicio = null;
    }


    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        if (this.inicio == null) {
            this.inicio = novoNo;
        } else {
            No noAtual = inicio;
            while (noAtual.proximo != null) {
                noAtual = noAtual.proximo;
            }
            noAtual.proximo = novoNo;
        }
    }

    public void remover(int elemento) {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
    
        if (inicio.elemento == elemento) {
            inicio = inicio.proximo;
            return;
        }
    
        No atual = inicio;
        No anterior = null;
    
        while (atual != null && atual.elemento != elemento) {
            anterior = atual;
            atual = atual.proximo;
        }
    
        if (atual == null) {
            System.out.println("Elemento não encontrado.");
            return;
        }
    
        anterior.proximo = atual.proximo;
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
    
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void inserirInicio(int novoElemento){
        No novoNoInicio = new No(novoElemento);
        if (this.inicio != null) {
            this.inicio = novoNoInicio;
        } else {
            No noAtual = inicio;
            while (noAtual.proximo != null) {
                noAtual = noAtual.proximo;
            }
            noAtual.proximo = novoNoInicio;
        }

        //terminar em casa

    }
}
