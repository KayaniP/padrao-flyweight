package main.java;

import java.util.HashMap;
import java.util.Map;

public class EditoraFactory {
    private static Map<String, Editora> editoras = new HashMap<>();

    public static Editora getEditora(String nome, String localPublicacao) {
        Editora editora = editoras.get(nome);
        if (editora == null) {
            editora = new Editora(nome, localPublicacao);
            editoras.put(nome, editora);
        }
        return editora;
    }

    public static int getTotalEditoras() {
        return editoras.size();
    }

}


