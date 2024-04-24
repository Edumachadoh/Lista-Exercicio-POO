package br.edu.up.modelos;

public class Livro {
    private String codigo;
    private String titulo;
    private String[] autores;
    private String isbn;
    private int ano;
    
    public Livro(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public Livro(String codigo, String titulo, String[] autores, String isbn) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
    }

    public Livro(String codigo, String titulo, String[] autores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
    }

    public Livro(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Livro(String codigo) {
        this.codigo = codigo;
    }

    public Livro() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        String stringAutores = "";
        for (int i = 0; i < autores.length; i ++) {
            stringAutores +=  autores[i] + "\n";
        }
        return stringAutores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
