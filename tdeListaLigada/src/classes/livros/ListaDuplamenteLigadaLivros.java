package classes.livros;

public class ListaDuplamenteLigadaLivros<T> {
    private NoLivro<Livro> inicio;
    private NoLivro<Livro> fim;
 
    public ListaDuplamenteLigadaLivros() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarLivro(Livro livro) {
        NoLivro<Livro> novoNo = new NoLivro<>(livro);
        if (inicio == null) {
        inicio = novoNo;
        fim = novoNo;
        } else {
        fim.proximo = novoNo;
        novoNo.anterior = fim;
        fim = novoNo;
        }
    }

    public void adicionarLivroInicio(Livro livro) {
        NoLivro<Livro> novoNo = new NoLivro<>(livro);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
      
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void removerLivro(int id) {
        if (inicio == null) return;

        NoLivro<Livro> atual = inicio;
        while (atual != null) {
            if (atual.livro.id == id) {
                if (atual == inicio) {
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                } 
				else if (atual == fim) {
                    fim = atual.anterior;
                    if (fim != null) fim.proximo = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    public boolean existeLivro(int id) {
        NoLivro<Livro> atual = inicio;
        while (atual != null) {
            if (atual.livro.equals(id)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void imprimirLista() {
        NoLivro<Livro> atual = inicio;
        while (atual != null) {
            System.out.println(atual.livro.titulo + atual.livro.autor);
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirListaInversa() {
        NoLivro<Livro> atual = fim;
        while (atual != null) {
            System.out.print(atual.livro.toString() + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}