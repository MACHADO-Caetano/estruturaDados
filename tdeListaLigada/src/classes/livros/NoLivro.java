package classes.livros;

class NoLivro<Livro> {
    Livro livro;
    NoLivro<Livro> anterior;
    NoLivro<Livro> proximo;
 
    public NoLivro(Livro livro) {
        this.livro = livro;
        this.anterior = null;
        this.proximo = null;
    }
 }