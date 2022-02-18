package br.com.dio;

import java.util.Objects;

public class Livro {
    private String assunto;
    private String titulo;
    private String autor;
    private Integer quantidadePaginas;
    private Integer isbn;
    private String editora;

    public Livro(String assunto, String titulo, String autor, Integer quantidadePaginas, Integer isbn, String editora) {
        this.assunto = assunto;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
        this.isbn = isbn;
        this.editora = editora;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(Integer quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(assunto, livro.assunto) && Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor) && Objects.equals(quantidadePaginas, livro.quantidadePaginas) && Objects.equals(isbn, livro.isbn) && Objects.equals(editora, livro.editora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assunto, titulo, autor, quantidadePaginas, isbn, editora);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "assunto='" + assunto + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", quantidadePaginas=" + quantidadePaginas +
                ", isbn=" + isbn +
                ", editora='" + editora + '\'' +
                '}';
    }
}
