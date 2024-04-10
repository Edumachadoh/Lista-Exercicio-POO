package br.edu.up.modelos;

public class Biblioteca {
    private String codigo;
    private String titulo;
    private String[] autores;
    private String isbn;
    private int ano;
    
    public Biblioteca(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public Biblioteca(String codigo, String titulo, String[] autores, String isbn) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
    }

    public Biblioteca(String codigo, String titulo, String[] autores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
    }

    public Biblioteca(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Biblioteca(String codigo) {
        this.codigo = codigo;
    }

    public Biblioteca() {
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

    public String[] getAutores() {
        return autores;
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
