package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    // Essa classe conteúdo é para implementar as classes filhas (herança)

    protected static final double XP_PADRAO = 10d;

    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    // inserindo metodos get e set

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
