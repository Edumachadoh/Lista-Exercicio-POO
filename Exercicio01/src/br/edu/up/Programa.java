package br.edu.up;
import br.edu.up.modelos.Biblioteca;

public class Programa {
    public static void main(String[] args) {
        
        String[] autores1 = {"João", "Pedro"};
        Biblioteca livro01 = new Biblioteca("6666AA", "Rei Leão", autores1, "6643643634", 2010);
        
        livro01.setCodigo("1598FHK");
        livro01.setTitulo("Core Java 2");
        autores1[0] = "Cay S. Horstmann";
        autores1[1] = "Gary Cornell";
        livro01.setAutores(autores1);
        livro01.setIsbn("0130819336");
        livro01.setAno(2005);
        
        String[] autores2 = {"João", "Pedro"};
        Biblioteca livro02 = new Biblioteca("6666AA", "Rei Leão", autores, "6643643634", 2010);
        
        livro02.setCodigo("9865PLO");
        livro02.setTitulo("ava, How to Program");
        autores2[0] = "Harvey Deitel";
        livro02.setAutores(autores2);
        livro02.setIsbn("0130819336");
        livro02.setAno(2005);
        
        System.out.printf("Livro 01\n");
        System.out.printf("Código: %s\n", livro01.getCodigo());
        System.out.printf("Título: %s\n", livro01.getTitulo());
        System.out.printf("Autores: %s\n", livro01.getAutores());
        System.out.printf("ISBN: %s\n", livro01.getIsbn());
        System.out.printf("Ano: %s\n", livro01.getAno());



    }
}
