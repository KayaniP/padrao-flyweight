package main.java;

public class Livro {

    private String nome;
    private Editora editoraPublicacao;

    public Livro(String nome, Editora editoraPublicacao) {
        this.nome = nome;
        this.editoraPublicacao = editoraPublicacao;
    }

    public String obterLivro() {
        return "Livro{" +
                "nome='" + this.nome + '\'' +
                ", localPublicacao='" + editoraPublicacao.getNome() + '\'' +
                '}';
    }
}
