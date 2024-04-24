package br.edu.up.controler;

import br.edu.up.modelos.Livro;

public class Menu {
    public static void executar() {
        String[] autores1 = {"Gustavo", "Alex"};
        Livro livro01 = new Livro("6666AA", "Rei Leão", autores1, "6643643634", 2010);
        
        livro01.setCodigo("1598FHK");
        livro01.setTitulo("Core Java 2");
        autores1[0] = "Cay S. Horstmann";
        autores1[1] = "Gary Cornell";
        livro01.setAutores(autores1);
        livro01.setIsbn("0130819336");
        livro01.setAno(2005);

        System.out.printf("Livro 01\n");
        System.out.printf("Código: %s\n", livro01.getCodigo());
        System.out.printf("Título: %s\n", livro01.getTitulo());
        System.out.printf("Autores: %s", livro01.getAutores());
        System.out.printf("ISBN: %s\n", livro01.getIsbn());
        System.out.printf("Ano: %s\n", livro01.getAno());
        
        String[] autores2 = {"Fabiano"};
        Livro livro02 = new Livro("6666AA", "Rei Leão", autores2, "6643643634", 2010);
        
        livro02.setCodigo("9865PLO");
        livro02.setTitulo("ava, How to Program");
        autores2[0] = "Harvey Deitel";
        livro02.setAutores(autores2);
        livro02.setIsbn("0130819336");
        livro02.setAno(2005);
        
        System.out.printf("\nLivro 02\n");
        System.out.printf("Código: %s\n", livro02.getCodigo());
        System.out.printf("Título: %s\n", livro02.getTitulo());
        System.out.printf("Autores: %s", livro02.getAutores());
        System.out.printf("ISBN: %s\n", livro02.getIsbn());
        System.out.printf("Ano: %s\n", livro02.getAno());
    }
}
