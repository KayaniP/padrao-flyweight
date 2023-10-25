package main.java;

import java.util.ArrayList;
import java.util.List;

public class Livraria{

    private List<Livro> livros = new ArrayList<>();

    public void cadastrar (String nomeLivro, String nomeEditora, String localPublicacao) {
        Editora editora = EditoraFactory.getEditora(nomeEditora, localPublicacao);
        Livro livro = new Livro(nomeLivro, editora);
        livros.add(livro);
    }

    public List <String> obterLivros(){
        List<String> cadastro = new ArrayList<String>();
        for (Livro livro : this.livros){
            cadastro.add(livro.obterLivro());
        }
        return cadastro;
    }
}